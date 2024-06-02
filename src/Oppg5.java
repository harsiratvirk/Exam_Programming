import java.util.ArrayList;

class Bok {
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris) {
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "tittel: " + tittel + ", forfatter: " + forfatter +", pris: " + pris;
    }
}

class Papirbok extends Bok {
    /* Papirbok arver alle attributtene fra sin superklasse og består av et ekstra attributt */
    private int ISBN;

    /* Konstruktør for attributtene fra superklassen (super) og gjeldende klasse */
    public Papirbok(String tittel, String forfatter, double pris,int ISBN) {
        super(tittel, forfatter, pris);
        this.ISBN = ISBN;
    }

    /* Formaterer utskriften for papirboken. Nøkkelordet super blir brukt for å hente superklassen sin formatering av de arvede attributtene */
    @Override
    public String toString() {
        return "Papirbok = " + super.toString() + ", ISBN: " + ISBN;
    }
}

class Lydbok extends Bok {
    // Lydbok arver også fra Bok, men består av et ekstra attributt
    private int lendeminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lendeminutter) {
        super(tittel, forfatter, pris);
        this.lendeminutter = lendeminutter;
    }

    @Override
    public String toString() {
        return "Lydbok = " + super.toString() + ", lendeminutter: " + lendeminutter;
    }
}

public class Oppg5 {
    public static void main(String[] args) {
        // Oppretter objekt av hver type bok
        Papirbok HarryPotter = new Papirbok("Harry Potter","Per Olsen",150,12345);
        Lydbok HungerGames = new Lydbok("Hunger Games","Kari Olsen",200,30);

        // Legger bøkene inn i en ArrayList av type Bok
        ArrayList<Bok> bøker = new ArrayList<>();
        bøker.add(HarryPotter);
        bøker.add(HungerGames);

        // Skriver ut bøkene med en for-each løkke
        for(Bok enBok : bøker) {
            System.out.println(enBok);
        }
    }
}