package jsp.demo04.bt.day03;

import jsp.examples.bt3.Job;

public class Employee {
	public String name;
	public int id;
	public double salary;
	public int age;
	public boolean married;
	public Job job;
	public Employee(String name, int id, double salary, int age, boolean married, Job job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.married = married;
		this.job = job;
	}

}
