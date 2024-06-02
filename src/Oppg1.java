public class Oppg1 {
    public static void main(String[] args) {
        int [] liste = {-3,41,5,-3,2,49};

        // a) Teller opp hvor mange tall som er større enn 10 og skriver ut resultatet
        int teller = 0;
        for (int i = 0; i < liste.length; i++) {
            if(liste[i] > 10) {
                teller++;
            }
        }
        System.out.println("Antall tall større enn 10: " + teller);

        // b) Skriver ut annethvert element
        String ut = " ";
        for (int i = 0; i < liste.length; i+=2) {
            ut += liste[i] + " ";
        }
        System.out.println("Annenhvert element:" + ut);

        // c) Skriver ut summen av alle positive tall i arrayet
        int sum = 0;
        teller = 0;
        for (int i : liste) {
            if(i > 0) {
                sum += i;
                teller++;
            }
        }
        System.out.println("Summen av alle positive tall: " + sum);

        // d) Skriver ut gjennomsnittet av alle positive tall i arrayet
        // "caster" sum til desimaltall for riktig omgjøring
        double snitt = (double) sum / teller;
        System.out.println("Gjennomsnittet av alle positive tall: " + snitt);
    }
}