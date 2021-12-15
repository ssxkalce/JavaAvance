
public class Nat {
	private int n = 0;
	public Nat(int val) throws ErrConst{
		if(val< 0) throw new ErrConst("number should be positeve, but it is" + val);
		this.n = val;
	}
}
