package edu.learning.controller;
import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.coffee.Coffee;
@RestController
public class CoffeeControler {
	
	public class CoffeeController {
		
		private List<Coffee> coffees = new ArrayList<>();
		
		
		//Adding coffee to the list
		public CoffeeController() {
			coffees.addAll(List.of(new Coffee("Cappuccino", 500.00), new Coffee("Espresso", 350.00), new Coffee("Americano", 450.00),
					new Coffee("Latte", 550.00), new Coffee("Caffe mocha", 350.00), new Coffee("Iced Coffee", 300.00)

			)
					);
			
			
		}
		
		//To display all the coffee in the list
		@RequestMapping(value = "/coffee", method = RequestMethod.GET)
		Iterable<Coffee> getAllLeds() {
			return coffees;

	}
	}

}
