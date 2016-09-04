package com.rex.oop;

// Coupling is a measure of how much a class is dependent on other classes.
// There should be minimal dependencies between classes.

class ShoppingCartEntry {
	public float price;
	public int quantity;
}

class ShoppingCart {
	public ShoppingCartEntry[] items;
}

class Order {
	private ShoppingCart cart;
	private float salesTax;
	
	public Order (ShoppingCart cart, float salesTax) {
		this.cart = cart;
		this.salesTax = salesTax;
	}
	
	// This method is dependent on ShoppingCartEntry and ShoppingCart classes (tightly coupled).
	// If there are any changes to those classes, this would also need to change.
	public float orderTotalPrice() {
		float cartTotalPrice = 0;
		for (int i=0; i<cart.items.length; i++) {
			cartTotalPrice += cart.items[i].price * cart.items[i].quantity;
		}
		cartTotalPrice += cartTotalPrice * salesTax;
		return cartTotalPrice;
	}
}

public class CouplingExamplesProblem {

	public static void main(String[] args) {

	}

}
