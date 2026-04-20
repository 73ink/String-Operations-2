public class CatDogBalanceCheck {
    public static boolean catDog(String originalText) {
        int catCount = 0;
        int dogCount = 0;
            for (int index = 0; index < originalText.length() - 2; index++) {
                String currentPart = originalText.substring(index, index + 3);

                if (currentPart.equals("cat")) {
                    catCount++;
                }

                if (currentPart.equals("dog")) {
                    dogCount++;
                }
            }
        return catCount == dogCount;
    }
    public static void main(String[] args) {

    }
}
