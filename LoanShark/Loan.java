public class Loan {

    double rate;
    double year;
    double principal;
    int number;

    public Loan(double p, double r, double y, int number) {
        this.principal = p;
        // Divide by 100.0 to convert percentage (e.g., 6.75) to decimal (0.0675)
        this.rate = r / 100.0;
        this.year = y;
        this.number = number;
    }

    // Calculates simple interest: I = P * r * t
    double calculateSimpleInterest() {
        return this.principal * this.rate * this.year;
    }

    // Calculates compound interest repayment: A = P(1 + r/n)^(n*t)
    double calculateTotalRepayment() {
        double innerBase = 1.0 + (this.rate / this.number);
        double exponent = this.number * this.year;
        return this.principal * Math.pow(innerBase, exponent);
    }
}