public class Main06 {
    public static void main(String[] args){

       /** int num = 3;

        for (int i = 1; i <= num; i++){
            //System.out.printf("%d * %d = %d \n", num, i, num * i);
           // System.out.println(num + " * " + i + " = " + num*i);

        }
        */

        //TABLICZKA MNOŻENIA
       /** int value = 3;

        for(int i = 1; i<11; i++){
            System.out.printf("%d * %d = %d \n",value, i, i * value); // 1 * 2,  2 * 2
        */


       int num = 3;
       int j = 1;

       for(int i = 1; i <= num; i++){
           System.out.printf("%d * %d = %d \n", j, i, j * i);

           //for(int j = 1; j <= num; j++)
           if (i == num){
               j++;
               System.out.println();
               System.out.printf("%d * %d = %d \n", j, i, j * i);

           }


      //     System.out.printf("%d * %d = %d \n", j, i, j * i);

       }

        }

    }

