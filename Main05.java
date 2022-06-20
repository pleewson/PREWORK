public class Main05 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        double nr1 = 5.1;
        float nr2 = 5.0f;
        boolean result = nr1 > nr2;

        System.out.println(result);


        int resultFor = 0;
        int resultWhile = 0;

        for (int i = 1; i < 11; i++) {
            resultFor += i;
        }
        System.out.println(resultFor);


        int j = 1;
        while (j < 11) {
            resultWhile += j;
            j++;
        }
        System.out.println(resultWhile);


        int[] numbers = {4, 643, 112, 9999, -69, -122, -30};
        int min = 0;

        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] < min) {
                min = 0;
                min += numbers[x];
            }
        }
        System.out.println("MIN: " + min);


        /**
         0-50 pkt – F
         51-70 pkt – E
         71-90 pkt – C
         91-100 pkt – A

         1.Utwórz zmienną points, do której będzie przypisana wartość parametru startowego.
         Na początku sprawdź, czy liczba punktów jest:
         większa bądź równa 0, jeśli nie – wypisz na konsoli komunikat: BADVALUE;
         mniejsza bądź równa 100, jeśli nie – wypisz na konsoli komunikat: BADVALUE.
         Następnie sprawdź jaka ocena odpowiada danej liczbie punktów i wypisz jej symbol na konsoli.
         Rozwiąż to zadanie używając konstrukcji if ... else if ... else.
         */

        int points = Integer.parseInt(args[0]);

        if (points >= 0) {
            if (points <= 100) {

                if (points >= 91) {
                    System.out.println("A");
                } else if (points >= 71) {
                    System.out.println("C");
                } else if (points >= 51) {
                    System.out.println("E");
                } else if (points >= 0) {
                    System.out.println("F");
                }
            } else {
                System.out.println("BADVALUE");
            }
        } else {
            System.out.println("BADVALUE");
        }
    }
}
