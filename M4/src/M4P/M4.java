package M4P;

import java.util.*;

public class M4 {

	public static void main(String[] args) {
		
		//Phase 1
		
		//Variables
		
		int e5=5, e10=10, e20=20, e50=50, e100=100, e200=200, e500=500;
		float mealPrice;
		
		//Arrays
		
		String[] dishName = new String[3]; 
		float[] dishPrice = new float[3]; 
		
		//Phase 2
		
		//Fill the menu
		
		HashMap<String, Integer> menu = new HashMap<String, Integer>();

	    for (int i=0; i<3; i++) {

	    	String dish; 
	    	int price;
						
			Scanner menuItem= new Scanner (System.in); 
			System.out.println ("Enter dish " +(i+1));
			dish= menuItem.nextLine(); 
		
			System.out. println("Enter price ");
			price= menuItem.nextInt();
			
			menu.put(dish, price);
	    }
	    
		//Show the menu
	    
		System.out.println ("Menu:");
	    for (String i : menu.keySet()) {
	        System.out.println(i + ":"+menu.get(i)+"€");
		}
	    
	    //Order + Exception Control
	    
	    int orderMore = 1;
	    List<String> order = new ArrayList<String>();
	    
	    while (orderMore == 1) {

	    	try {
		    	Scanner choose = new Scanner (System.in); 
				System.out.println ("What would you like to order?" );
				order.add(choose.nextLine());
				
				System.out.println ("Anything else? (1=Yes/0=No)" );
				orderMore = choose.nextInt();
	    	}
	    	catch(Exception e) {
				orderMore = 0;			
	    	}	    	
	    }
	    
	    //Final order + Final Price
	    
	    System.out.println("Your order is:" );
	    
	    float finalPrice = 0;	    
	    for (int i = 0; i < order.size(); i++) {
	    	
	    	try {
		    	finalPrice += menu.get(order.get(i));
	            System.out.println(order.get(i));
	    	}
	    	catch(Exception e) {
				System.out.println (order.get(i) + " is not in the menu." );
	    	}
        }
	    
	    System.out.println("Your bill is: " + finalPrice + "€");
		
	}

}

/*
Sugestion:
dishName: Steak dishPrice 25
dishName: Burger dishPrice 20
dishName: Salad dishPrice 15
*/
