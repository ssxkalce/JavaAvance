
public class TestPoint {

	public TestPoint() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p.x + " " +p.y);
	}
}

/* 2. Create a class TestPoint with a main and the same code as before. What
happens ? How can we fix it ? 

it says the field Point.x is not visible. because Point.x is a private variable in the Point class,
so we can change it to a public class ,then it works. 

3. Why do you need to set all fields visibility to private ?

private keyword in java allows most restrictive access to variables and methods 
and offer strongest form of Encapsulation.

4. What is an accessor ? Do we have to do it here ?

accessors are used to get the value of a private field .

*/