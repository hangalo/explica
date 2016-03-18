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
public class AreaDisciplina implements Serializable{
    private int codigoAreaDisciplina;
    private String nomeAreaDisciplina;

    public AreaDisciplina() {
    }

    public AreaDisciplina(int codigoAreaDisciplina, String nomeAreaDisciplina) {
        this.codigoAreaDisciplina = codigoAreaDisciplina;
        this.nomeAreaDisciplina = nomeAreaDisciplina;
    }

    public int getCodigoAreaDisciplina() {
        return codigoAreaDisciplina;
    }

    public void setCodigoAreaDisciplina(int codigoAreaDisciplina) {
        this.codigoAreaDisciplina = codigoAreaDisciplina;
    }

    public String getNomeAreaDisciplina() {
        return nomeAreaDisciplina;
    }

    public void setNomeAreaDisciplina(String nomeAreaDisciplina) {
        this.nomeAreaDisciplina = nomeAreaDisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigoAreaDisciplina;
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
        final AreaDisciplina other = (AreaDisciplina) obj;
        if (this.codigoAreaDisciplina != other.codigoAreaDisciplina) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AreaDisciplina{" + "codigoAreaDisciplina=" + codigoAreaDisciplina + '}';
    }
    
    
    
}
