public class EndingTextCheck {
    public static boolean endOther(String firstText, String secondText){
        String firstLowerText = firstText.toLowerCase();
        String secondLowerText = secondText.toLowerCase();
        return  firstLowerText.endsWith(secondLowerText) || secondLowerText.endsWith(firstLowerText);
    }
    public static void main (String[] args){

    }
}
