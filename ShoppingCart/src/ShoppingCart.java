
public class ShoppingCart {
	
	float total;
	
	boolean finished;
	
	Customer customer;
	
	Product [] products;
	
	int cartSize;
	
	
	public void addProduct(Product product){
		
	
	
	for(int x = 0;x<products.length;x++){
		
		if(products[x] == null){
			products[x] = product;
			total = total + product.price;
			break;
		}
		
		
		//if(products[x] != null){
		//	continue;
		//}
		//products[x] = product;
		
	}
		
		
	}
	
	public void removeProduct(int id){
		
		//TODO removeProduct
		
	}
	
	public boolean isFinished(){
		
		return finished;
		
	}
	
	
}
