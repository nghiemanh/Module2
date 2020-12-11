package LoopTunnel;

public class AppleBoxes {
    int appleBoxes(int k) {
        int yellow = 0;
        int red = 0;
        for (int i = 1; i <= k; i++) {
            if ((i & 1) == 0)
                red += (i * i);
            else
                yellow += (i * i);
        }

        return red - yellow;

    }

}
