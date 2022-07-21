package entities;

public class Individual extends TaxPayer {

	private double healthSpending;

	public Individual() {
		super();
	}

	public Individual(String name, double anualIncome, double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double tax() {
		if (getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - (healthSpending * 0.50);
		} else {
			return getAnualIncome() * 0.25 - (healthSpending * 0.50);
		}
	}
}
