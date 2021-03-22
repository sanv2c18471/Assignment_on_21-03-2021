package demo8;

import java.util.Iterator;
import java.util.Stack;

public class Test4stack {
public static void main(String[] args) {
	Stack <Integer> s = new Stack <Integer> ();
	s.push(90);
	s.push(32);
	s.push(97);
	s.push(20);
	s.push(58);
    s.push(null);
	s.push(14);
	s.push(72);
	System.out.println(s);
	System.out.println("Stack Capacity: "+s.capacity());
	System.out.println("Stack size: "+s.size());
    s.pop();
    s.pop();
	for(Integer i : s) {
	System.out.println(s);
	}
	s.set(2, 5);
	System.out.println("stack set: "+s);
	System.out.println("Stack is empty: "+s.isEmpty());
	System.out.println("Stack Contains: "+s.contains(20));
	s.search(72);
	System.out.println("Stack Search: "+s);
	System.out.println("Stack search: "+s.search(72));
	System.out.println("Stack Capacity: "+s.capacity());
	System.out.println("Stack size: "+s.size());
Stack <String> s1 = new Stack <String> ();
s1.push("pen");
s1.push("pencile");
s1.push("eraser");
//s1.push("tip box");
//s1.push("calculator");
Iterator <String> it = s1.iterator();
while (it.hasNext()) {
	System.out.println(it.next());
}

Stack <String> s2 = new Stack <String> ();
//s2.push("seals");
//s2.push("fish");
//s2.push("dolphins");
//s2.push("whales");
//s2.push("penguins");
//s2.push("tip box");
//s2.push("calculator");
s2.push("pen");
s2.push("pencile");
s2.push("eraser");
//System.out.println(s2);

if (s2.equals(s1)) {
	System.out.println("equal: "+s2);
}else {
	System.out.println("not equal: "+s2);
}
}
}
