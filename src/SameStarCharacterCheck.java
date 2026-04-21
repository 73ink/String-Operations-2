public class SameStarCharacterCheck {
    public static boolean sameStarChar(String originalText) {
        for (int index = 1; index < originalText.length() - 1; index++) {
            if (originalText.charAt(index) == '*') {
                if (originalText.charAt(index - 1) != originalText.charAt(index + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));
    }
}
