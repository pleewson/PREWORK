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


       int num = Integer.parseInt(args[0]);
      // int j = 1;

       for (int i = 1; i <= num; i++){
           System.out.println();
           for (int j = 1; j <= num; j++){
               System.out.printf("%d * %d = %d \n" ,i, j, i * j);

           }

           //for(int j = 1; j <= num; j++)
          /* if (i == num){
               j++;
               System.out.println();
               System.out.printf("%d * %d = %d \n", j, i, j * i);

           */


           }


      //     System.out.printf("%d * %d = %d \n", j, i, j * i);

       }

}


