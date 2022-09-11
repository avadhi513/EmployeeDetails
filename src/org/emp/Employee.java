package org.emp;

public class Employee {
	
	private void empId(String name) {
		System.out.println(name);		
	}
	
	private void empId(String name, int eId) {
		System.out.println(name+" "+ eId);	
	}
	
	private void empId(String name, int eId, long phno) {
		System.out.println(name+" "+ eId+" " + phno);		
	}
	
	private void empId(String name, int eId, long phno, double sal) {
		System.out.println(name+" "+ eId+" " + phno+" " +sal);	
	}
	
	private void empId(String name, int eId, long phno, double sal, boolean sts) {
		System.out.println(name+" "+ eId+" " + phno+" " + sal +" "+ sts);		
	}
	
	public static void main (String[] args) {
		Employee e = new Employee();
		e.empId("Java");
		e.empId("Java", 123);
		e.empId("Java", 123, 1234567890);
		e.empId("Java", 123, 1234567890, 45555.559);
		e.empId("Java", 123, 1234567890, 45555.559, true);
	}

}
