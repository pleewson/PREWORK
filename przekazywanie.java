public class przekazywanie {
    public static void podwajanie(int[] x){
        for (int i = 0; i < x.length; i++){
            x[i] = x[i] *2;
        }

    }

    public static void main(String[] args){
        int[] x = new int [1];
        x[0] = 10;

        System.out.println("Wartość przed podwojeniem " + x[0]);

        podwajanie(x);

        System.out.println("Wartość po podwojeniu " + x[0]);



    }
}
