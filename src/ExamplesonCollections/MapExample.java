package ExamplesonCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String args[]) {

		List<Product> productList = new ArrayList<>();

		productList.add(new Product(1, "iphone7", "Apple", 785.56));
		productList.add(new Product(2, "iphone7", "Apple", 785.56));
		productList.add(new Product(3, "iphone7", "Apple", 785.56));
		productList.add(new Product(4, "iphoneX", "Apple", 999));
		productList.add(new Product(5, "iphone7", "Apple", 785.56));
		productList.add(new Product(6, "iphone7", "Apple", 785.56));
		
		//Adding new Item
		productList.add(new Product(4, "iphoneXX", "Tesla", 1299));

		for (Product p : productList) {
			System.out.println(" Products: " + p.getProductId());
			if(p.getProductId() == 4) {
				System.out.println(" Products: " + p.toString());
			}
		}
		// Creating Map
		Map<Integer, Product> productMap = new Hashtable<>();
		for (Product p : productList) {
			productMap.put(p.getProductId(), p);
		}

		Iterator it = productMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry key = (Map.Entry) it.next();
			System.out.println("Using while loop--> key: " + key.getKey() + " value: " +key.getValue().toString());
		}
		
		for(Map.Entry key : productMap.entrySet()) {
			System.out.println("\nUsing for loop--> key: " + key.getKey() + " value: " +key.getValue().toString());
		}
		
		System.out.println("Product information for the key 4: " + productMap.get(4).toString());

	}
}
