package org.example;

public class Main {
    public Main() {
        Kapital kapital = new Kapital(100, 0.10, 10);
        System.out.println("""
                År           Summa
                -------------------
                """);
        calculateRäntaRekursion(kapital.getStartKapital(), kapital.getYears(), kapital.getRänta(), 0);
    }
    public void calculateRäntaRekursion(double startAmount, int totalYearsToCount, double ränta, int currentYearCounter) {
        if (currentYearCounter <= totalYearsToCount) {
            System.out.printf("%s             %.2f\n", currentYearCounter, startAmount);
            startAmount = startAmount * (ränta + 1); // så det blir tex från 0.04 till 1.04
            currentYearCounter++;
            calculateRäntaRekursion(startAmount, totalYearsToCount, ränta, currentYearCounter);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}