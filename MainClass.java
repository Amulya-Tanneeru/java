import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int randomNumber = random.nextInt((max - min) + 1) + min;
        System.out.println("Random number: " + randomNumber);
    }
}

