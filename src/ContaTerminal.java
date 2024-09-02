import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
	  Integer numero;
	  String agencia;
	  String nomeCliente;
	  Double saldo;
	  
	  Scanner entrada = new Scanner(System.in);
	  entrada.useLocale(new Locale("pt", "BR"));
	  System.out.println("Por favor, digite o número da Agência!");
	  numero = entrada.nextInt();
	  entrada.nextLine(); 
	  
	  System.out.println("Por favor, digite a Agência!");
	  agencia = entrada.nextLine();
	  
	  
	  System.out.println("Por favor, digite o Nome do cliente!");
	  nomeCliente = entrada.nextLine();
	  
	  System.out.println("Por favor, digite o Saldo Inicial!");
	  String saldoEntrada = entrada.next().replace(',', '.');
	  saldo = Double.parseDouble(saldoEntrada);
	  
	  
	  criarConta(numero,agencia,nomeCliente,saldo);
	  entrada.close();
	  
	  
	  
   }
   
   public static void criarConta(
	  Integer numero,
	  String agencia,
	  String nomeCliente,
	  Double saldo){
	      
		  System.out.printf("\n Olá %s, obrigado por criar uma conta em nosso banco,"
		  		+ " sua agência é %s, conta %d e seu saldo %.2f "
		  		+ "já está disponível para saque",nomeCliente, agencia,numero, saldo );
		  
	  }
}
