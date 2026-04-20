public class RepeatSeparatorText {
    public static String repeatSeparator(String mainWord, String separatorText, int repeatCount){
        String resultText = "";
            for (int index = 0; index < repeatCount; index++){
                if (index >0){
                    resultText += separatorText;
                }
                resultText += mainWord;
            }

        return resultText;
    }
    public static void main (String[] args){

    }
}
