package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DadosCliente {
    
    private String nome;
    private Integer idade;
    private Date dataNasc;
    private String email;
    protected Long cpf;
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public DadosCliente(){
        
    }
    
    public DadosCliente(String nome, Integer idade, Date dataNasc, String email, Long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.dataNasc = dataNasc;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCpf() {
        return cpf;
    }
    
    @Override
    public String toString(){
        return "Nome: "
                + nome
                + "| Idade: "
                + idade
                + "| Data de Nascimento: "
                + sdf.format(dataNasc)
                + "| Email: "
                + email
                + "| CPF: "
                + cpf;
    }
}