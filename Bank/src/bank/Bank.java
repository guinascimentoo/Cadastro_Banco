package bank;

import Entidades.ContaCliente;
import Entidades.DadosCliente;
import Enums.Status;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bank {

    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        char escolha = 's';
        
        while(escolha == 's'){
            
            System.out.println("Digite os dados do cliente");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("CPF: ");
            long cpf = sc.nextLong();
            System.out.print("Data de nascimento: ");
            Date dataNasc = sdf.parse(sc.next());

            DadosCliente dadosCliente = new DadosCliente(nome, idade, dataNasc, email, cpf);

            System.out.println("Status do cadastro");
            String valor1 = "Cliente cadastrado";
            Status status1 = Status.pegaStatusPorValor(valor1);
            System.out.println(status1);

            System.out.println("Digite a conta do cliente");
            System.out.print("Agência: ");
            float agencia = sc.nextFloat();
            System.out.print("Conta: ");
            float conta = sc.nextFloat();
            System.out.print("Banco: ");
            float banco = sc.nextFloat();
            System.out.print("Nome do banco: ");
            String nomeBanco = sc.next();

            ContaCliente contaCliente = new ContaCliente(agencia, conta, banco, nomeBanco);

            System.out.println("Status do cadastro");
            String valor2 = "Conta cadastrada";
            Status status2 = Status.pegaStatusPorValor(valor2);
            System.out.println(status2);

            System.out.print("Deposito inicial R$: ");
            Double depositoInicial = sc.nextDouble();

            System.out.println("Status do deposito");
            String valor3 = "Valor depositado";
            Status status3 = Status.pegaStatusPorValor(valor3);
            System.out.println(status3);
            
            System.out.println("Dados do cliente: " + dadosCliente);
            System.out.println("Conta do cliente: " + contaCliente);

            System.out.println("Data e hora que a conta foi criada");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            System.out.println(dtf.format(LocalDateTime.now()));

            System.out.println("Deseja fazer outro cadastro ? (s/n)");
            escolha = sc.next().charAt(0);
            
            switch(escolha){
                case 'n':
                    System.out.println("Esta operação será finalizada");
                break;
            }                   
        }
    }   
}