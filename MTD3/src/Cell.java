
public class Cell {
	private String data;
	private Cell next;
	

	public Cell(String s, Cell c) {
		data = s;
		next = c;
	}
public String getData() {
	return data;
}
public Cell getNext() {
	return next;
}
public void setNext(Cell next) {
	this.next = next;
}
public void setData(String data) {
	this.data = data;
}



}
