import java.util.ArrayList;


public class RegistrosArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> pessoas = new ArrayList<String>();
		pessoas.add("Petrolina");
		pessoas.add("Tarciano");
		pessoas.add("Rómulo");
		pessoas.add("Adroaldo");
		
		System.out.println(pessoas);
		
		//localizando pessoas no array
		
		System.out.println(pessoas.get(3));
		
		//modificando itens no array
		
		pessoas.set(0, "José");
		System.out.println(pessoas);
		
		//removendo registros dentro de arrays
		pessoas.remove(1);
		System.out.println(pessoas);
		
		//contando a quantidade de registros de um arrayList
		System.out.println(pessoas.size());
	
		for(int contador =0; contador<pessoas.size();contador++) {
			System.out.println(pessoas.get(contador));	
		}
		for(String contador:pessoas) {
			System.out.println(contador);
		}
	}

}
