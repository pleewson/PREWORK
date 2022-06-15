public class loops6 {
    public static void main(String[] args){

        int n = 6;
        for ( n = 0; n < 7; n++){
            if ( n % 2 == 0) { // 0%2 = parzyste, 1/2 1 nie 2/2 0 parz 3/2 1 nie parz 4/2 2 parz
                System.out.println(n + " - parity");
            } else {
                    System.out.println(n + " - odd");
                }

            }
        }
    }

