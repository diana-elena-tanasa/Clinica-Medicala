public class Programare {
    private int id;
    private Pacient pacient;
    private Doctor doctor;
    private String dataOra;

    public Programare(int id, Pacient pacient, Doctor doctor, String dataOra) {
        this.id = id;
        this.pacient = pacient;
        this.doctor = doctor;
        this.dataOra = dataOra;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pacient getPacient() {
        return this.pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDataOra() {
        return this.dataOra;
    }

    public void setDataOra(String dataOra) {
        this.dataOra = dataOra;
    }

    public String getDetaliiProgramare() {
        int var10000 = this.id;
        return "ID: " + var10000 + "; Pacient: " + String.valueOf(this.pacient) + "; Doctor: " + String.valueOf(this.doctor) + "; data si ora: " + this.dataOra + ".";
    }
}
