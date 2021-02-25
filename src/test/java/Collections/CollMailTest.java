package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollMailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		List<String> fruits=new ArrayList<String>();
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("grapes");
		fruits.add("litchi");
		fruits.add("mango");
		
		fruits.add(4, "grapefruit");
		
		
		System.out.println(fruits.size());
		
		for (String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
		System.out.println("---------------");
		for (int i=0;i<fruits.size(); i++)
		{
			System.out.println(fruits.get(i));
		}
		
		System.out.println("--------------------");
		Iterator itr = fruits.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------");
		//Set
		
		Set<String> set = new HashSet<String>();
		
		set.addAll(fruits);
		System.out.println(set.toString());
		
		set.add("pear");
		
		System.out.println(set.size() +"  "+set.toString());
		
		for (String s : set)
		{
			System.out.println(s);
		}
		//Map

	}

}
