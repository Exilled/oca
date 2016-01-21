
public class Main {

	public static void main(String args[]){
		
		// Strings( e classes dos tipos primitivos ex: Interger,Long,Double) sao classes imutaveis logo nunca podem ser modificadas,
		// qualquer alteração inicia a criaçãode uma nova String em memória
		
		String name1 = "Diogo";// cria novo objecto
		
		String name2 = new String("Diogo"); // cria novo objecto
		
		String name3 = "Diogo"; // referencia ou não o objecto referenciado por name1
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		
		/*
		 * Aqui sao criados 5 objectos diferentes
		 */
		String str = "outra coisa";
		str += "qualuqer coisa";
		str += "outra outra coisa"; 
		
		
		/*
		 * 2 objectos criados
		 */
		StringBuilder stb = new StringBuilder("qualquer coisa");
		
		stb.append("outra coisa");
		
		stb.append(" outra outra coisa");
		
		
		System.out.println(stb);
		
		int x = 10;
		
		method(x);
		
		String str5 = "DIogo";
		
		//ao passar o str5 faz uma copia da referencia
		method(str5);
		
	}
	
	
	public static void method(String x){
		
		System.out.println(x);
		
	}
	
	
	public static void method(int x){
		
		System.out.println(x);
		
	}
	
	
}
