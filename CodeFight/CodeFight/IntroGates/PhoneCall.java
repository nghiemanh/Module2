package IntroGates;

public class PhoneCall {
    int phoneCall(int min1, int min2_10, int min11, int s) {
        if (s == min1) {
            return 1;
        }
        if (s < min1) {
            return 0;
        }
        int minutes = 1;
        s -= min1;
        while (s >= min2_10 && minutes < 10) {
            s -= min2_10;
            minutes++;
        }
        while (s >= min11 && minutes > 9) {
            s -= min11;
            minutes++;
        }
        return minutes;
    }

}
