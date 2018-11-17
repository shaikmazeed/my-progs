package com.pro.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
	

class Employee{
	
	int id;
	String name;
	public Employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class Sample {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	/*ArrayList<Integer> al=new ArrayList();
	al.add(10);
	al.add(11);
	al.add(12);
	List<Integer> l2=al.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.println(l2);*/
		/*ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(104, "mazeed"));
		al.add(new Employee(103, "bobby"));
		al.add(new Employee(101, "samreen"));
		al.add(new Employee(108, "ammi"));
		System.out.println(al);
		Collections.sort(al,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
		System.out.println(al);*/
		
		
		/*Predicate<Employee> p=e->e.id==20 && e.name.equals("bobby");
		System.out.println(p.test(new Employee(20,"bobby")));
*/	
		
	Employee e=new Employee(1,"bobby");
	Employee e1=new Employee(1, "bobby");
		System.out.println(e.equals(e1));
		
		
	
		
		
	
	}
	
}
