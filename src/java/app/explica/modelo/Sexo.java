/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.explica.modelo;

/**
 *
 * @author praveen
 */
public class Sexo {
    private int codigoSexo;
    private String nomeSexo;

    public Sexo() {
    }

    public Sexo(int codigoSexo, String nomeSexo) {
        this.codigoSexo = codigoSexo;
        this.nomeSexo = nomeSexo;
    }

    public int getCodigoSexo() {
        return codigoSexo;
    }

    public void setCodigoSexo(int codigoSexo) {
        this.codigoSexo = codigoSexo;
    }

    public String getNomeSexo() {
        return nomeSexo;
    }

    public void setNomeSexo(String nomeSexo) {
        this.nomeSexo = nomeSexo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.codigoSexo;
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
        final Sexo other = (Sexo) obj;
        if (this.codigoSexo != other.codigoSexo) {
            return false;
        }
        return true;
    }
    
    
    
}
