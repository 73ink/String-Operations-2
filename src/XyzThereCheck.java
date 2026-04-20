public class XyzThereCheck {
    public static boolean xyzThere(String originalText){
        for (int index = 0; index < originalText.length() - 2; index++) {
            String currentPart = originalText.substring(index, index + 3);

            if (currentPart.equals("xyz")) {
                if (index == 0 || originalText.charAt(index - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String[] args){
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }
}
