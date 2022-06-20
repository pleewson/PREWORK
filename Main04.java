public class Main04 {
    public static void main(String[] args){
        String str1 = "Kurs";
        String str2 = "Java";

        String joinedStrings = str1+ " " + str2;
        System.out.println(joinedStrings);



        for (int i = 1; i < 11; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while (i < 11){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();


        int[] numbers = {4, 643, 112, 9999, 69};
        int sum0dd = 0;

        for(int j = 0; j < numbers.length; j++){
            if(numbers[j] %2 == 0){
                System.out.println(numbers[j]);
            }else{
                sum0dd = sum0dd += numbers[j];
            }
        }
        System.out.println("SUMA: " + sum0dd);




        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if((a+b)>c){
            if((c+b)>a){
                if((a+c>b)){
                    System.out.println("YES");
                }
            }
        }else{
            System.out.println("NO");

        }

    }
}
