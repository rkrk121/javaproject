package framework;

import java.util.TreeMap;

public class Student1 
{
	String name;
	long contact;
	public Student1(String name, long contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", contact=" + contact + "]";
	}
	public static void main(String[] args) 
	{
		TreeMap<String,Student1> t=new TreeMap<String,Student1>();
		t.put("Abc123", new Student1("Tina",9878965421l));
		t.put("Abc124", new Student1("Alex",9875412361l));
		t.put("Abc118", new Student1("sam",9002001005l));
		System.out.println(t);
		
		
	}
	

}
