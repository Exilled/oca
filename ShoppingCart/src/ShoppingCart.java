
public class ShoppingCart {
	
	private float total;
	
	private boolean finished;
	
	private Customer customer;
	
	private Product [] products;
	
	private int cartSize;
	
	
	public void addProduct(Product product){
		
	
		if(!finished && cartSize < products.length){
			
			products[cartSize++] = product;
			total += product.getPrice();
			
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
			
			if(products[i].getId() == id){
				total -= products[i].getPrice();
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
				System.out.println(products[i].getId());
				System.out.println(products[i].getName());
				
			}
			
		}
		
	}
	
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(int size) {
		this.products = new Product[size];
	}

	public int getCartSize() {
		return cartSize;
	}

	public void setCartSize(int cartSize) {
		this.cartSize = cartSize;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
}
