import entities.*;
import interfaces.CheckIn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Scegli l'esercizio da eseguire, 1, 2 o 3:");
        n = scanner.nextInt();
        switch (n) {
            case 1:
                //Inizio Esercizio 1
                Dipendete dipendente1 = new Dipendete("123456", 1000.0, Dipartimento.PRODUZIONE);
                Dipendete dipendente2 = new Dipendete("789101", 950.0, Dipartimento.VENDITE);
                Dipendete dipendente3 = new Dipendete("121314", 2000.0, Dipartimento.AMMINISTRAZIONE);
                Dipendete listaDipendenti[] = {dipendente1, dipendente2, dipendente3};
                for (Dipendete dipendente : listaDipendenti) {
                    System.out.println(dipendente);}
                    break;
                    case 2:
                        //Inizio Esercizio 2
                        DipendenteFullTime dipendenteFullTime1= new DipendenteFullTime("123456",  Dipartimento.PRODUZIONE, 50.0, 5.0);
                        DipendenteFullTime dipendenteFullTime2= new DipendenteFullTime("456789", Dipartimento.AMMINISTRAZIONE, 40.0, 10.0);
                        DipendentePartTime dipendentePartTime1= new DipendentePartTime("514844", Dipartimento.AMMINISTRAZIONE, 20.00, 20.00);
                        DipendentePartTime dipendentePartTime2= new DipendentePartTime("123456", Dipartimento.VENDITE, 30.00, 10.00);
                        DipendenteAbstract[] dipendenti = {dipendenteFullTime1, dipendenteFullTime2, dipendentePartTime1, dipendentePartTime2};
                        double sommaStipendio = 0.0;
                        for (DipendenteAbstract dipendente : dipendenti) {
                            if (dipendente instanceof DipendenteFullTime) {
                                System.out.println(dipendente);
                                sommaStipendio += ((DipendenteFullTime) dipendente).calculateSalary();
                            } else if (dipendente instanceof DipendentePartTime) {
                                System.out.println(dipendente);
                                sommaStipendio += ((DipendentePartTime) dipendente).calculateSalary();

                            }
                            System.out.println("Somma stipendio: " + sommaStipendio);
        }
                        break;
                    case 3:
                        //Esercizio 3
                        Volontario volontario1 = new Volontario("123456", 20, "CV1");
                        Volontario volontario2 = new Volontario("789101", 25, "CV2");
                        DipendeteEs3 dipendente5 = new DipendeteEs3("123456", 1000.0, Dipartimento.PRODUZIONE);
                        DipendeteEs3 dipendente6 = new DipendeteEs3("1123456", 800.0, Dipartimento.PRODUZIONE);
                       ;
                        CheckIn[] dipendentiw = { volontario1,  volontario2,  dipendente5, dipendente6};
                        for (CheckIn dipendente : dipendentiw) {
                            if (dipendente instanceof Volontario) {
                                 ((Volontario) dipendente).checkIn();
                            } else if (dipendente instanceof DipendeteEs3) {
                                ((DipendeteEs3) dipendente).checkIn();
                            }}
                        break;
                    default:
                        System.out.println("Errore!");

                }
        }
    }
