/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.explica.modelo;

import java.io.Serializable;

/**
 *
 * @author praveen
 */
public class Disciplina implements Serializable{
    private int codigoDisciplina;
    private String nomeDisciplina;
    private AreaDisciplina areaDisciplina;

    public Disciplina() {
    }

    public Disciplina(int codigoDisciplina, String nomeDisciplina, AreaDisciplina areaDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.areaDisciplina = areaDisciplina;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public AreaDisciplina getAreaDisciplina() {
        return areaDisciplina;
    }

    public void setAreaDisciplina(AreaDisciplina areaDisciplina) {
        this.areaDisciplina = areaDisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigoDisciplina;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (this.codigoDisciplina != other.codigoDisciplina) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "codigoDisciplina=" + codigoDisciplina + '}';
    }
    
    
}
