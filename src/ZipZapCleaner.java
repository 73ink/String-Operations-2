public class ZipZapCleaner {
    public static String zipZap(String originalText) {
        String cleanedText = "";
        for (int index = 0; index < originalText.length(); index++) {
            if (index > 0 && index < originalText.length() - 1
                    && originalText.charAt(index - 1) == 'z'
                    && originalText.charAt(index + 1) == 'p') {
                continue;
            }

            cleanedText += originalText.charAt(index);
        }
            return cleanedText;
    }
    public static void main (String[] args){
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }
}
