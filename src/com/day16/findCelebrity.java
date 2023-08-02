package com.day16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pair<K,V>{
	
	private K key;
	private V val;
	
	public Pair() {
		// TODO Auto-generated constructor stub
	}
	
	public Pair(K key,V val){
		this.key=key;
		this.val=val;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getVal() {
		return val;
	}
	public void setVal(V val) {
		this.val = val;
	}
	
}


public class findCelebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pair<Character, Character>> input = Arrays.asList(new Pair<>('A', 'B'), new Pair<>('B', 'C'),
                new Pair<>('D', 'C'), new Pair<>('B', 'A'), new Pair<>('D', 'A'));
		// find celebrity
        Map<Character, Integer> knowsHowManyMap = new HashMap<>();

        for (Pair<Character, Character> pair : input) {
            knowsHowManyMap.put(pair.getKey(), 0);
            knowsHowManyMap.put(pair.getVal(), 0);
        }

        for (Pair<Character, Character> pair : input) {
            Character knows = pair.getKey();
            knowsHowManyMap.put(knows, knowsHowManyMap.getOrDefault(knows, 0) + 1);
        }

        System.out.println("knowsHowManyMap = " + knowsHowManyMap);

        knowsHowManyMap.forEach((key, val) -> {
            if(val == 0)
                System.out.println("The celebrity = " + key);
        });

	}

}
