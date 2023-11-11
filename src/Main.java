public class Main {
    /**
     * Main Method to run program
     * @param main
     */
    public static void main(String[] args) {
        final double RATE = 0.05;   //The rate is fixed and should never change in the program itself
        final double TARGET = 0.05; //Terminator for the program
        double balance = 10_000;
        int year = 0;

        while (balance < TARGET) {
            year++;
            double interest = balance * RATE;
            balance = balance + interest;
        }

        System.out.println("Within " + year + " year(s) you will have a balance of " + balance + " dollars");

    }
}
