public class RepeatFrontText {
    public static String repeatFront(String originalText, int frontLength){
        String resultText = "";
        for (int index = frontLength; index > 0; index--){
            resultText += originalText.substring(0, index);
        }
        return resultText;
    }
    public static void main (String[] args){
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate", 3));
        System.out.println(repeatFront("Ice Cream", 2));
    }
}
