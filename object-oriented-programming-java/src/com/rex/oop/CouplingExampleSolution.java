package com.rex.oop;

public class CouplingExampleSolution {
	class ShoppingCartEntry {
		public float price;
		public int quantity;
		
		public float getTotalPrice() {
			return price * quantity;
		}
	}

	class ShoppingCart {
		public ShoppingCartEntry[] items;
		
		public float getTotalPrice() {
			float cartTotalPrice = 0;
			for (ShoppingCartEntry item : items) {
				cartTotalPrice += item.getTotalPrice();
			}
			return cartTotalPrice;
		}
	}

	class Order {
		private ShoppingCart cart;
		private float salesTax;
		
		public Order (ShoppingCart cart, float salesTax) {
			this.cart = cart;
			this.salesTax = salesTax;
		}
		
		public float totalPrice() {
			return cart.getTotalPrice() * (1.0f + salesTax);
		}
	}
	
	public static void main(String[] args) {
		
	}

}