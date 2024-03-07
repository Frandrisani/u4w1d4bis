package entities;

public abstract class DipendenteAbstract {

    //attributes
    private String matricola;

    private Dipartimento dipartimento;

    //constructor
    public DipendenteAbstract(String matricola, Dipartimento dipartimento) {
        this.matricola =matricola;
        this.dipartimento =dipartimento;
    }

    //methods getter and setter
    public String getMatricola() {
        return matricola;
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
                ", dipartimento=" + dipartimento +
                '}';
    }

    public abstract double calculateSalary();

}



