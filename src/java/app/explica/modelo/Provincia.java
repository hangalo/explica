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
public class Provincia implements Serializable{
    private int codigoProvincia;
    private String nomeProvincia;

    public Provincia() {
    }

    public Provincia(int codigoProvincia, String nomeProvincia) {
        this.codigoProvincia = codigoProvincia;
        this.nomeProvincia = nomeProvincia;
    }

    public int getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getNomeProvincia() {
        return nomeProvincia;
    }

    public void setNomeProvincia(String nomeProvincia) {
        this.nomeProvincia = nomeProvincia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.codigoProvincia;
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
        final Provincia other = (Provincia) obj;
        if (this.codigoProvincia != other.codigoProvincia) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Provincia{" + "codigoProvincia=" + codigoProvincia + '}';
    }
    
    
}
