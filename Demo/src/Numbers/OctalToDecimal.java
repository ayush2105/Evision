package Numbers;

public class OctalToDecimal {
    public static void main(String[] args) {
        String octal="512";
        int decimal;
            decimal = Integer.parseInt(octal, 8);
        System.out.println(decimal);
    }
}
