package demo8;
import java.util.Vector;

public class Test3vector {
	public static void main(String[] args) {
		Vector <String> v =new  Vector <String>();
		v.add("dog");
		v.add("cat");
		v.add("lion");
		v.add("tiger");
		v.add("elephant");
		for(String s : v) {
		System.out.println("Vector having values of add : "+v);
		}
		v.addElement("parrot");
		v.addElement("crow");
		v.addElement("pegion");
		v.addElement("ostrich");
		v.addElement("duck");
		v.addElement("   ");
		v.addElement(null);
			System.out.println("Vector having values of add element : "+v);
			System.out.println("Vector capacity : "+v.capacity());
			System.out.println("Vector size : "+v.size());
			System.out.println("Vector indexof : "+v.indexOf(v));
			System.out.println("Vector first element : "+v.firstElement());
			System.out.println("Vector last element : "+v.lastElement());
			v.insertElementAt("hai", 3);
			System.out.println("Vector insert element : "+v);
			//if (v.contains("lion")) {
			//	System.out.println("Vector Contains : "+v);
			//}else {
			//System.out.println("Vector not Contains : "+v);
			System.out.println("Vector Contains: "+v.contains("Lion"));
			System.out.println("Vector Clone: "+v.clone());
			System.out.println("Vector Remove: "+v.remove(6));
  Vector <String> v1 =new  Vector <String>();
  Vector <String> v2 =new  Vector <String>();
    v1.add("lotus");
	v1.add("lily");
	v1.add("rose");
	v1.addElement("jasmine");
	v1.addElement("sunflower");
	if (v2.isEmpty()) {
		System.out.println("Vector Empty: "+v2);
	}else {
		System.out.println("Vector is not Empty: "+v2);
	}
	if (v1.isEmpty()) {
		System.out.println("Vector Empty: "+v1);
	}else {
		System.out.println("Vector is not Empty: "+v1);
	}
	v1.addAll(v);
	System.out.println("Vector adding all values of  : "+v1);
	v.clear();
	System.out.println("Vector Clear: "+v);
	}
	}
