public class Main02 {
    public static void main(String[] args){
        System.out.println("Hello Java");
        System.out.println("Hello Coderslab");

        System.out.println();




        byte nr1 = 94;
        short nr2 = 257;

        int result;
        result = nr1 + nr2;

        System.out.println(result);

        System.out.println();




        int n1 = 3;
        int n2 = 7;
        int n3 = 11;

        if (n1>n2){  // 0>1 f
            System.out.println("Największa z liczb to " + n1);
        }else if (n2>n3){  // 1 > 2 f
            System.out.println("Największa z liczb to " + n2);
        }else{
            System.out.println("Największa z liczb to " +n3);
        }
        System.out.println();



        String[] fruits = {"apple", "banana", "berry"};
        System.out.println(fruits[0]);
        System.out.println(fruits[fruits.length-1]);

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println();



        System.out.println(args[3] + " " + args[2] + " " + args[1] + " " + args[0]);


    }
}
