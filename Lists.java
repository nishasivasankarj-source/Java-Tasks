package nisha_java;

    import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Spliterator;
	import java.util.Stack;
	import java.util.TreeMap;
	import java.util.TreeSet;
	
	public class Lists {
	
	public static void main(String[]args) {

		
	 
		  
		  
	 ArrayList<Object>l= new ArrayList<Object>();
	 l.add("java");
	 l.add('N');
	 l.add(30);
	 l.add(66.7);
	 l.add("java");
	 l.add(true);
	 System.out.println(l);
	 System.out.println(l.add("python"));
	 System.out.println(l);
	 System.out.println(l.get(5));
	 System.out.println(l.getLast());
	 System.out.println(l.contains("java"));
	 
	 ArrayList<Object>al=(ArrayList)l.clone();
	 System.out.println(al);
	 System.out.println(al.add("React.js"));
	 System.out.println(al);
	 System.out.println(l.equals(al));
	 System.out.println(l.indexOf(66.7));
	 System.out.println(al.removeAll(al));
	 System.out.println(al);
	 System.out.println(al.isEmpty());
	 System.out.println(l.remove(2));
	 System.out.println(l);
	 System.out.println(l.removeFirst());
	 System.out.println(l);
	 
	 
	// l.clear();
	// System.out.println(l);
	 System.out.println(l.size());
	 System.out.println(l.reversed());
	 Object ar[]= l.toArray();
	 System.out.println(ar[2]);
	 
	 for(Object v: ar) {
		 System.out.println(v);
	 }
		 System.out.println("-------------------------------------");
		 
		 Iterator i = l.iterator();
		 System.out.println(i.next());
		 while(i.hasNext()) {
			 System.out.println(i.next());
		 }
		 
		 System.out.println("-------------------------------------");
		 
		 Spliterator<Object> S = l.spliterator();
		 S.forEachRemaining(q->System.out.println(q));
		 
		 
		 
	  LinkedList<Object> k = new LinkedList<Object>();
	  
	           k.add("Nisha");
	           k.add(90);
	           k.add(true);
	           k.add(44.5);
	           k.add("poorna");
	           k.add('N');
	         
	         System.out.println(k);
	         System.out.println(k.peekFirst());
	         
	         System.out.println(k);
	         System.out.println(k.peekLast());
	         
	         System.out.println(k);
	         
	         System.out.println(k.pollFirst());
	         
	         System.out.println(k);
	         System.out.println(k.pollLast());
	         
	         k.pop();
	         System.out.println(k);
	         
	         System.out.println(k.hashCode());
	         System.out.println(k.toString());
	         
	         
//	         set 
	         
	          HashSet<Object> hs = new HashSet <Object>();
	          
	           hs.add("praveen");
	           hs.add(67);
	           hs.add(true);
	           hs.add(44.5);
	           hs.add('R');
	           hs.add(null);
	           
	           System.out.println(hs);
	           System.out.println(hs.contains("pr"));
	          
//	         Tree Set
	           
	           TreeSet<Object> ts = new TreeSet <Object>();
	           
	           ts.add('Z');
	           ts.add('s');
	           ts.add('!');
	           ts.add('~');
	           ts.add('5');
	           
	           System.out.println(ts);
	           System.out.println(ts.ceiling('5'));
	           System.out.println(ts.floor('5'));
	           System.out.println(ts.higher('Z'));
	           System.out.println(ts.lower('Z'));
	           System.out.println(ts.subSet('5', '~'));
	           
	           System.out.println("-----------------------------");
	           
//	            Map in collection
	           
	           HashMap<Object,Object> m = new HashMap<Object,Object>();
	           m.put(1, "Apple");
	           m.put(2, "Apple");
	           m.put(null, "Orange");
	           m.put("check", "true");
	           m.put("Hi", "Poorna");
	           m.put(null, "java");
	           
	           System.out.println(m);
	           System.out.println(m.keySet());
	           
	           System.out.println(m.values());
	           System.out.println(m.get("Hi"));
	           
	           System.out.println(m.remove(null));
	           System.out.println(m);
	           System.out.println(m.replace(2, "Nisha"));
	           System.out.println(m);
	           
	           System.out.println("--------------------------------------------");
	           
	           
//	           Tree Map 
	           
	           TreeMap<Object,Object> tm = new TreeMap<Object,Object>();
	              
	           tm.put('F', "Apple");
	           tm.put(';', "Apple");
	           tm.put('!', "Orange");
	           tm.put('c', "true");
	           tm.put('H', "Poorna");
	           tm.put('8', "java");
	           
	           System.out.println(tm);
	           System.out.println(tm.firstKey());
	           System.out.println(tm.lastKey());
	           System.out.println(tm.values());
	           
	      System.out.println("---------------------");
	           
	           Stack s = new Stack();
	           
	           s.add("Hello");
	           
	           s.push("Nisha");
	           s.push("java");
	           s.push("Poorna");
	           s.push("Harsha");
	           s.push("Kabil");
	           s.push("Dhanush");
	           s.push("Jana");
	           System.out.println(s);
	           s.pop();
	           System.out.println(s);
	           s.pop();
	           System.out.println(s);
	           
	          PriorityQueue ps = new PriorityQueue();
	          
	          ps.add("Gowthami");
	          ps.add("Nisha");
	          ps.add("Poorna");
	          ps.add("Pradeep");
	          System.out.println(ps);
	  }
	}


	          
	  
