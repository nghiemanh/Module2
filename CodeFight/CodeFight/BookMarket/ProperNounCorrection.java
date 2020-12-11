package BookMarket;

public class ProperNounCorrection {
    boolean isTandemRepeat(String inputString) {
        if(inputString.substring(0,inputString.length()/2).equals(inputString.substring(inputString.length()/2,inputString.length()))){
            return  true;
        }
        return false;
    }

}
