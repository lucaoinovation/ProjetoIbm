import java.util.Scanner;

public class CalculoValores {

	public static void main(String[] args) {
		/*
		 * Mensagem na tela
		 * System.out.println("Prezado(a) usu�rio(a), digite o seu nome"); //Criando uma
		 * vari�vel, vinculado a um scanner Scanner teclado = new Scanner(System.in);
		 * String nome=teclado.nextLine();
		 * 
		 * //retorno do scanner
		 * System.out.println("Seja bem vindo "+nome+" a nossa institui��o");
		 * 
		 * //solicitando ao usu�rio os valores
		 * System.out.println("Prezado usu�rio, digite o primeiro valor"); Scanner
		 * teclado = new Scanner(System.in); String nome=teclado.nextLine();
		 * System.out.println("Entre com o segundo valor"); Scanner teclado = new
		 * Scanner(System.in); String nome=teclado.nextLine();
		 * System.out.println("A multiplica��o dos valores calculados �"); int
		 * valor1=10, valor2=20; int resultado=valor1+valor2;
		 * System.out.println("O valor obtido na soma foi " +resultado );
		 */

		// Mensagem na tela

		/*
		 * System.out.println("Prezado Usu�rio, digite seu nome!");
		 * 
		 * //Criando uma vari�vel, vinculado a um scanner Scanner teclado = new
		 * Scanner(System.in); String nome = teclado.next();
		 * 
		 * //Retorno do scanner System.out.println("Seja muito bem vindo " +nome);
		 */

		// gerando o scanner
		/*Scanner scanner = new Scanner(System.in);
		
		// Solicita ao usu�rio o n�mero 1 e o n�mero 2 e ap�s isso gera a multiplica��o
		System.out.println("Digite o primeiro n�mero");
		int num1 = scanner.nextInt(); 
		//System.out.println(num1);
		System.out.println("Digite o segundo n�mero");
		int num2 = scanner.nextInt();
		//System.out.println(num2);
		
		int resultado = num1*num2;

		// Retorno do Scanner
		System.out.println("A multiplica��es dos valores � "+resultado);
	*/
		
		//iniciando o scanner
		Scanner scanner = new Scanner(System.in);
		
		//pedindo o primeiro n�mero
		System.out.println("Digite o primeiro n�mero");
		int num1 = scanner.nextInt();
		
		//pedindo o segundo n�mero
		System.out.println("Digite o segundo n�mero");
		int num2 = scanner.nextInt();
		
		
		int resultado = num1 * num2;
		//sa�da		
		System.out.println("O resultado da sua multiplica��o � " +resultado);
	
		
	}

}
