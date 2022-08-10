import java.util.Scanner;

public class LoopResultado {

	public static void main(String[] args) {
		//Começando a mexer com laços de repetição (for)
		/*for(int contador=1; contador<=9; contador ++) {
		for (int contador1= 1; contador1<=9; contador1 ++) {
			System.out.println(contador*contador1);
		*/
		//iniciando o scanner
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um número da tabuada");
		int numeroEscolhido = scanner.nextInt();
		int contador = 0;
		//gerando a estrutura de repetição
		for(contador=2; contador<=100; contador++) {
			int resultado = numeroEscolhido*2;
			System.out.println(resultado);
			
		}
		//int resultado = scanner.nextInt();
		}*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para a tabuada");
		int numEscolhido = scanner.nextInt();
		int contador =0;
		
		for(int resultado = 1; resultado <=100; resultado ++) {
			int multiplicador= scanner.nextInt();
			int contador =numEscolhido*2;*/
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor para tabuada");
		int valor1, numero2, resultado = scanner.nextInt();

		for(int contador = 0; contador<=100;contador++) {
			int  = scanner.nextInt();
			int  = valor1 *2;*/
		
		//inicia o scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite por gentileza um número da tabuada ");
		int numeroSelecionado = scanner.nextInt();
		
		//laço for que começa no zero e multiplica até o número 10 e depois para
		for(int contador=0; contador<=10; contador++) {
			int resultado = numeroSelecionado * contador;
			System.out.println(+numeroSelecionado+ "*" +contador+ "=" +resultado);
		}
		}
		
		}
	
