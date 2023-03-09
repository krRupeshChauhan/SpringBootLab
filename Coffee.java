package edu.learning.coffee;

//Java Bean 

public class Coffee {

		// This is a Coffee class with varities of coffees
	
		private String coffeeType;
		private Double price;
		
		public Coffee(String coffeeType, Double price) {
			super();
			this.coffeeType = coffeeType;
			this.price = price;
		}
		
		public Coffee() {
			super();
	
		}
	
		public String getCoffeeType() {
			return coffeeType;
		}
		public void setCoffeeType(String coffeeType) {
			this.coffeeType = coffeeType;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Coffee [coffeeType=" + coffeeType + ", price=" + price + "]";
		}

		

}