public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

    private static int maxLoanBorrower =0;

    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;

        if (amount > maxLoanBorrower) {
            maxLoanBorrower = amount;
        }
    }

    public static int getMaxLoanBorrower() {
        return maxLoanBorrower;
    }

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDisplayString(){
        return borrower + ": " + amount;
    }

    public double getProfit(){
        return amount*interestRate;
    }
}
