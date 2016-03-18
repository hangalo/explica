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
public class Professor implements Serializable{
    private int codigoProfessor;
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private String emailProfessor;
    private String senhaProfessor;
    private String confirmaSenhaProfessor;
    private String nomeEscolaProfessor;
    private String casaProfessor;
    private String ruaProfessor;
    private String bairroProfessor;
    private Municipio municipio;

    public Professor() {
    }

    public Professor(int codigoProfessor, String nomeProfessor, String sobrenomeProfessor, String emailProfessor, String senhaProfessor, String confirmaSenhaProfessor, String nomeEscolaProfessor, String casaProfessor, String ruaProfessor, String bairroProfessor, Municipio municipio) {
        this.codigoProfessor = codigoProfessor;
        this.nomeProfessor = nomeProfessor;
        this.sobrenomeProfessor = sobrenomeProfessor;
        this.emailProfessor = emailProfessor;
        this.senhaProfessor = senhaProfessor;
        this.confirmaSenhaProfessor = confirmaSenhaProfessor;
        this.nomeEscolaProfessor = nomeEscolaProfessor;
        this.casaProfessor = casaProfessor;
        this.ruaProfessor = ruaProfessor;
        this.bairroProfessor = bairroProfessor;
        this.municipio = municipio;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getSobrenomeProfessor() {
        return sobrenomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor) {
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public String getSenhaProfessor() {
        return senhaProfessor;
    }

    public void setSenhaProfessor(String senhaProfessor) {
        this.senhaProfessor = senhaProfessor;
    }

    public String getConfirmaSenhaProfessor() {
        return confirmaSenhaProfessor;
    }

    public void setConfirmaSenhaProfessor(String confirmaSenhaProfessor) {
        this.confirmaSenhaProfessor = confirmaSenhaProfessor;
    }

    public String getNomeEscolaProfessor() {
        return nomeEscolaProfessor;
    }

    public void setNomeEscolaProfessor(String nomeEscolaProfessor) {
        this.nomeEscolaProfessor = nomeEscolaProfessor;
    }

    public String getCasaProfessor() {
        return casaProfessor;
    }

    public void setCasaProfessor(String casaProfessor) {
        this.casaProfessor = casaProfessor;
    }

    public String getRuaProfessor() {
        return ruaProfessor;
    }

    public void setRuaProfessor(String ruaProfessor) {
        this.ruaProfessor = ruaProfessor;
    }

    public String getBairroProfessor() {
        return bairroProfessor;
    }

    public void setBairroProfessor(String bairroProfessor) {
        this.bairroProfessor = bairroProfessor;
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
        hash = 97 * hash + this.codigoProfessor;
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
        final Professor other = (Professor) obj;
        if (this.codigoProfessor != other.codigoProfessor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Professor{" + "codigoProfessor=" + codigoProfessor + '}';
    }
    
    
}
