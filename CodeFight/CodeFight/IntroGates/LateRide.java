package IntroGates;

public class LateRide {
    int lateRide(int n) {
        return ((n / 60) % 10 + (n / 60 / 10) % 10 + (n % 60) % 10 + ((n % 60) / 10) % 10);
    }

}
