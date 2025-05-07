import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ClinicaMedicala {
    private List<Doctor> listaMedici = new ArrayList();
    private List<Pacient> listaPacienti = new ArrayList();
    private List<Programare> listaProgramari = new ArrayList();

    public ClinicaMedicala() {
    }

    public List<Doctor> getListaMedici() {
            return this.listaMedici;
    }
    public void setListaMedici(List<Doctor> listaMedici) {
            this.listaMedici = listaMedici;
        }

    public List<Pacient> getListaPacienti() {
            return this.listaPacienti;
        }

    public void setListaPacienti(List<Pacient> listaPacienti) {
            this.listaPacienti = listaPacienti;
        }

    public List<Programare> getListaProgramari() {
            return this.listaProgramari;
        }

    public void setListaProgramari(List<Programare> listaProgramari) {
            this.listaProgramari = listaProgramari;
        }

    public void creazaProgramare(Programare programare) {
            this.listaProgramari.add(programare);
        }

    public void adaugaPacient(Pacient pacient) {
            this.listaPacienti.add(pacient);
        }

    public void adaugaDoctor(Doctor doctor) {
            this.listaMedici.add(doctor);
        }

    public String raportActivitateDoctor(Doctor doctor) {
        int countProgramari = 0;
        Iterator var3 = this.listaProgramari.iterator();

        while(var3.hasNext()) {
            Programare p = (Programare)var3.next();
            if (p.getDoctor() == doctor) {
                ++countProgramari;
            }
        }

        String var10000 = doctor.getNume();
        return "Medicul " + var10000 + " a avut/are " + countProgramari + " programari.";
    }

    public String statisticiPacienti() {
        StringBuilder str = new StringBuilder();
        str.append("In total sunt " + this.listaPacienti.size() + " pacienti inregistrati. ");
        return str.toString();
    }
}
