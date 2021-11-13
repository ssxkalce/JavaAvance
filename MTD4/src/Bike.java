
public class Bike extends Car {
	static final long VALUE  =100;
	
	public Bike(String brand, long VALUE) {
		
		super(brand, VALUE);
	}

	
	public String getBrand() {
		return super.getBrand();
	}


	@Override
	public long getValue() {
		return super.getValue();
	}


	@Override
	public String toString() {
		return super.toString();
	}


	@Override
	public boolean equals(Object c) {
		if (c == this) {
			return true;
		}
		if(! (c instanceof Bike)) {
			return false;
		}
		Bike a = (Bike) c;
		if(this.getBrand()==a.getBrand() & this.getValue() ==a.getValue()) {
			return true;
		}
		return false;
	}

}






