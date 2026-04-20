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

    }
}
