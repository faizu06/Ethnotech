package javac;
import java.util.*;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("Hello");
		l.add("\n My name is: ");
		l.add("Faizan");
		l.remove(2);
		l.indexOf("Faizan");
		System.out.print(l);
	}

}
