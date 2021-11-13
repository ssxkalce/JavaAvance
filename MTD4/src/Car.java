public class Car {
	private final String brand;
	private final long value;

	
	public Car (String brand, long value) {
		
		this.brand = brand;
		this.value = value;
		if(value<0) {
			throw new IllegalArgumentException("Only positive numbers");
		}
	
		/*catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		*/
	}
	public Car(String brand, long value, int vetuste) {
		this.brand = brand;
		this.value = value - vetuste*1000;
		if(value<0) {
			throw new IllegalArgumentException("Only positive numbers");
		}
		
	}

	public String getBrand() {
		return brand;
	}

	public long getValue() {
		return value;
	}
	/**
	 * this is a toString method to display all the  characteristics of a car 
	 */
	public String toString() {
		return "this is a car of " +this.brand + " and it costs " + this.value+ " euros.";
	}
	/**
	 * this is the equals method to compare if the value of the two objects are equals 
	 * return a boolean true or false
	 */
	@Override
	public boolean equals (Object c) {
		if (c == this) {
			return true;
		}
		if(! (c instanceof Car)) {
			return false;
		}
		Car a = (Car) c;
		if(this.getBrand()==a.getBrand() & this.getValue() ==a.getValue()) {
			return true;
		}
		return false;
	}


}
