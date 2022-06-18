public class Task_5 {
    public static void main(String[] args){

        int[] numbers = {4, 643, 112, 9999, -69};
        int min = 0;

        for( int i = 0; i < 6; i++){
            if ( min > numbers[i]){
                min = numbers[i];
// CO BY BYLO LEPSZE OD 0 ????
                System.out.println("MIN: " + min);
            }
        }

    }
}
