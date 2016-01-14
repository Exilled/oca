
public class Store {

	public static void main(String[] args) {
		
		
		Customer customer = new Customer();
		customer.name = "Diogo";
		
		Product p1 = new Product();
		p1.id= 1;
		p1.name = "batatas";
		p1.price = 2.3f;
		
		Product p2 = new Product();
		p2.id= 2;
		p2.name = "couves";
		p2.price = 0.6f;
		
		Product p3 = new Product();
		p3.id= 3;
		p3.name = "cenouras";
		p3.price = 1.4f;
		
		
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		
		shoppingCart.customer = customer;
		
		shoppingCart.setProducts(10);
		
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		shoppingCart.addProduct(p3);
		
		System.out.println("Total: " + shoppingCart.getTotal());
		System.out.println("Customer Name: "+ customer.name);
		System.out.println("SC Customer Name: "+ shoppingCart.customer.name);
		
		System.out.println("OLD CART");
		shoppingCart.printProduct();
		
		shoppingCart.removeProduct(p2.id);
		
		System.out.println("\nNEW CART");
		shoppingCart.printProduct();
		
		
		System.out.println("[B] Finished: "+ shoppingCart.isFinished());
		shoppingCart.finished();
		System.out.println("[A] Finished: "+ shoppingCart.isFinished());
	
		shoppingCart.addProduct(p1);
		shoppingCart.printProduct();
	
	}

}
