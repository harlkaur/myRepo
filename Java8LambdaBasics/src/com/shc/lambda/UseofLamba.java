package com.shc.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class UseofLamba {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		l.stream().forEach(System.out::println);
		
		l.stream().filter(mmm->mmm.contains("C")).forEach(System.out::print);
		
		l.stream().filter(j->j.contains("C")).forEach(System.out::print);
	/*	m.put(1,"Harleen");
		m.put(2,"Eshleen");
//		l.forEach(li->System.out.println(l));
		l.forEach(li->{
			if("C".equals(li)){
				System.out.println(li);
			}
		});*/
		
//		l.forEach(System.out::print);
		
		l.stream().filter(s->s.contains("B")).forEach(System.out::print);
		
		/*for(Map.Entry<Integer, String> map : m.entrySet()){
			System.out.println(map.getKey()+ map.getValue());
		}*/
//		names.stream().filter(name -> name.startsWith("A")).forEach(System.out::print);
		
		/*m.forEach((k,v) -> {
			System.out.println("Key:" + k + "Value:" + v);
			if("Eshleen".equals(v)){
				System.out.println(k);
			}
		});
		*/
		m.put(1, "ESHLEEEEENN");
		m.put(2, "HARLEEEENNN");
		m.forEach((k,v)->
		{System.out.println(k+" "+v);
		if("ESHLEEEEENN".contains(v)){
			System.out.println(k);
		}
		});
		
		
		System.out.println("LINKED LIST");
		List<String> names = new LinkedList<>();
		names.add("Harleen");
		names.add("Ankita");
		names.add("Akanshsa");
		
		long cc = names.stream().filter(mmmm->mmmm.contains("Harleen")).count();
		System.out.println("CC count"+cc);
		
		long count  = names.stream().filter(name->name.startsWith("A")).count();
		System.out.println(count);
		
		HashSet<String> set = new HashSet<String>();
		
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(1);
		ll.add(3);
		ll.stream().forEach((i)-> {System.out.println(i);});
		
		ll.stream().forEach(System.out::print);
		
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Roshni");
		map.put(2, "CHandni");
		map.forEach((k,v)->
		{System.out.println(k+" "+v);
		if("Roshni".contains(v)){
			System.out.println(k);
		}
		});
		
		ArrayList<String> aa = new ArrayList<String>();
		aa.add("Heelo");
		aa.add("Hii");
		aa.stream().forEach((i)->{System.out.println(i);});
		
		aa.stream().filter(hh->hh.startsWith("H")).forEach(System.out::println);
	}

}
