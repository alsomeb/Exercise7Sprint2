package org.example;

public class Kapital {
    private double startKapital;
    private double ränta;
    private int years;

    public Kapital(double startKapital, double ränta, int years) {
        this.startKapital = startKapital;
        this.ränta = ränta;
        this.years = years;
    }

    public double getStartKapital() {
        return startKapital;
    }

    public void setStartKapital(int startKapital) {
        this.startKapital = startKapital;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setStartKapital(double startKapital) {
        this.startKapital = startKapital;
    }

    public double getRänta() {
        return ränta;
    }

    public void setRänta(double ränta) {
        this.ränta = ränta;
    }
}
