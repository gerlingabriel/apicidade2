package com.one.digitalinnovation.apicidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pais")
public class Country {

    @Id
    private Long id;

    private String nome;

    @Column(name = "nome_pt")
    private String nomePortugues;

    private String sigla;

    private Integer bacen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePortugues() {
        return nomePortugues;
    }

    public void setNomePortugues(String nomePortugues) {
        this.nomePortugues = nomePortugues;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getBacen() {
        return bacen;
    }

    public void setBacen(Integer bacen) {
        this.bacen = bacen;
    }

    
    
}
