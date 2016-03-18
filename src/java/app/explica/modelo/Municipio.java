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
public class Municipio {
    private int codigoMunicipio;
    private String nomeMunicipio;
    private Provincia provincia;

    public Municipio() {
    }

    public Municipio(int codigoMunicipio, String nomeMunicipio, Provincia provincia) {
        this.codigoMunicipio = codigoMunicipio;
        this.nomeMunicipio = nomeMunicipio;
        this.provincia = provincia;
    }

    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.codigoMunicipio;
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
        final Municipio other = (Municipio) obj;
        if (this.codigoMunicipio != other.codigoMunicipio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Municipio{" + "codigoMunicipio=" + codigoMunicipio + '}';
    }
    
    
    
    
}
