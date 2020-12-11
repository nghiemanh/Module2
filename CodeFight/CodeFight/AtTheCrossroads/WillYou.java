package AtTheCrossroads;

public class WillYou {
    boolean willYou(boolean young, boolean beautiful, boolean loved) {
        if (young == true && beautiful == true && loved == true) {
            return false;

        }
        if (young == false && beautiful == false && loved == false) {
            return false;

        }
        if (young == false && beautiful == true && loved == false) {
            return false;
        }
        if (young == true && beautiful == false && loved == false) {
            return false;
        } else
            return true;
    }

}
