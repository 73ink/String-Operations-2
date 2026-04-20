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
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }
}