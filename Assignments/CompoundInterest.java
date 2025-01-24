package Assignments;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.05;
        int time = 5;
        double ci = calculateCI(principal, rate, time);
        System.out.println("Compound Interest: " + ci);

    }

    static double calculateCI(double principal, double rate, int time) {
        return (principal * Math.pow(1 + rate, time));
    }
}
