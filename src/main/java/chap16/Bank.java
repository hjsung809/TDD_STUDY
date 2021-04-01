package chap16;

import java.util.HashMap;

public class Bank {
	private HashMap<Pair, Integer> rates = new HashMap<>();
	
	Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}
	
	int rate(String from, String to) {
		if(from.equals(to)) return 1;
		
		Pair pair = new Pair(from, to);
		int rate = rates.get(pair);
		return rate;
	}
	
	void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), rate);
	}
}
