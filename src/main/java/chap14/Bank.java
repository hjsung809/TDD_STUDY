package chap14;

import java.util.HashMap;

public class Bank {
	// 책과 달리 HashMap과 제네릭을 사용하도록 변경함.
	private HashMap<Pair, Integer> rates = new HashMap<>();
	
	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}
	
	int rate(String from, String to) {
		if(from.equals(to)) return 1;
		
		// 분리해서 적음.
		Pair pair = new Pair(from, to);
		int rate = rates.get(pair);
		return rate;
	}
	
	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), rate);
	}
	
	public static class Pair {
		// 책에는 따로 분리했지만 안으로 옮김.
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
			// 책은 0으로 했지만 과감히 바꿈.
			return this.from.hashCode() + this.to.hashCode();
		}
	}

}
