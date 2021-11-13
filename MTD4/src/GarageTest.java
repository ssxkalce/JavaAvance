import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GarageTest {

	@Test
	void test() {
		Car a = new Car("Audi",10000,5);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",8000);
		Garage garage = new Garage();
		garage.addCar(a);
		garage.addCar(b);
		garage.addCar(c);
		
		assertEquals(3,garage.NbOccupied());
		assertEquals(22000,garage.ValueGarage());
		
		
		// assertEquals(c,garage.firstCarByBrand("BMW"));
		
	}

}
