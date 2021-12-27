package Enums;

import java.util.HashMap;
import java.util.Map;

public enum Status {
    
    CLIENTE_CADASTRADO("Cliente cadastrado"),
    CONTA_CADASTRADA("Conta cadastrada"),
    VALOR_DEPOSITADO("Valor depositado");
    
    private String valor;
    
    public static final Map<String, Status> statusPorValor = new HashMap<>();
    
    static {
        for (Status status : Status.values()){
            statusPorValor.put(status.getValor(), status);
        }          
    }
    
    Status(String valor){
        this.valor = valor;
    }
    
    public String getValor(){
        return valor;
    }
    
    public static Status pegaStatusPorValor(String valor){
        return statusPorValor.get(valor);
    }
}