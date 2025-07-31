package br.com.jkalango.dto;
public class Genero {

    // Exercicio
    // Crie o atributo descrição
    // Crie o get e set da descrição
    // Crie um construtor com todos os atributos
    // Nome e descrição

    private String nome;
    private String descricao;

    public Genero() {

    }

    public Genero(String nome) {
        this.nome = nome;
    }

    public Genero(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public void MostrarGenero() {
        System.out.println("Nome: " + this.nome + "\nDescrição: " + this.descricao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
