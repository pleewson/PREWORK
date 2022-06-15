public class Task_4 {
    public static void main(String[] args) {

        int[] numbers = {4, 643, 112, 9999, 69};

        {    int sum0dd = 0;

        for (int i = 0; i < 5; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " - parity");
            } else {
                sum0dd += numbers[i];
                //  System.out.println(numbers[sum0dd]);
            }
        }
            System.out.println("SUMA: " + sum0dd);
        }
    }

            // System.out.println(numbers[1]);
}


