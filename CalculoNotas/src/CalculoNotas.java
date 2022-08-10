import java.util.Scanner;

public class CalculoNotas {

	public static void main(String[] args) {
		// iniciando o scanner
		Scanner scanner = new Scanner(System.in);
		
		//solicitando a nota 1 e nota 2
		System.out.println("Digita nota 1 ");
		int nota1=scanner.nextInt();
		
		System.out.println("Digita nota 2 ");
		int nota2 = scanner.nextInt();
		
		//declarando o calculo de media
		float media = (nota1+nota2)/2;
		
		//mostrando a media pro aluno e informando se foi aprovado/reprovado
		if(media<=6) {
			System.out.println("Você foi aprovado! " +media);
		}else {
			System.out.println("Você foi reprovado!");
			
		}
	}
}
