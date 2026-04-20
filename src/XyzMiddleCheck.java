public class XyzMiddleCheck {
    public static boolean xyzMiddle(String originalText){
        for (int index = 0; index <= originalText.length() - 3; index++){
            if (originalText.substring(index, index + 3).equals("xyz")){
                int leftSideLength = index;
                int rightSideLength = originalText.length() - (index + 3);

                if (Math.abs(leftSideLength - rightSideLength) <= 1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }
}
