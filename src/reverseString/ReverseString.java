package reverseString;

public class ReverseString {

    public static String reverseString(String str){
        StringBuilder builder = new StringBuilder("");
        for(int c = str.length()-1; c >= 0; c--){
            builder.append(str.charAt(c));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("aoba"));
    }
}
