public class loops5 {
    public static void main(String[] args){

        int resultFor = 0;
        int resultWhile = 0;

        for(int i = 1; i < 11; i++){
           resultFor += i;
        }
        System.out.println(resultFor);

        int j = 1;
        while(j < 11){
          resultWhile += j;  // 0 + 1, 0 + 2, 0 + 3, 0 + 4, 0 + 5,... 6 7 8 9 10 = 55
            j++;
        }
        System.out.println(resultWhile);
    }
}
