public class SANDBOX {
    public static void main(String[] args){
        double myDouble= 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);

        String txt = "Hello";
        System.out.println(txt.toUpperCase());

        String firstName = "Jhon";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String msg = "Hello everybody";
        System.out.println(msg.indexOf("l"));

        int x = 100;
        Math.sqrt (x);
        System.out.println(Math.sqrt(x));

        int time = 23
                ;
        String result = (time < 18) ? "Good day" : "Good evening";
        System.out.println(result);

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue; //skip
            }
            System.out.println(i);
        }

        String xd = String.valueOf(2);
        int i = Integer.parseInt(xd);
        System.out.println(i);
    }
}
