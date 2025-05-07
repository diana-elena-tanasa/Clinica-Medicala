public class Main {
    public static void main(String[] args) {
        ClinicaMedicala clinica = new ClinicaMedicala();
        Doctor doctor1 = new Doctor(1,"Oprescu", "Medicina interna");
        Doctor doctor2 = new Doctor(2, "Popa", "cardiologie");
        Doctor doctor3 = new Doctor(3, "Munteanu", "pneumologie");
        clinica.adaugaDoctor(doctor1);
        clinica.adaugaDoctor(doctor2);
        clinica.adaugaDoctor(doctor3);
        System.out.println(doctor1.getDetaliiDoctor());
        System.out.println(doctor2.getDetaliiDoctor());
        System.out.println(doctor3.getDetaliiDoctor());
        Pacient pacient1 = new Pacient(1, "Stan", "04-10-1979");
        Pacient pacient2 = new Pacient(2, "Popescu", "17-01-1958");
        Pacient pacient3 = new Pacient(3, "Ionescu", "12-02-1978");
        Pacient pacient4 = new Pacient(4, "Andronache", "17-12-1988");
        clinica.adaugaPacient(pacient1);
        clinica.adaugaPacient(pacient2);
        clinica.adaugaPacient(pacient3);
        clinica.adaugaPacient(pacient4);
        System.out.println(pacient1.getDetaliiPacient());
        System.out.println(pacient2.getDetaliiPacient());
        System.out.println(pacient3.getDetaliiPacient());
        System.out.println(pacient4.getDetaliiPacient());
        clinica.creazaProgramare(new Programare(1, pacient1, doctor1,"02-04-2025"));
        clinica.creazaProgramare(new Programare(2, pacient2, doctor2,"20-03-2025"));
        clinica.creazaProgramare(new Programare(3, pacient3, doctor1,"15-04-2025"));
        clinica.creazaProgramare(new Programare(4, pacient4, doctor3,"10-03-2025"));
        clinica.creazaProgramare(new Programare(5, pacient2, doctor3,"08-04-2025"));
        clinica.creazaProgramare(new Programare(6, pacient4, doctor2,"12-03-2025"));
        FisaMedicala f1 = new FisaMedicala(pacient1);
        f1.actualizeazaFisaMedicala("tahicardie", "medicament X");
        FisaMedicala f2 = new FisaMedicala(pacient2);
        f2.actualizeazaFisaMedicala("pneumonie", "medicament Y");
        System.out.println(clinica.raportActivitateDoctor(doctor1));
        System.out.println(clinica.statisticiPacienti());
        System.out.println(f1.genereazaReteta());
    }
}