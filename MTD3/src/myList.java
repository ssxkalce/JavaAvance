public class myList {
	private Cell first = null;
	// par defaut, size =0 
	private int size;
	public void add(String s) {
		Cell c = new Cell (s, first);
		first = c;
		size ++;
	}
	public void addLast(String s) {
		Cell c = new Cell (s,null);
		if (first == null) {
			first = c;
			size ++;
			return;
		}
		Cell it = first;
		for(int i =0;i<size-1;++i) {
			it = it.getNext();
			
		}
		it.setNext(c);
		size++;
	}
	
	public String get(int ind) {
		if(ind>=size || size<0) {
			throw new IndexOutOfBound("index erreur");
		}
		Cell it = first;
		for(int i =0; i<ind ;++i) {
			it = it.getNext();
		}
		return it.getData();
	}
	
	public int sumLetter() {
		int sum =0;
		Cell it = first;
		for(int i=0;i<size;i++) {
			
			// s = (T)it.getData();
			// sum += s.toString.length()
			String s = it.getData();
			sum += s.length();
			it.getNext();
		}
		return sum;
	}
}
