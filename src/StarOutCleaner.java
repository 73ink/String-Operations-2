public class StarOutCleaner {
    public static String starOut(String originalText) {
        String cleanedText = "";
            for (int index = 0; index < originalText.length(); index++) {
                if (originalText.charAt(index) == '*') {
                    continue;
                }

                if (index > 0 && originalText.charAt(index - 1) == '*') {
                    continue;
                }

                if (index < originalText.length() - 1 && originalText.charAt(index + 1) == '*') {
                    continue;
                }

                cleanedText += originalText.charAt(index);
            }
        return cleanedText;
    }
    public static void main (String[] args){

    }
}
