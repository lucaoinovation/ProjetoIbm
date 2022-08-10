import java.util.Scanner;

public class tabuadaPratica {

	public static void main(String[] args) {		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Digite um número por favor ");
		//int num1 = scanner.nextInt();
		System.out.println("Informe o número que deseja calcular ");
		int num = 11;
		for(int contador=0; contador<=9;contador++) {
			int tabuada = 1;
			int resultado = tabuada*contador;
			System.out.println("Tabuada do " +tabuada+ "*" +contador+ "=" +resultado);
			System.out.println("--------------------------");
			
		}
		for(int contador=10;contador<=10;contador++) {
			int tabuada=20;
			System.out.println("Tabuada do "+tabuada);
		}
	}

}
