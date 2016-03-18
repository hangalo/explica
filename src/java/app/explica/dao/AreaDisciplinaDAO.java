/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.explica.dao;

import app.explica.modelo.AreaDisciplina;
import app.explica.util.ConexaoDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author desenvolvimento
 */
public class AreaDisciplinaDAO extends ConexaoDB {

    private static final String INSERIR = "INSERT INTO area_disciplina(nome_area_disciplina) VALUES(?)";
    private static final String ACTUALIZAR = "UPDATE area_disciplina SET  nome_area_disciplina=? WHERE codigo_area_disciplina=?";
    private static final String ELIMINAR = "DELETE FROM area_disciplina WHERE codigo_area_disciplina=?";
    private static final String LISTAR_TUDO = "SELECT * FROM area_disciplina";
    private static final String LISTAR_POR_CODIGO = "SELECT * FROM area_disciplina WHERE codigo_area_disciplina = ?";

    public AreaDisciplinaDAO() {
        super();
    }

    public boolean guardar(AreaDisciplina areaDisciplina){

        int retorno = 0;
        PreparedStatement ps;
        try {
            ps = getPreparedStatement(INSERIR);
            ps.setString(1, areaDisciplina.getNomeAreaDisciplina());
            retorno = ps.executeUpdate();
            ps.close();

        } catch (ClassNotFoundException | SQLException exception) {
            System.err.println("Erro ao inserir os dados: " + exception.getLocalizedMessage());
        }
        return retorno > 0;
    }

    public boolean actualizar(AreaDisciplina areaDisciplina) {
        int retorno = 0;
        PreparedStatement ps;
        try {
            ps = getPreparedStatement(ACTUALIZAR);
            ps.setString(1, areaDisciplina.getNomeAreaDisciplina());

            ps.setInt(2, areaDisciplina.getCodigoAreaDisciplina());
            retorno = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException | SQLException exception) {
            System.err.println("Erro ao actualizar os dados: " + exception.getLocalizedMessage());
        }
        return retorno > 0;
    }

    public boolean eliminar(AreaDisciplina areaDisciplina) {
        int retorno = 0;
        PreparedStatement ps;
        try {

            ps = getPreparedStatement(ELIMINAR);
            ps.setInt(1, areaDisciplina.getCodigoAreaDisciplina());
            retorno = ps.executeUpdate();
            ps.close();
        } catch (ClassNotFoundException | SQLException exception) {
            System.err.println("Erro ao eliminar os dados: " + exception.getLocalizedMessage());
        }
        return retorno > 0;
    }

    public List<AreaDisciplina> buscarTudo() throws SQLException, ClassNotFoundException {
        List<AreaDisciplina> areaDisciplinas = new LinkedList<>();

        try {
            ResultSet rs = getStatement().executeQuery(LISTAR_TUDO);
            while (rs.next()) {
                AreaDisciplina areaDisciplina = new AreaDisciplina();
                popularComDados(areaDisciplina, rs);
                areaDisciplinas.add(areaDisciplina);
            }
            rs.close();
        } catch (ClassNotFoundException | SQLException exception) {
            System.err.println("Erro ao listar os dados: " + exception.getLocalizedMessage());
        }
        return areaDisciplinas;
    }

    public AreaDisciplina buscarPorCodigo(int codigo) throws SQLException, ClassNotFoundException {

        PreparedStatement ps;
        AreaDisciplina areaDisciplina = null;
        ResultSet rs;
        try {
            ps = getPreparedStatement(LISTAR_POR_CODIGO);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (!rs.next()) {
                return null;
            }
            areaDisciplina = new AreaDisciplina();
            popularComDados(areaDisciplina, rs);
            rs.close();
            ps.close();

        } catch (ClassNotFoundException | SQLException exception) {
            System.err.println("Erro ao listar os dados: " + exception.getLocalizedMessage());
        }

        return areaDisciplina;
    }

    private void popularComDados(AreaDisciplina areaDisciplina, ResultSet rs) {
        try {
            areaDisciplina.setCodigoAreaDisciplina(rs.getInt("codigo_area_disciplina"));
            areaDisciplina.setNomeAreaDisciplina(rs.getString("nome_area_disciplina"));
        } catch (SQLException sQLException) {
            System.err.println("Erro ao carregar dados: " + sQLException.getLocalizedMessage());

        }

    }
}
