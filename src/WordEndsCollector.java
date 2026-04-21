public class WordEndsCollector {
    public static String wordEnds(String originalText, String targetWord) {
        String collectedText = "";
        for (int index = 0; index <= originalText.length() - targetWord.length(); index++) {
            if (originalText.substring(index, index + targetWord.length()).equals(targetWord)) {
                if (index > 0) {
                    collectedText += originalText.charAt(index - 1);
                }

                if (index + targetWord.length() < originalText.length()) {
                    collectedText += originalText.charAt(index + targetWord.length());
                }
            }
        }
        return collectedText;
    }
    public static void main (String[] args){
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }
}
