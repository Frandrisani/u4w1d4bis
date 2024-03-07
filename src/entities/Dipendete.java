package entities;
import interfaces.CheckIn;

public class Dipendete {
    //attributes
    private String matricola;
    private Double stipendio;
    private Dipartimento dipartimento;

    //constructor
    public Dipendete(String matricola, Double stipendio, Dipartimento dipartimento) {
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

    public void checkIn() {
        System.out.println("Checking in");
}
}
