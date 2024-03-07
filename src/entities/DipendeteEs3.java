package entities;
import interfaces.CheckIn;

import java.util.Scanner;

public class DipendeteEs3 implements CheckIn {
    //attributes
    private String matricola;
    private Double stipendio;
    private Dipartimento dipartimento;

    //constructor
    public DipendeteEs3(String matricola, Double stipendio, Dipartimento dipartimento) {
        this.matricola =matricola;
        this.stipendio =stipendio;
        this.dipartimento =dipartimento;
    }

    //methods getter and setter
    public String getMatricola() {
        return matricola;
    }

    public Double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //methods


    @Override
    public String toString() {
        return "Dipendete{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }

    @Override
    public void checkIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'orario di inzio: ");
        int orarioInizio = scanner.nextInt();
        System.out.println("matricola: " + matricola+ ", Stipendio: " + stipendio + ", Dipartimento: " + dipartimento + ", orario di inizio: " + orarioInizio);
    }
}
