package jsp.demo04.bt.day03;

import java.util.Scanner;

import jsp.examples.bt3.Job;

public class MainProgram {
	static Employee[] employees;

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		System.out.println("1. Create Employee");
		System.out.println("2. Show the existing employee");
		System.out.println("3. Exit");
		System.out.println("-------------------------------");
		
		int inputNumber = 0;
		do {
			Scanner scannerInput = new Scanner(System.in);
			System.out.println("Please input a number : ");
			inputNumber = scannerInput.nextInt();
			System.out.println("number : " + inputNumber);
			
			switch (inputNumber) {
			case 1:
				// TODO : add employee here
				addEmployee();
				break;
			case 2:
				System.out.println("2. Show the existing employee");
				showEmployee();
				break;
			case 3:
				
				break;
			default:
				break;
			}
		} while (inputNumber != 3);
		
		//
		System.out.println("Exit");
		
		
	}

	private static void showEmployee() {
		// TODO Auto-generated method stub
		System.out.println("STT    name      Salary     JobName");
		for (int i = 0; i<employees.length;i++) {
			System.out.println(employees[i].id + " " + employees[i].name + " " + employees[i].salary);
		}
	}

	private static void addEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many employee you want to add? : ");
		int n = scanner.nextInt();
		employees = new Employee[n];
		// TODO Auto-generated method stub
		
		for (int i = 0; i< employees.length; i++) {
			System.out.println("Please input information for employee[" + (i+1) + "]");
			System.out.println("Name : ");
			Scanner scannerName = new Scanner(System.in);
			String name = scannerName.nextLine();
			System.out.println("Salary : ");
			double salary = scanner.nextDouble();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("Job name : ");
			String jobName = scanner.next();
			
			Employee employee = new Employee(name, (i + 1), salary, age, false, new Job((i + 1), jobName));
			employees[i] = employee;
		}
		
	}

}
