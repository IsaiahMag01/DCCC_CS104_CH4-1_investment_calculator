public class Main {
    /**
     * Main Method to run program
     */
    public static void main(String[] args) {
        final double RATE = 0.05;   //The rate is fixed and should never change in the program itself
        final double TARGET = 20_000; //Terminator for the program
        double balance = 10_000;
        int year = 0;

        while (balance < TARGET) {
            year++;
            double interest = balance * RATE;
            balance = balance + interest;
        }

        System.out.printf("Within %d year(s) you will have a balance of %8.2f dollars", year, balance);

    }
}
