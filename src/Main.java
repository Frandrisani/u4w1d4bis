import entities.Dipartimento;
import entities.Dipendete;

public class Main {
    public static void main(String[] args) {
        //Inizio Esercizio 1
        Dipendete dipendente1 = new Dipendete("123456", 1000.0, Dipartimento.PRODUZIONE);
        Dipendete dipendente2 = new Dipendete("789101", 950.0, Dipartimento.VENDITE);
        Dipendete dipendente3 = new Dipendete("121314", 2000.0, Dipartimento.AMMINISTRAZIONE);
        Dipendete listaDipendenti[] = {dipendente1, dipendente2, dipendente3};
        for (Dipendete dipendente : listaDipendenti) {System.out.println(dipendente);
        //Fine Esercizio 1
        //---------------------------------------------------------------

    }
    }
}