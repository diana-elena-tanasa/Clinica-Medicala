import java.util.ArrayList;
import java.util.List;

public class FisaMedicala {
    private Pacient pacient;
    private List<String> diagnostice;
    private List<String> tratamente;

    public FisaMedicala(Pacient pacient) {
        this.pacient = pacient;
        this.diagnostice = new ArrayList();
        this.tratamente = new ArrayList();
    }

    public Pacient getPacient() {
        return this.pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public List<String> getDiagnostice() {
        return this.diagnostice;
    }

    public void setDiagnostice(List<String> diagnostice) {
        this.diagnostice = diagnostice;
    }

    public List<String> getTratamente() {
        return this.tratamente;
    }

    public void setTratamente(List<String> tratamente) {
        this.tratamente = tratamente;
    }

    public void adaugaDiagnostic(String diagnostic) {
        this.diagnostice.add(diagnostic);
    }

    public void adaugaTratament(String tratament) {
        this.tratamente.add(tratament);
    }

    public void actualizeazaFisaMedicala(String diagnostic, String tratament) {
        this.adaugaDiagnostic(diagnostic);
        this.adaugaTratament(tratament);
    }

    public String genereazaReteta() {
        return "Tratamentul consta in: " + String.valueOf(this.getTratamente());
    }
}
