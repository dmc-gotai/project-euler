public class App {

    public static void main(String[] args) throws Exception {

        int n = 2;
        int numberBeforeN = 1;
        int sum = 0;

        while (n < 4_000_000) {
            int holder = n;
            if(n % 2 == 0){
                sum += n;
            }
            n += numberBeforeN;
            numberBeforeN = holder;           
        }

        System.out.println(sum);
    }
}
