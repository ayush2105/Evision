package array;

public class SeperateCharAndDigit {
    public static void main(String[] args) {
        String s="abcdif12e11r";
        stringSplit(s);
    }
    public static void stringSplit(String s){
        StringBuffer num=new StringBuffer(), alphabhetic=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num.append(s.charAt(i));
            }
            else if(Character.isAlphabetic(s.charAt(i))){
                alphabhetic.append(s.charAt(i));
            }
        }
        System.out.println(num);
        System.out.println(alphabhetic);
    }
}
