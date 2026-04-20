public class MixedStringBuilder {
    public static String mixString(String firstText, String secondText) {
        String mixedText = "";
        int maximumLength = Math.max(firstText.length(), secondText.length());

        for (int index = 0; index < maximumLength; index++) {
            if (index < firstText.length()) {
                mixedText += firstText.charAt(index);
            }

            if (index < secondText.length()) {
                mixedText += secondText.charAt(index);
            }
        }
        return mixedText;
    }
    public static void main (String[] args){

    }
}
