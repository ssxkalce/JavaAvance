import java.util.ArrayList;
import java.util.HashSet;

public class Main{
		
public static void main(String[] args) {
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		
		Car d = a;
		
		Garage garage = new Garage();
		garage.addCar(a);
		garage.addCar(b);
		garage.addCar(c);
		System.out.println(garage);
		System.out.println(garage.firstCarByBrand("Audi"));
		
		System.out.println(garage.ValueGarage());
		
		System.out.println(c.getBrand());
		System.out.println(garage.NbOccupied());
		System.out.println(b);
		
		/*garage.remove(a);
		System.out.println(garage);
		*/
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println("\n");
		System.out.println(a.equals(b));
		System.out.println(b.equals(c));
		System.out.println(a.equals(d));
		
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		
		
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		
		System.out.println(b.equals(c));
		
		//it is logic?
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c));
		/**
		 * test the protectionism method
		 */
		garage.protectionism("BMW");
		System.out.println(garage);
		
		
	}
}
