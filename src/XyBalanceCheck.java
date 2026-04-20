public class XyBalanceCheck {
    public static boolean xyBalance(String originalText) {
        int XlastP = -1;
        int YlastP = -1;

        for (int index = 0; index < originalText.length(); index++) {
            if (originalText.charAt(index) == 'x') {
                XlastP = index;
            }

            if (originalText.charAt(index) == 'y') {
                YlastP = index;
            }
        }

        return XlastP <= YlastP;
    }
    public static void main (String[] args){
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }
}
