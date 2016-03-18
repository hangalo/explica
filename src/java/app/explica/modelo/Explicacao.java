/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.explica.modelo;

import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author praveen
 */
public class Explicacao {
    private int codigoExplicacao;
    private Estudante estudante;
    private Disciplina disciplina;
    private Date dataExplicacao;
    private Time horaExplicacao;

    public Explicacao() {
    }

    public Explicacao(int codigoExplicacao, Estudante estudante, Disciplina disciplina, Date dataExplicacao, Time horaExplicacao) {
        this.codigoExplicacao = codigoExplicacao;
        this.estudante = estudante;
        this.disciplina = disciplina;
        this.dataExplicacao = dataExplicacao;
        this.horaExplicacao = horaExplicacao;
    }

    public int getCodigoExplicacao() {
        return codigoExplicacao;
    }

    public void setCodigoExplicacao(int codigoExplicacao) {
        this.codigoExplicacao = codigoExplicacao;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Date getDataExplicacao() {
        return dataExplicacao;
    }

    public void setDataExplicacao(Date dataExplicacao) {
        this.dataExplicacao = dataExplicacao;
    }

    public Time getHoraExplicacao() {
        return horaExplicacao;
    }

    public void setHoraExplicacao(Time horaExplicacao) {
        this.horaExplicacao = horaExplicacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.codigoExplicacao;
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
        final Explicacao other = (Explicacao) obj;
        if (this.codigoExplicacao != other.codigoExplicacao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Explicacao{" + "codigoExplicacao=" + codigoExplicacao + '}';
    }
    
    
    
}
