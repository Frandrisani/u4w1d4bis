package entities;

import interfaces.CheckIn;

import java.util.Scanner;

public class Volontario implements CheckIn {

    //attributes
    private String nome;
    private int eta;
    private String CV;


    //constructor
    public Volontario(String nome, int eta, String CV) {
        this.nome =nome;
        this.eta = eta;
        this.CV = CV;
    }


    @Override
    public void checkIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'orario di inzio: ");
        int orarioInizio = scanner.nextInt();
        System.out.println("Nome: " + nome + ", eta: " + eta + ", CV: " + CV + ", orario di inizio: " + orarioInizio);
    }
}
