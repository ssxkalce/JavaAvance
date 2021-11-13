import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;



/**
 * @author guqilian
 * the garage class
 */
public class Garage {
	private static int id;
	HashMap<Car,String> garage = new HashMap<Car,String>();
	
	public int getId() {
		return id;
	}
	/**
	 * this is a method to add a car in garage
	 * @param c :it's the car to be added
	 */
	public void addCar(Car c) {
		 c = Objects.requireNonNull(c);
		 garage.put(c,c.getBrand());
	}
	/**
	 * this is a method to add a bike in garage
	 * @param c:it is the bike to be added
	 */
	public void addBike(Bike c) {
		c = Objects.requireNonNull(c);
		garage.put(c,c.getBrand());
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("It's the garage number ");
		str.append(Garage.id);
		str.append("\n");
		Iterator<Entry<Car, String>> iterator =garage.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Car, String> entry = (Map.Entry<Car,String>) iterator.next();
			str.append(entry.getKey().toString());
			str.append("\n");
	
		}
		return str.toString();
	
	}
	/**
	 * this is a method to count the number of places occupied in the garage
	 * @return the number of places occupied in the garage
	 */
	public int NbOccupied() {
		return garage.size();
	}
	
	/**
	 * this is a method to count the total value in this garage, the sum of all the car' values in the garage
	 * @return the total value of this garage
	 */
	public long ValueGarage() {
		
		long sum = 0;
		Iterator<Entry<Car, String>> iterator =garage.entrySet().iterator();
		while (iterator.hasNext() ) {
			Entry<Car, String> entry = (Map.Entry<Car,String>) iterator.next();
			
				sum = sum + entry.getKey().getValue();				
			
	}
		return sum;
}
	/**
	 * this is a method to return the first car by brand in the garage
	 * @param br :the car brand we want to find
	 * @return the first car of this brand 
	 */
	public Car firstCarByBrand(String br) {
		Iterator<Entry<Car, String>> iterator =garage.entrySet().iterator();
		while (iterator.hasNext() ) {
			Entry<Car, String> entry = (Map.Entry<Car,String>) iterator.next();
			if(entry.getValue()==br) {
				return entry.getKey();				
			}
			
		}
		return null;
		
		
	}
	/**
	 * this is a method to remove a car from the garage
	 * @param c is the car we want to remove
	 */

	public void remove(Car c) {
		garage.remove(c,c.getBrand());
	}
	public void remove(Bike c) {
		garage.remove(c,c.getBrand());
	}
	
	/**
	 * this is a method to remove all the vehicles of the indicated brand
	 * @param brand is the brand vehicle to be removed 
	 */
	public void protectionism(String brand) {
		Iterator<Entry<Car, String>> iterator =garage.entrySet().iterator();
		while (iterator.hasNext() ) {
			Entry<Car, String> entry = (Map.Entry<Car,String>) iterator.next();
			if(entry.getValue()==brand) {
				iterator.remove();				
			}
			
		}
	}

}
