
public enum Operation {
	Plus('+'){
		

		
		public double compute(double a, double b) {
			return a+b;
		}
	},Minus('-'){
			public double compute(double a, double b) {
				return a-b;
			}
		};
		
	
	
	public String toString() {
		return Character.toString(symbole);
	}
	
	private final char symbole;
	private Operation(char c) {
		this.symbole = c;
	}
	abstract public double compute(double a,double b);

}
