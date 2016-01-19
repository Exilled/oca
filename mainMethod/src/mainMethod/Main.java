package mainMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* type  -  size(bit)
		 * 
		 * short  -   16   integral
		 * int    -   32   integral
		 * float  -   32   , flutuante
		 * double -   62   , flutuante
		 * long   -   64   integral
		 * byte   -    8   integral
		 * boolean-       
		 * char   -    16   texto
		 * 
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
