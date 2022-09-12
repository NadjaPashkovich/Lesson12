import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();

        int a = 10;
        int b = 20;

        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(b - a + 1) + a + " ");


        }


    }

}
