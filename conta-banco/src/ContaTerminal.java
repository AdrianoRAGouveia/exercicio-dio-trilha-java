import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
    
    int  numeroConta = 1021;
    String agencia = "067-8";
    double saldo = 237.48;     
    
    
    


        System.out.println("  Seja muito bem vindo ao DIO-BANK, para criar sua conta digital insira seus dados:  ");


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println(" Por favor, digite o seu primeiro Nome: ");
            String nome = scanner.next();

            System.out.println(" Digite seu sobrenome ");
            String sobrenome = scanner.next();

            System.out.println(" Idade:  ");
            String idade = scanner.next();

            System.out.println(" Digite o seu CPF ");
            String cpf = scanner.next();

            System.out.println(" Endereço: (Rua, Av, Apto, Bloco, Casa)  ");
            String endereco = scanner.next();

            System.out.println(" Para confirmar seu Cadastro na DIO-BANK, faça um depósito no valor de R$ 237,48. Escreva DEPÓSITO. ");
            String deposito = scanner.next();

            System.out.println(" descreva o valor depositado para confirmação: R$");
            String depositado = scanner.next();

            System.out.println(" Escreva DEPOSITADO, para confirmação: ");
            String enter = scanner.next();


        System.out.println("Olá, " + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: "+ numeroConta + " e seu saldo de R$ "+ saldo + " já está disponível para saque.");        
    }
}