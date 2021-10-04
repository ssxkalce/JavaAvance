import java.util.ArrayList;

public class Point {
	public int x;
	public int y;
	
	
	public static int count = 0;

	public Point(int x ,int y) {
		this.x = x;
		this.y = y;
		count ++;
	}
	public Point() {
		
	}
	
	
	
	public Point(Point p2){
		
		this.x = p2.x;
		this.y = p2.y;
	}
	
	public boolean isSameAs(Point p) {
	    if (p == null) {
	        return false;
	    }
	    if (!(p instanceof Point)) {
	        return false;
	    }
	    return (x == ((Point) p).x && y == ((Point) p).y);
	}

	//Exercise 5.1
	
	public Point translate(int dx,int dy) {
		Point p = new Point();
		p.x = p.x + dx;
		p.y = p.y + dy;
		return p;
	}
	
	public String toString() {
		return "( " + this.x +", " +this.y +" )";
	}
	
	public static void main(String[] args) {
		Point p = new Point(2,3);
		String point =p.toString();
		
		System.out.println(p.x + " " +p.y);
		
		System.out.println(point);
		
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		
		System.out.println(p1.isSameAs(p3));
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		System.out.println(list);
	}
	
	

}
/* 
 
 *****Exercice 2******
 1. Why does it work ?
because the variables x and y and the method main are inside the class Point, so it works.abstract
5. Create a constructor with two arguments (called px and py). What is the pro-
blem ?

the problem is that there has no variable predefined as px or py .

6. Modify the parameters of the constructor to call them x and y. What happens ?
it tells me that the constructor Point is undefined and  to add arguments to Point().

7. We would like to keep track of the number of Points that have been created so
far. How to proceed ?

we can add a counter of object into the class,each time when we call the constructor, the counter increment.
we declare a variable  counter like : public static int count =0 , then at the constructor, we set count ++.

8.Write a second constructor with a single Point p2 argument that copies the
coordinates from p2 into the current Point. How does the compiler know which
constructor to call ?


******Exercise 3*******
1. What does this code print ? Why ?
it prints true false, because the addresses of p1 and p2 are the same ,but the
addresses of p1 and p3 are not the same.
p2 copied the address of p1, p3 is at a different address.

3.What is the problem with this code ? Read the documentation of indexOf and
check which method is called. Modify the Point class to fix this problem.

Java String indexOf() method is used to find the index of 
a specified character or a substring in a given String.
the list is a list of address of the Points, as the addresses of p1 and p2 are the same,
so when we call indexOf(p2),it returns 0. the address of p3 is not in the list, so it returns -1.



*/



