class Fag {
    private String navn;
    private String år;
    private Student[] studenter;

    // Konstruktør for attributtene
    public Fag(String navn, String år, Student[] studenter) {
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }

    // Get-set metoder for attributtene
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getÅr() {
        return år;
    }
    public void setÅr(String år) {
        this.år = år;
    }

    public Student[] getStudenter() {
        return studenter;
    }
    public void setStudenter(Student[] studenter) {
        this.studenter = studenter;
    }

    // Formaterer utskriften på en måte slik at den ikke inneholder noen nullpekere
    @Override
    public String toString() {
        String ut = "Fag: " + navn + ", år: " + år + "\n";
        for (Student enStudent : studenter) {
            if (enStudent != null) {
                ut += enStudent + "\n";
            }
        }
        return ut;
    }
}

class Student {
    private String navn;
    private String studNr;

    // Konstruktør for attributtene
    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    // Get-set metoder for attributtene
    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }
    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    // Formaterer utskriften
    @Override
    public String toString() {
        return "Student: " + "Navn=" + navn + ", StudNr=" + studNr;
    }
}

public class Oppg4 {
    public static void main(String[] args) {
        // Oppretter et array med plass til 10 studenter
        Student[] studenter = new Student[10];

        // Oppretter studentene Kari og Ole, og legger dem inn i arrayet
        Student Kari = new Student("Kari Olsen", "S234556");
        Student Ole = new Student("Ole Hansen", "S356734");
        studenter[0] = Kari;
        studenter[1] = Ole;

        // Oppretter et fag og begge studentene blir lagt inn. Så skrives disse ut via System.out
        Fag programmering = new Fag("Programmering", "2020", studenter);
        System.out.println(programmering);
    }
}