import java.util.Locale;

public class Task_7 {
    public static void main(String[] args){
            double[] tempCelc = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
            double[] tempFaren = new double[13]; //{0,0,0,0,0,0,0,0,0,0,0,0,0};

            double suma = 0;

            String suma00;
            String tempFaren00;


        for (int i = 0; i < 13; i++){
                tempFaren[i] = tempCelc[i] * 1.8 + 32;
                tempFaren00 = String.format(Locale.ENGLISH, "%.2f", tempFaren[i]);

                System.out.println(tempCelc[i] +" tempCelc -> tempFaren = " + tempFaren00);
                suma += tempFaren[i];
            }
        System.out.println();

           suma /= tempFaren.length;

           suma00 = String.format(Locale.ENGLISH, "%.2f", suma);
        System.out.println("ŚREDNIA: " + suma00);

    }
}



