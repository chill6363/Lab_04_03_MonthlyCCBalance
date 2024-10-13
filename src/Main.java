import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double initBal = 5000;
        double interestRate = 1.17;
        double firstMonth = initBal * interestRate;
        double secondMonth = firstMonth * interestRate;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Interest due after one month: " + df.format(firstMonth));
        System.out.println("Interest due after two months: " + df.format(secondMonth));
    }
}