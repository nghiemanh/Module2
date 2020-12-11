package LoopTunnel;

public class Rounders {
    int rounders(int n) {
        int value = 1;
        if (n < 5) {
            return n;
        }

        while (n > (int) Math.pow(10, value)) {

            if ((int) n % Math.pow(10, value) >= 5 * (int) Math.pow(10, value - 1)) {
                n = n + (int) Math.pow(10, value) - (int) (n % Math.pow(10, value));
            } else
                n = n - (int) (n % Math.pow(10, value));

            value++;
        }
        return n;
    }

}
