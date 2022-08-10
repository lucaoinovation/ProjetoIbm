import java.util.Scanner;

public class DiversasLeitura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		
		int preco;
		
		System.out.println("Digite o texto ");
		nome = teclado.next();
	
		System.out.println("Digite o preço ");
		preco = teclado.nextInt();
		
		System.out.println("Seu nome é " +nome+ " e vc escolheu o preço " +preco);
	}

}
