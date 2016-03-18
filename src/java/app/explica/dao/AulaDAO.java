/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.explica.dao;

import app.explica.util.ConexaoDB;

/**
 *
 * @author praveen
 */
public class AulaDAO extends ConexaoDB {

    private static final String INSERIR = "INSERT INTO aula(data_aula, hora_aula, codigo_explicacao, codigo_professor, casa_aula, rua_aula, bairro_aula, codigo_municipio) VALUES(?,?,?,?,?,?,?,?)";
    private static final String ACTUALIZAR = "UPDATE aula SET  data_aula=?, hora_aula=?, codigo_explicacao=?, codigo_professor=?, casa_aula=?, rua_aula=?, bairro_aula=?, codigo_municipio=? WHERE codigo_aula=?";
    private static final String ELIMINAR = "DELETE FROM aula WHERE codigo_aula=?";
    private static final String LISTAR_TUDO = "SELECT a.codigo_aula, a.data_aula, a.hora_aula, e.codigo_explicacao, p.nome_professor, a.casa_aula, a.rua_aula, a.bairro_aula, m.nome_municipio FROM aula a INNER JOIN explicacao e ON a.codigo_explicacao =  e.codigo_explicacao INNER JOIN professor p ON a.codigo_professor=p.codigo_professor INNER JOIN municipio m ON a.codigo_municipio=m.codigo_municipio";
    private static final String LISTAR_POR_CODIGO = "SELECT a.codigo_aula, a.data_aula, a.hora_aula, e.codigo_explicacao, p.nome_professor, a.casa_aula, a.rua_aula, a.bairro_aula, m.nome_municipio FROM aula a INNER JOIN explicacao e ON a.codigo_explicacao =  e.codigo_explicacao INNER JOIN professor p ON a.codigo_professor=p.codigo_professor INNER JOIN municipio m ON a.codigo_municipio=m.codigo_municipio WHERE codigo_aula = ?";

    
}
