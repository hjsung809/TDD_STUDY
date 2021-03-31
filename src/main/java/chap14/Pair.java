package chap14;

public class Pair {
	private String from;
	private String to;
	
	Pair(String from, String to){
		this.from = from;
		this.to = to;
	}
	
	@Override
	public boolean equals(Object object) {
		Pair pair = (Pair) object;
		return this.from.equals(pair.from) && this.to.equals(pair.to);
	}
	@Override
	public int hashCode() {
		return 0;
	}
}
