package array;

public class LongestPalindrome1 {
    public static void main(String[] args) {
        int x[] = {121, 12, 1221, 32, 34, 2332};
        int size = x.length;
        palindromeNumber(x, size);


    }

    public static void palindromeNumber(int x[], int size) {
        int y[] = new int[size];
        for (int i = 0; i < size; i++) {
            int temp = x[i], r, sum = 0;
            while (temp > 0) {
                r = temp % 10;
                sum = (sum * 10) + r;
                temp =temp / 10;
            }
            if (x[i] == sum) {
                System.out.println(x[i] + " : is palindrome");
                y[i] = x[i];
            }
            else {
                System.out.println(x[i]+" : not Palindrome");
            }
        }
        int largest=y[0];
        for(int j=0;j<y.length;j++){
            if(largest<y[j]){
                largest=y[j];
            }
        }
        System.out.println("Largest palindrome number is :"+largest);

    }
}







//        for (int i = 0; i < x.length; i++) {
//            temp = x[i];
//            while (x[i] > 0) {
//                r = x[i] % 10;
//                sum = (sum * 10) + r;
//                x[i] = x[i] / 10;
//            }
//            if(temp==sum){
//                System.out.println("Palindrome");
//            }
//            else
//            {
//                System.out.println("Not Palindrome");
//            }
//        }




