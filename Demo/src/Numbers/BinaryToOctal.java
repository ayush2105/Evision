package Numbers;

public class BinaryToOctal {
    public static void main(String[] args) {
        String binary="100100";
        int decimal=Integer.parseInt(binary,2);
        System.out.println((Integer.toOctalString(decimal)));
    }
}
