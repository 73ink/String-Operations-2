public class RepeatFrontText {
    public static String repeatFront(String originalText, int frontLength){
        String resultText = "";
        for (int index = frontLength; index > 0; index--){
            resultText += originalText.substring(0, index);
        }
        return resultText;
    }
    public static void main (String[] args){

    }
}
