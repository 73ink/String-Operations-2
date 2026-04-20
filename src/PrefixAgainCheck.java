public class PrefixAgainCheck {
    public static boolean prefixAgain(String originalText, int prefixLength){
        String prefixText = originalText.substring(0, prefixLength);
            for (int index = prefixLength; index <= originalText.length() - prefixLength; index++){
                String currentPart = originalText.substring(index, index + prefixLength);
                    if (currentPart.equals(prefixText)){
                        return true;
                    }
            }
        return false;
    }
    public static void main (String[] args){

    }
}
