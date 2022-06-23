public class Main07 {
    public static void main(String[] args) {

        int paramStart = Integer.parseInt(args[0]);
        int x;
        int y;


        for (x = 1; x < 2; x++) {
             System.out.printf("%d! = ", paramStart);
            for (y = x; y <= paramStart; y++){
                x *= y;
            }
            System.out.print(x);

        }

    }
}





