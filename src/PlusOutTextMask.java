public class PlusOutTextMask {
    public static String plusOut(String originalText, String keepWord) {
        String resultText = "";
        int index = 0;

        while (index < originalText.length()) {
            if (index <= originalText.length() - keepWord.length()
                    && originalText.substring(index, index + keepWord.length()).equals(keepWord)) {
                resultText += keepWord;
                index += keepWord.length();
            } else {
                resultText += "+";
                index++;
            }
        }
        return resultText;
    }
    public static void main (String[] args){

    }
}
