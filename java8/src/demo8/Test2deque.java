package demo8;

import java.util.ArrayDeque;

public class Test2deque {
public static void main(String[] args) {
	ArrayDeque <String> q = new ArrayDeque <String>();
	q.add("grapes");
	q.add("fig");
	q.add("banana");
	q.add("pineapple");
	q.add("apple");
	q.add(" ");
	//q.add(null);
	for(String s : q) {
		System.out.println(s);
	}
	q.remove("fig");
	for(String s : q){
		System.out.println("after removing : "+s);
	}
	q.poll();
	for(String s : q) {
		System.out.println("after polling :"+s);
	}
	q.pollFirst();
	for(String s : q) {
		System.out.println("after pollfirst :"+s);
	}
	q.pollLast();
	for(String s : q) {
		System.out.println("after polllast :"+s);
	}
	q.offer("TOMATO");
	for(String s : q) {
		System.out.println("after Offer :"+s);
	}
	q.offerFirst("POTATO");
	for(String s : q) {
		System.out.println("after offerfirst :"+s);
	}
	q.offerLast("ONION");
	for(String s : q) {
		System.out.println("after offerlast :"+s);
	}
	q.peek();
	for(String s : q) {
		System.out.println("after peek :"+s);
	}
	q.removeLast();
	for(String s : q) {
		System.out.println("after removing last string :"+s);
	}
	q.removeFirst();
	for(String s : q) {
		System.out.println("after removing first string :"+s);
	}
	q.element();
	for(String s : q) {
		System.out.println("after printing the element  :"+s);
	}
	q.clone();
		for(String s : q) {
			System.out.println("after cloning:"+s);
		}
	}
}
