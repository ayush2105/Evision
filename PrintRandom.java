package stream;

import java.util.Random;

public class PrintRandom {
    public static void main(String[] args) {
        Random r=new Random();
            r.ints().limit(10).sorted().forEach(System.out::println);
    }
}
