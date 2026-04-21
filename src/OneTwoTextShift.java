public class OneTwoTextShift {
    public static String oneTwo(String originalText) {
        String shiftedText = "";
        for (int index = 0; index <= originalText.length() - 3; index += 3) {
            shiftedText += originalText.charAt(index + 1);
            shiftedText += originalText.charAt(index + 2);
            shiftedText += originalText.charAt(index);
        }
        return shiftedText;
    }
    public static void main (String[] args){
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }
}
