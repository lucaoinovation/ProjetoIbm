import java.util.Scanner;
import java.util.ArrayList;

public class MercadoFrutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<String>();
		
		int opcao, fruta, valor;
		String op;
		do {
		System.out.println("Bem vindo ao suuper mercadinho!!");
		System.out.println("Escolha uma opção");
		System.out.println("1- Cadastrar fruta");
		System.out.println("2-Lista de frutas disponíveis");
		System.out.println("3-Excluir fruta do mercado");
		System.out.println("4-Lista frutas com seu ID");
		System.out.println("5-Modificar frutas");
		System.out.println("0-Sair");
		opcao=teclado.nextInt();
		switch(opcao) {
			case 1:
				System.out.println("Quantas frutas deseja cadastrar:");
				}
		}
	}
