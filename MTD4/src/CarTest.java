import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void testGetter() {
		
		Car a = new Car("Audi",10000);
		assertEquals("Audi",a.getBrand());
		assertEquals(10000,a.getValue());
		
		Car b = new Car("BMW",9000,2);
		assertEquals("BMW",b.getBrand());
		assertEquals(7000,b.getValue());
	}

}
