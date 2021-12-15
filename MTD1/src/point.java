
public class point {
	public boolean equals(object obj) {
		if(obj==this) {
			return True;
		}
		if(obj instanceof Point) {
			Point p = (Point) obj;
			if(p.x ==this.x && p.y ==this.y) {
				return True;
			}
			
		}
		return False;
	}

	public int hashcode() {
		return x^Integer.rotateLeft(Y,16);
	}
}
