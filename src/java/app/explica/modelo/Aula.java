/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.explica.modelo;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author praveen
 */
public class Aula implements Serializable{
    private int codigoAula;
    private Date dataAula;
    private Time horaAula;
    private Explicacao explicacao;
    private Professor professor;
    private String casaAula;
    private String ruaAula;
    private String bairroAula;
    private Municipio municipio;

    public Aula() {
    }

    public Aula(int codigoAula, Date dataAula, Time horaAula, Explicacao explicacao, Professor professor, String casaAula, String ruaAula, String bairroAula, Municipio municipio) {
        this.codigoAula = codigoAula;
        this.dataAula = dataAula;
        this.horaAula = horaAula;
        this.explicacao = explicacao;
        this.professor = professor;
        this.casaAula = casaAula;
        this.ruaAula = ruaAula;
        this.bairroAula = bairroAula;
        this.municipio = municipio;
    }

    public int getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(int codigoAula) {
        this.codigoAula = codigoAula;
    }

    public Date getDataAula() {
        return dataAula;
    }

    public void setDataAula(Date dataAula) {
        this.dataAula = dataAula;
    }

    public Time getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(Time horaAula) {
        this.horaAula = horaAula;
    }

    public Explicacao getExplicacao() {
        return explicacao;
    }

    public void setExplicacao(Explicacao explicacao) {
        this.explicacao = explicacao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getCasaAula() {
        return casaAula;
    }

    public void setCasaAula(String casaAula) {
        this.casaAula = casaAula;
    }

    public String getRuaAula() {
        return ruaAula;
    }

    public void setRuaAula(String ruaAula) {
        this.ruaAula = ruaAula;
    }

    public String getBairroAula() {
        return bairroAula;
    }

    public void setBairroAula(String bairroAula) {
        this.bairroAula = bairroAula;
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
        hash = 23 * hash + this.codigoAula;
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
        final Aula other = (Aula) obj;
        if (this.codigoAula != other.codigoAula) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aula{" + "codigoAula=" + codigoAula + '}';
    }
    
    
    
}
