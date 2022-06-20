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



        int[] numbers = {4, 643, 112, 9999, 69};
        int sum = 0;

        for(int j = 0; j < numbers.length; j++){
            if(numbers[j] %= 2){
                System.out.println(numbers[j]);
            }
        }

    }
}
