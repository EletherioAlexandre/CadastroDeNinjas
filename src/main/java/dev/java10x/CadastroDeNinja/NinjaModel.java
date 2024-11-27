package dev.java10x.CadastroDeNinja;


import jakarta.persistence.*;

//Com essa anotation '@Entity' eu transformo a minha classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id //O primeiro atributo após a anotation vai se comportar como ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia de como esse ID será gerado
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
