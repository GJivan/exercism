public class SalaryCalculator {

    private static final double capSalary = 2000.00;

    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped > 5 ? .85 : 1;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = (1000.000 * multiplierPerDaysSkipped(daysSkipped))
                + bonusForProductSold(productsSold);
        return Math.min(baseSalary, capSalary);
    } 
}
