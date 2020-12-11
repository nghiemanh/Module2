package AtTheCrossroads;

public class TennisSet {
    boolean tennisSet(int score1, int score2) {
        if (score1 < 5 && score2 == 6) {
            return true;
        } else if (score1 == 6 && score2 < 5) {
            return true;
        } else if (score1 >= 5 && score2 >= 5) {
            if (score1 == 7 && score1 != score2 && score2 < 7) {
                return true;
            }
            if (score2 == 7 && score1 != score2 && score1 < 7) {
                return true;

            } else
                return false;
        } else
            return false;


    }


}
