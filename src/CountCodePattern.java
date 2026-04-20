public class CountCodePattern {
    public static int countCode(String originalText) {
        int patternCount = 0;
        for (int index = 0; index < originalText.length() - 3; index++) {
            if (originalText.charAt(index) == 'c'
                    && originalText.charAt(index + 1) == 'o'
                    && originalText.charAt(index + 3) == 'e') {
                patternCount++;
            }
        }
        return patternCount;
    }

    public static void main (String[] args){
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));

    }
}
