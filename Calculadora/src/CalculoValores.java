import java.util.Scanner;

public class CalculoValores {

	public static void main(String[] args) {
		/*
		 * Mensagem na tela
		 * System.out.println("Prezado(a) usuário(a), digite o seu nome"); //Criando uma
		 * variável, vinculado a um scanner Scanner teclado = new Scanner(System.in);
		 * String nome=teclado.nextLine();
		 * 
		 * //retorno do scanner
		 * System.out.println("Seja bem vindo "+nome+" a nossa instituição");
		 * 
		 * //solicitando ao usuário os valores
		 * System.out.println("Prezado usuário, digite o primeiro valor"); Scanner
		 * teclado = new Scanner(System.in); String nome=teclado.nextLine();
		 * System.out.println("Entre com o segundo valor"); Scanner teclado = new
		 * Scanner(System.in); String nome=teclado.nextLine();
		 * System.out.println("A multiplicação dos valores calculados é"); int
		 * valor1=10, valor2=20; int resultado=valor1+valor2;
		 * System.out.println("O valor obtido na soma foi " +resultado );
		 */

		// Mensagem na tela

		/*
		 * System.out.println("Prezado Usuário, digite seu nome!");
		 * 
		 * //Criando uma variável, vinculado a um scanner Scanner teclado = new
		 * Scanner(System.in); String nome = teclado.next();
		 * 
		 * //Retorno do scanner System.out.println("Seja muito bem vindo " +nome);
		 */

		// gerando o scanner
		/*Scanner scanner = new Scanner(System.in);
		
		// Solicita ao usuário o número 1 e o número 2 e após isso gera a multiplicação
		System.out.println("Digite o primeiro número");
		int num1 = scanner.nextInt(); 
		//System.out.println(num1);
		System.out.println("Digite o segundo número");
		int num2 = scanner.nextInt();
		//System.out.println(num2);
		
		int resultado = num1*num2;

		// Retorno do Scanner
		System.out.println("A multiplicações dos valores é "+resultado);
	*/
		
		//iniciando o scanner
		Scanner scanner = new Scanner(System.in);
		
		//pedindo o primeiro número
		System.out.println("Digite o primeiro número");
		int num1 = scanner.nextInt();
		
		//pedindo o segundo número
		System.out.println("Digite o segundo número");
		int num2 = scanner.nextInt();
		
		
		int resultado = num1 * num2;
		//saída		
		System.out.println("O resultado da sua multiplicação é " +resultado);
	
		
	}

}
