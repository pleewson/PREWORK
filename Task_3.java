public class Task_3 {
    public static void main(String[] args) {
        int[] numbers = {4, 643, 112, 9999, 69};
        int sum = 0;

        for (int i = 1; i < 5; i++) {
           sum += numbers[i]; // sum = 0+4, 0+643 itd
        }
        System.out.println("SUMA: " + sum);

    }
}