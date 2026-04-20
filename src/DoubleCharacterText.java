public class DoubleCharacterText {

    public static String doubleChar(String originalText) {
        String doubledText = "";
        for (int index = 0; index < originalText.length(); index++) {
            char currentCharacter = originalText.charAt(index);
            doubledText += currentCharacter;
            doubledText += currentCharacter;
        }
        return doubledText;
    }

    public static void main(String[] args) {

    }
}