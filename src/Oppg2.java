class Liste {

    // Metode som returnerer hvor mange elementer som er større enn null
    public static int positiveTall(int [] array) {
        int teller = 0;
        for(int i : array) {
            if(i > 0) {
                teller++;
            }
        }
        return teller;
    }

    // Metode som finner ut hvor mange ganger et bestemt tall forekommer
    public static int sammeTall(int [] array, int tall) {
        int teller = 0;
        for(int i : array) {
            if(i == tall) {
                teller++;
            }
        }
        return teller;
    }

    // Metode som finner det største tallet i arrayet
    public static int størsteTall(int [] array) {
        // Hvert tall sammenlignes med null.posisjon i arrayet (størst)
        int størst = array[0];
        for(int i : array) {
            if(i > størst) {
                størst = i;
            }
        }
        return størst;
    }
}

public class Oppg2 {
    public static void main(String[] args) {
        // Oppretter et heltallsarray for å kalle de ulike metodene
        int [] tallArray = {20,-2,45,65,12,-3,20};

        System.out.println("Alle positive tall: " + Liste.positiveTall(tallArray));
        // Opprettes en variabel som blir lagt inn som parameter i metoden under
        int tall = 20;
        System.out.println("Tallet " + tall + " forekommer " + Liste.sammeTall(tallArray,tall) + " ganger");
        System.out.println("Det største tallet er " + Liste.størsteTall(tallArray));
    }
}