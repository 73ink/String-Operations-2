public class SandwichTextFinder {
    public static String getSandwich(String originalText) {
        int firstBreadPosition = originalText.indexOf("bread");
        int lastBreadPosition = originalText.lastIndexOf("bread");

        if (firstBreadPosition != -1 && lastBreadPosition != -1 && firstBreadPosition != lastBreadPosition) {
            return originalText.substring(firstBreadPosition + 5, lastBreadPosition);
        }
        return "";
    }
    public static void main (String[] args){
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }
}
