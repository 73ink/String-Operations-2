public class RepeatEndingText {
    public static String repeatEnd(String originalText, int repeatCount){
        String repeatedText = "";
        String endingPart = originalText.substring(originalText.length() - repeatCount);
        for (int index =0; index < repeatCount; index++){
            repeatedText += endingPart;
        }
        return repeatedText;

    }
    public static void main (String[] args){
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }
}
