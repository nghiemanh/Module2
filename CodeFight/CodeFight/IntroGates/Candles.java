package IntroGates;

public class Candles {
    int candles(int candlesNumber, int makeNew) {
        return (candlesNumber + (candlesNumber - 1) / (makeNew - 1));
    }
}
