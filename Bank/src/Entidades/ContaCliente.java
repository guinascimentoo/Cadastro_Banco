package Entidades;

public class ContaCliente {
    
    private Float agencia;
    private Float conta;
    private Float banco;
    private String nomeBanco;
    
    public ContaCliente(){
        
    }

    public ContaCliente(Float agencia, Float conta, Float banco, String nomeBanco) {
        this.agencia = agencia;
        this.conta = conta;
        this.banco = banco;
        this.nomeBanco = nomeBanco;
    }

    public Float getAgencia() {
        return agencia;
    }

    public void setAgencia(Float agencia) {
        this.agencia = agencia;
    }

    public Float getConta() {
        return conta;
    }

    public void setConta(Float conta) {
        this.conta = conta;
    }

    public Float getBanco() {
        return banco;
    }

    public void setBanco(Float banco) {
        this.banco = banco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    
    @Override
    public String toString(){
        return "Agência: "
                + agencia
                + "| Conta: "
                + conta
                + "| Banco: "
                + banco
                + "| Nome do banco: "
                + nomeBanco;
    }
}