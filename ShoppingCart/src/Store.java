
public class Store {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.setName("Diogo");
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("batatas");
		p1.setPrice(2.3f);
		
		Product p2 = new Product();
		p2.setId(2);
		p2.setName("couves");
		p2.setPrice(0.6f);
		
		Product p3 = new Product();
		p3.setId(3);
		p3.setName("cenouras");
		p3.setPrice(1.4f);
		
		
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		
		shoppingCart.setCustomer(customer);
		
		shoppingCart.setProducts(10);
		
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		shoppingCart.addProduct(p3);
		
		System.out.println("Total: " + shoppingCart.getTotal());
		System.out.println("Customer Name: "+ customer.getName());
		System.out.println("SC Customer Name: "+ shoppingCart.getCustomer().getName());
		
		System.out.println("OLD CART");
		shoppingCart.printProduct();
		
		shoppingCart.removeProduct(p2.getId());
		
		System.out.println("\nNEW CART");
		shoppingCart.printProduct();
		
		
		System.out.println("[B] Finished: "+ shoppingCart.isFinished());
		shoppingCart.finished();
		System.out.println("[A] Finished: "+ shoppingCart.isFinished());
	
		shoppingCart.addProduct(p1);
		shoppingCart.printProduct();
	
	}

}
