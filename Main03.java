public class Main03 {
    public static void main(String[] args){
        System.out.println("Dzisiaj zaczynam kurs");
        System.out.println("JAVA");
        System.out.println("w CodersLab");

        System.out.println();




        int nr1 = 5;
        int nr2 = 3;

        int result = nr1%nr2;
        System.out.println(result);

        System.out.println();




        for(int i = 0; i < 6; i++){
            System.out.println("Java");

        }
        System.out.println();

        int i = 0;
        while(i < 6){
            System.out.println("Java");
            i++;
        }
        System.out.println();



        int[] numbers = {4, 643, 112, 9999, 69};
        int sum = 0;

        for(int j = 0; j < numbers.length; j++){
            sum += numbers[j];
        }
        System.out.println(sum);

        System.out.println();




       int[] paramStart = Integer.parseInt(args[])
       float sum1 = 0;

       int d = 0;
       while(d<paramStart.length){
           sum1 += paramStart[];[d];
           d++;
       }

       float avarage = (sum1 / paramStart.length);
        System.out.println("avarage :" +avarage);



    }
}
