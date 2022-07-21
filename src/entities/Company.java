package entities;

public class Company extends TaxPayer {

	private int numberofEmployees;

	public Company() {
		super();
	}

	public Company(String name, double anualIncome, int numberofEmployees) {
		super(name, anualIncome);
		this.numberofEmployees = numberofEmployees;
	}

	public int getNumberofEmployees() {
		return numberofEmployees;
	}

	public void setNumberofEmployees(int numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}

	@Override
	public double tax() {
		if (numberofEmployees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}
}
