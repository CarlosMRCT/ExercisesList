package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employees;

public class Main {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		System.out.println("How many employees will be registered? ");
		int q = tc.nextInt();

		List<Employees> list = new ArrayList<>();
		for (int i = 0; i < q; i++) {
			
			System.out.println("Employee" + (i + 1) + ":");
			System.out.println("ID:");
			int id = tc.nextInt();
			System.out.println("name:");
			tc.nextLine();
			String name = tc.nextLine();
			System.out.println("salary:");
			double salary = tc.nextDouble();
			Employees emp = new Employees(id, name, salary);
			list.add(emp);

		}

		System.out.println("Enter the employee id that will have a salary increase: ");
		int idSalary = tc.nextInt();
		boolean found = false;
		for (Employees emp : list) {
			if (emp.getId() == idSalary) {
				found = true;
				System.out.println("Enter the percentage: ");
				Double percentage = tc.nextDouble();
				emp.IncreaseSalary(percentage);
				break;

			}

			if (!found) {
				System.out.println("This id does not exist!");
			}
			break;
		}

		for (Employees emp1 : list) {
			System.out.println(emp1);
		}
		tc.close();
	}
}
