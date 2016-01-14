
public class ShoppingCart {
	
	float total;
	
	boolean finished;
	
	Customer customer;
	
	Product [] products;
	
	int cartSize;
	
	
	public void addProduct(Product product){
		
	
		if(!finished && cartSize < products.length){
			
			products[cartSize++] = product;
			total += product.price;
			
		}
	
		//for(int x = 0;x<products.length;x++){
		
			//if(products[x] == null){
				//products[x] = product;
				//total = total + product.price;
				//break;
		//}
		
		
		//if(products[x] != null){
		//	continue;
		//}
		//products[x] = product;
				
		
	}
	
	public void removeProduct(int id){
		
		if(finished) return;
		
		for (int i = 0; i < products.length; i++) {
			
			if(products[i].id == id){
				total -= products[i].price;
				products[i] = products[--cartSize];
				products[cartSize] = null;
				break;
			}
			
		}
		
	}
	
	public boolean isFinished(){
		
		return finished;
		
	}
	
	public void finished(){
		finished = true;
	}
	
	public void printProduct(){
		
		for (int i = 0; i < products.length; i++) {
			
			if(products[i] != null){
				System.out.println("---------\nPRODUTO:"+ i);
				System.out.println(products[i].id);
				System.out.println(products[i].name);
				
			}
			
		}
		
	}
	
}
