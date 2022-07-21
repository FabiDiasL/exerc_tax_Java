package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIcome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthSpending = sc.nextDouble();

				list.add(new Individual(name, anualIcome, healthSpending));
			} else if (ch == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double anualIcome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberofEmployees = sc.nextInt();

				list.add(new Company(name, anualIcome, numberofEmployees));
			} else {
				System.out.println("Enter a valid option (i/c)! ");
				i--;
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
			sum += tp.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}
}
