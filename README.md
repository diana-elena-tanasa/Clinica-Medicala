# ClinicaMedicala

**ClinicaMedicala** este o aplicație Java de tip console, care simulează funcționarea de bază a unei clinici medicale. 
Scopul proiectului este de a gestiona pacienți, doctori, programări și fișe medicale într-un mod structurat și orientat pe obiecte.

---

## Clasele principale

| Clasă             | Descriere                                                                 |
|------------------|--------------------------------------------------------------------------|
| `Pacient`         | Reprezintă un pacient, cu date personale, istoric medical și programări. |
| `Doctor`          | Reprezintă un doctor din clinică, cu specializare și program.            |
| `Programare`      | Asociază un pacient cu un doctor într-un anumit interval orar.           |
| `FisaMedicala`    | Conține istoricul medical al unui pacient, diagnostice și tratamente.    |
| `ClinicaMedicala` | Clasa centrală care gestionează funcționarea clinicii (liste, programări etc.). |

---

## Funcționalități de bază

- Adăugarea de pacienți și doctori în sistem
- Crearea și gestionarea programărilor medicale
- Asocierea unei fișe medicale fiecărui pacient
- Căutarea pacienților sau doctorilor după criterii specifice
- Validarea programărilor (fără suprapuneri)

---

## Tehnologii folosite

- Java SE (Programare orientată pe obiecte)
- Colectii (`List`, `Map`)
- Enum-uri și clase model
- Sisteme de validare și filtrare de bază

---

## Cum rulezi proiectul

1. Clonează repository-ul: https://github.com/diana-elena-tanasa/ClinicaMedicala.git
2. Deschide proiectul în IntelliJ IDEA sau alt IDE compatibil cu Java
3. Rulează metoda main() din clasa ClinicaMedicala sau dintr-o clasă Main (dacă ai una separată)

## Ce am învățat
- Aplicarea principiilor OOP (moștenire, compoziție, incapsulare)
- Modelarea datelor reale într-un sistem software
- Gestionarea relațiilor între entități într-o aplicație simplă
- Lucrul cu liste, obiecte complexe și metode de căutare