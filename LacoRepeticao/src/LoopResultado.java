import java.util.Scanner;

public class LoopResultado {

	public static void main(String[] args) {
		//Come�ando a mexer com la�os de repeti��o (for)
		/*for(int contador=1; contador<=9; contador ++) {
		for (int contador1= 1; contador1<=9; contador1 ++) {
			System.out.println(contador*contador1);
		*/
		//iniciando o scanner
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um n�mero da tabuada");
		int numeroEscolhido = scanner.nextInt();
		int contador = 0;
		//gerando a estrutura de repeti��o
		for(contador=2; contador<=100; contador++) {
			int resultado = numeroEscolhido*2;
			System.out.println(resultado);
			
		}
		//int resultado = scanner.nextInt();
		}*/
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero para a tabuada");
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
		
		System.out.println("Digite por gentileza um n�mero da tabuada ");
		int numeroSelecionado = scanner.nextInt();
		
		//la�o for que come�a no zero e multiplica at� o n�mero 10 e depois para
		for(int contador=0; contador<=10; contador++) {
			int resultado = numeroSelecionado * contador;
			System.out.println(+numeroSelecionado+ "*" +contador+ "=" +resultado);
		}
		}
		
		}
	
