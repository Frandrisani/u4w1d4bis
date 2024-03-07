package entities;

import java.util.Scanner;

public class DipendentePartTime extends DipendenteAbstract {

    private double oreLavorative;
    private double bonus;

    private double stipendio;
    public DipendentePartTime(String matricola, Dipartimento dipartimento, double oreLavorative, double bonus) {
        super(matricola, dipartimento);
        this.oreLavorative = oreLavorative;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculating salary! Insert the number of working hours:");
        double oreLavorative = scanner.nextDouble();
        System.out.println("Insert the number of bonus:");
        double bonus = scanner.nextDouble();
        return this.stipendio = oreLavorative * 50 + bonus * 150;
    }
}
