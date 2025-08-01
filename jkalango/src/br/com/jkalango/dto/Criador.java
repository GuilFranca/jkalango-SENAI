package br.com.jkalango.dto;
public class Criador {

    // crtl + shift + p
    // Java clean work space

    private String nome;
    private String email;
    private String telefone;
    private String perfil;

    public Criador() {}

    public Criador(String email, String nome, String perfil, String telefone) {
        this.email = email;
        this.nome = nome;
        this.perfil = perfil;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
