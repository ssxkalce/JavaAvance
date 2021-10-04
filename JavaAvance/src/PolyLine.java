import java.util.ArrayList;

public class PolyLine {
	private int n;
	//the maximum number of points of an array
	private static ArrayList<Point> points;
	
	public  PolyLine(int n,ArrayList<Point> points) {
		this.n =n;
		this.points = points;
		
	}
		
	
	public static void add(Point p) {
		PolyLine.add(p);
	}


	public int getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	public ArrayList<Point> getPoints() {
		return points;
	}


	public void setPoints(ArrayList<Point> points) {
		this.points = points;
	}
	
	public int pointCapacity() {
		return getN();
	}
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point p) {
		for(int i=0; i<PolyLine.nbPoints(); i++) {
			return PolyLine.points[i].equas(p);
			
		}
	}
	

}

/* 2.Write a method add that can be used to add a new point to the line.What
happens if we add more points that the maximum capacity of the array ? What
to do about it ? 

-- As elements are added to an ArrayList, its capacity grows automatically. 

5.What happens if null is given instead of an actual Point object ? What if you
do add(null) before ? Read about Objects.requireNonNull(o).

-- requireNonNull(T obj) Checks that the specified object reference is not null . 
static <T> T. requireNonNull(T obj, String message) Checks that the specified 
object reference is not null and throws a customized NullPointerException if it is.


*/
