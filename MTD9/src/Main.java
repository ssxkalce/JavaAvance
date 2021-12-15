import Swag.STYLE;

public class Main {
	public static void main(String args[]) {
	
	Operation O =Operation.Plus;
	double sum =O.compute(1,2);
	System.out.println(sum);
	
	} 
}

public swag(String txt, set<STYLE> styles) {
	StringBuilder ns = new StringBuider();
	for(STYLE s:styles) {
		ns = s.applyStyle(txt);
	}
}

	set<STYLE> s= new HashSet<STYLE>();
	s.add(STYLE.KIKOU);
	s.add(STYLE.CROSS);
	
	et<STYLE> set = new LinkedHashSet<STYLE>();
