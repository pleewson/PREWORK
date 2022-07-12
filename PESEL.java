public class PESEL {
    public static void main(String[] args) {

        /*
Pierwszą cyfrę mnożymy przez 1,
drugą cyfrę mnożymy przez 3,
trzecią cyfrę mnożymy przez 7,
czwarta cyfrę mnożymy przez 9,
piątą cyfrę mnożymy przez 1,
szóstą cyfrę mnożymy przez 3,
siódmą cyfrę mnożymy przez 7,
ósmą cyfrę mnożymy przez 9,
dziewiątą cyfrę mnożymy przez 1,
dziesiątą cyfrę mnożymy przez 3,
jedenastą cyfrę mnożymy przez 1.

Tak uzyskane 11 iloczynów dodajemy do siebie. Jeśli ostatnia cyfra tej sumy jest zerem to podany PESEL jest prawidłowy. Przykład dla numeru PESEL 44051401458

4*1 + 4*3 + 0*7 + 5*9 + 1*1 + 4*3 + 0*7 + 1*9 + 4*1 + 5*3 + 8*1 = 4 + 12 + 0 + 45 + 1 + 12 + 0 + 9 + 4 + 15 + 8 = 110


         */

        //int [] tablePESEL = new int [11];
        int[] tablePESEL = {9,7,3,5,6,2,4,6,6,4,3};
        int suma = 0;

        tablePESEL[0] *= 1;
        tablePESEL[1] *= 3;
        tablePESEL[2] *= 7;
        tablePESEL[3] *= 9;
        tablePESEL[4] *= 1;
        tablePESEL[5] *= 3;
        tablePESEL[6] *= 7;
        tablePESEL[7] *= 9;
        tablePESEL[8] *= 1;
        tablePESEL[9] *= 3;
        tablePESEL[10] *= 1;

        for (int i = 0; i < tablePESEL.length; i++) {
            suma = suma + tablePESEL[i];
        }
        System.out.println(suma);


        int lastDigit = 0;
        lastDigit = suma%10;

        if (lastDigit == 0){
            System.out.println("D");
        }else{
            System.out.println("N");
        }



        }
        

    }


