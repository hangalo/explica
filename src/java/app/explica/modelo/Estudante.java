/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.explica.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author praveen
 */
public class Estudante implements Serializable{
    private int codigoEstudante;
    private String nomeEstudante;
    private String sobrenomeEstudante;
    private Date dataNascimentoEstudante;
    private String emailEstudante;
    private String senhaEstudante;
    private String confirmaSenhaEstudante;
    private String casaEstudante;
    private String ruaEstudante;
    private String bairroEstudante;
    private Sexo sexo;
    private Municipio municipio;

    public Estudante() {
    }

    public Estudante(int codigoEstudante, String nomeEstudante, String sobrenomeEstudante, Date dataNascimentoEstudante, String emailEstudante, String senhaEstudante, String confirmaSenhaEstudante, String casaEstudante, String ruaEstudante, String bairroEstudante, Sexo sexo, Municipio municipio) {
        this.codigoEstudante = codigoEstudante;
        this.nomeEstudante = nomeEstudante;
        this.sobrenomeEstudante = sobrenomeEstudante;
        this.dataNascimentoEstudante = dataNascimentoEstudante;
        this.emailEstudante = emailEstudante;
        this.senhaEstudante = senhaEstudante;
        this.confirmaSenhaEstudante = confirmaSenhaEstudante;
        this.casaEstudante = casaEstudante;
        this.ruaEstudante = ruaEstudante;
        this.bairroEstudante = bairroEstudante;
        this.sexo = sexo;
        this.municipio = municipio;
    }

    public int getCodigoEstudante() {
        return codigoEstudante;
    }

    public void setCodigoEstudante(int codigoEstudante) {
        this.codigoEstudante = codigoEstudante;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getSobrenomeEstudante() {
        return sobrenomeEstudante;
    }

    public void setSobrenomeEstudante(String sobrenomeEstudante) {
        this.sobrenomeEstudante = sobrenomeEstudante;
    }

    public Date getDataNascimentoEstudante() {
        return dataNascimentoEstudante;
    }

    public void setDataNascimentoEstudante(Date dataNascimentoEstudante) {
        this.dataNascimentoEstudante = dataNascimentoEstudante;
    }

    public String getEmailEstudante() {
        return emailEstudante;
    }

    public void setEmailEstudante(String emailEstudante) {
        this.emailEstudante = emailEstudante;
    }

    public String getSenhaEstudante() {
        return senhaEstudante;
    }

    public void setSenhaEstudante(String senhaEstudante) {
        this.senhaEstudante = senhaEstudante;
    }

    public String getConfirmaSenhaEstudante() {
        return confirmaSenhaEstudante;
    }

    public void setConfirmaSenhaEstudante(String confirmaSenhaEstudante) {
        this.confirmaSenhaEstudante = confirmaSenhaEstudante;
    }

    public String getCasaEstudante() {
        return casaEstudante;
    }

    public void setCasaEstudante(String casaEstudante) {
        this.casaEstudante = casaEstudante;
    }

    public String getRuaEstudante() {
        return ruaEstudante;
    }

    public void setRuaEstudante(String ruaEstudante) {
        this.ruaEstudante = ruaEstudante;
    }

    public String getBairroEstudante() {
        return bairroEstudante;
    }

    public void setBairroEstudante(String bairroEstudante) {
        this.bairroEstudante = bairroEstudante;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.codigoEstudante;
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
        final Estudante other = (Estudante) obj;
        if (this.codigoEstudante != other.codigoEstudante) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estudante{" + "codigoEstudante=" + codigoEstudante + '}';
    }
    
    
    

}
