
public class Circle {
	private static Point p;
	private static int r;

	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(Point p,int r) {
		this.p = p;
		this.setR(r);
	}
	
	public Circle translateCircle(int dx,int dy) {
		Circle a = new Circle();
		a.p = a.p.translate(dx,dy);
		return a;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public Point getCenter(Circle c) {
		
	return c.p;
	}
	
	public double area(Circle c) {
		return(double) Math.PI*getCenter(c)*getCenter(c);
	}
	
	public String toString() {
		return "the center of this circle is " + Circle.p +",the radius is " 
				+ Circle.r + ", the area is "+ area(Circle) +")";
	}
	
	public static void main(String[] args) {
		/*Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		
		Circle c2=new Circle(p,2);
		c2.translateCircle(1,1);
		
		System.out.println(c+" "+c2);
		
		*/
		Circle c=new Circle(new Point(1,2), 1);
		c.getCenter(c).translate(1,1);
		System.out.println(c);
	}
	
	
}

/* 5.What is the problem with this code ? How to avoid it ?
 * it uses a same name in two different methods.
 * 
 6. What would be the problem with a getCenter() method that would return the
center ?

*	c.getCenter  returns a null value. 
*   we need to add a parameter Circle c into the getCenter method */
	
	


