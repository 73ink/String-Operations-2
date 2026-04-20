public class CountHiText {
    public static int countHi(String originalText) {
        int hiCount = 0;
        for (int index = 0; index < originalText.length() - 1; index++) {
            String currentPart = originalText.substring(index, index + 2);

            if (currentPart.equals("hi")) {
                hiCount++;
            }
        }
        return hiCount;
    }

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
    }
}
