public class Doctor {
    private int id;
    private String nume;
    private String specializare;

    public Doctor(int id, String nume, String specializare) {
        this.id = id;
        this.nume = nume;
        this.specializare = specializare;
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

    public String getSpecializare() {
        return this.specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public String getDetaliiDoctor() {
        return "ID medic: " + this.id + "; Nume: " + this.nume + "; Specializare: " + this.specializare;
    }
}
