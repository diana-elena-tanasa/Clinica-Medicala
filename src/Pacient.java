public class Pacient {
    private int id;
    private String nume;
    private String dataNasterii;
    private FisaMedicala fisaMedicala;

    public Pacient(int id, String nume, String dataNasterii) {
        this.id = id;
        this.nume = nume;
        this.dataNasterii = dataNasterii;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDataNasterii() {
        return this.dataNasterii;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public FisaMedicala getFisaMedicala() {
        return this.fisaMedicala;
    }

    public void setFisaMedicala(FisaMedicala fisaMedicala) {
        this.fisaMedicala = fisaMedicala;
    }

    public String getDetaliiPacient() {
        return "ID pacient: " + this.id + "; Nume: " + this.nume + "; data nasterii: " + this.dataNasterii + ".";
    }
}
