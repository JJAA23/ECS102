public class Main {
    public static void main(String[] args) {
        // System.out.println("Welcome to the Interest Calculator!");

        // // Test Loan 1: $1,000 for 1 year at 10%, compounded 12 times/year
        // Loan loan1 = new Loan(1000, 10, 1, 12);
        // System.out.println("Loan 1 Simple Interest:   $" + loan1.calculateSimpleInterest());
        // System.out.println("Loan 1 Total Repayment:   $" + loan1.calculateTotalRepayment());

        // // Test Loan 2: $5,000 for 12.5 years at 6.75%, compounded 4 times/year
        // Loan loan2 = new Loan(5000, 6.75, 12.5, 4);
        // System.out.println("Loan 2 Simple Interest:   $" + loan2.calculateSimpleInterest());
        // System.out.println("Loan 2 Total Repayment:   $" + loan2.calculateTotalRepayment());

        // TODO: write for all customers 
        for (int i = 1; i <= 5; i++) {
            Customer c = Customer.generateRandom();
            System.out.println("--- Customer " + i + " ---");
            System.out.println("Name: " + c.getName());
            System.out.println("Credit Score: " + c.getCreditScore());
            System.out.println("Loan: $" + String.format("%.2f", c.getLoanAmount()));
            System.out.println("Defaulted? " + c.determineDefault());
            System.out.println();
        }

    }  // main method
} //class