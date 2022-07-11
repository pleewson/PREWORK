public class Imieniny {
    /**  https://pl.spoj.com/problems/MWPZ06D/  */

    public static void main(String[] args){

        int dataInformation; // D (1 ≤ D ≤ 500)
        // L i C (1 ≤ L, C ≤ 109) oznaczających odpowiednio liczbę osób
        // w klasie Jasia oraz liczbę cukierków, które kupiła mama.


        int amoutPeople =  Integer.parseInt(args[0]);
        int amoutsSweets = Integer.parseInt(args[1]);

if( 1 <= amoutPeople && 1 <= amoutsSweets ) {
            if (amoutPeople < amoutsSweets) {
                System.out.println("BON APETIT people" + (args[0]) + " - sweets" + (args[1]));
            } else {
                System.out.println("NOT ENOUGH SWEETS people" + (args[0]) + " - sweets" + (args[1]));

            }
        }



    }
}