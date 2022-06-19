public class Main01 {
    public static void main(String[] args) {

        System.out.println("Hello World");

        int int1 = 1;
        char char2 = 'c';
        long long3 = 10;
        double double4 = 2.0;
        float float5 = 2.f;
        boolean boolean6 = true;

        int nr1 = 3;
        int nr2 = 7;

        if (nr1 > nr2) {
            System.out.println("Większa liczba to " + nr1);
        } else {
            System.out.println("Większa liczba to " + nr2);
        }


        int[] threeElements = {3, 4, 5};
        System.out.print(threeElements[0] + " " + threeElements[1] + " " + threeElements[2]);

        System.out.println();

        System.out.println(args[0] + " " + args[1] + " " + args[2] + " " + args[3]);






    }
}
