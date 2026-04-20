public class BobPatternCheck {
    public static boolean bobThere(String originalText) {
        for (int index = 0; index < originalText.length() - 2; index++) {
            if (originalText.charAt(index) == 'b' && originalText.charAt(index + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args){

    }
}
