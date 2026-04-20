public class EndingTextCheck {
    public static boolean endOther(String firstText, String secondText){
        String firstLowerText = firstText.toLowerCase();
        String secondLowerText = secondText.toLowerCase();
        return  firstLowerText.endsWith(secondLowerText) || secondLowerText.endsWith(firstLowerText);
    }
    public static void main (String[] args){
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }
}

