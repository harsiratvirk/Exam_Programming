class Skatt {
    private String navn;
    private String adresse;
    private double lønn;
    private double skatt;

    // Skatt legges ikke i konstruktøren, da attributten blir brukt i og hentes fra beregn-metoden
    public Skatt(String navn, String adresse, double lønn) {
        this.navn = navn;
        this.adresse = adresse;
        this.lønn = lønn;
    }

    // Metode for å beregne skatt ut fra lønn
    public void beregn() {
        if(lønn < 50_000) {
            skatt = 0;
        }
        else if(lønn > 50_000 && lønn < 150_000) {
            skatt = (lønn * 25) / 100;
        }
        else {
            skatt = (lønn * 35) / 100;
        }
    }

    // Metode for å formaterer resultatet
    @Override
    public String toString() {
        return navn + "," + adresse + "\n" +
                "Lønn: " + lønn + " Skatt: " + skatt;
    }
}

public class Oppg3 {
    public static void main(String[] args) {
        // Oppretter et skatte objekt for Per
        400000);
        // Henter metoden for å beregne skatten til Per
        Per.beregn();

        /* Skriver ut resultatet (ikke nødvendig med kall på toString, da dette skjer automatisk) */
        System.out.println(Per);
    }
}