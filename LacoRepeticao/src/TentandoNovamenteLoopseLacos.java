import java.util.Scanner;

public class TentandoNovamenteLoopseLacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para gerar uma tabuada usando o FOR");
		int numeroDaTabuada = scanner.nextInt();	
		
		for(int contador=0;contador<=10;contador++){
			int resultado = numeroDaTabuada *contador;	
			System.out.println(numeroDaTabuada+ "*" +contador+ "=" +resultado+ "\n");
		}	
	}
}
