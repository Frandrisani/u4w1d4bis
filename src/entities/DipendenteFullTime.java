package entities;

import java.util.Scanner;

public class DipendenteFullTime extends DipendenteAbstract {

    //attributes
    private double oreLavorative;
    private double oreExtra;
    private double stipendio;

    //constructor
    public DipendenteFullTime(String matricola, Dipartimento dipartimento, double oreLavorative, double oreExtra) {
        super(matricola, dipartimento);
        this.oreLavorative = oreLavorative;
        this.oreExtra = oreExtra;
    }

    //methods
    @Override
    public double calculateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculating salary! Insert the number of working hours:");
        double oreLavorative = scanner.nextDouble();
        System.out.println("Insert the number of extra hours:");
        double oreExtra = scanner.nextDouble();
       return this.stipendio = oreLavorative * 100 + oreExtra * 150;
    }
}
