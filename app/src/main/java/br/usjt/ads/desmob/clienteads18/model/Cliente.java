package br.usjt.ads.desmob.clienteads18.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int id;
    private String nome, email, diretor, data, genero, sinopse, popularidade, elenco;


    public Cliente() {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.diretor = diretor;
        this.data = data;
        this.genero = genero;
        this.sinopse = sinopse;
        this.popularidade = popularidade;
        this.elenco = elenco;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiretor(){
        return diretor;}

    public void setDiretor(String diretor) {
        this.diretor = diretor;}

    public String getData(){
        return data;}

    public void setdata(String data) {
        this.data = data;}

    public String getGenero(){
        return genero;
    }

    void setGenero(String genero){
        this.genero = genero;
    }

    public String getPop(){
        return popularidade;
    }

    void setPop(String pop){
        this.popularidade = pop;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }


    public String getFigura(){

        String figura = email.replace('@', '_');
        return figura.replace('.', '_');

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", data='" + data + '\'' +
                ", genero='" + genero + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", popularidade='" + popularidade + '\'' +
                ", elenco='" + elenco + '\'' +
                '}';
    }
}