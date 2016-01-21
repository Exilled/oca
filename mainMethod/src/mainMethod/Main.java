package mainMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 * operadores de precedencia 
		 *  1) () parenteses
		 *  2) incrementos/decrementos
		 *  3) * / %
		 *  4) + -
		 * 
		 */
		
		
		for (int i = 0; i < args.length; i++) {
			
			System.out.println(args[i]);
			
		}
		
		{// {} CREATES NEW SCOPE
			int i = 0;
			while (i< args.length) {
				System.out.println(args[i]);
				
			}
		}
		
		for (String string : args) {
			
			System.out.println(string);
			
		}
		
		{
			int i = 0;
			do {
				System.out.println(args[i]);
				i++;
			} while (i< args.length);
		}
		
	}
	

}
