package LoopTunnel;

public class LeastFactorial {
    int leastFactorial(int n) {
        int gt = 1, i = 1;
        while (gt < n) {
            gt = gt * i;
            i++;
        }
        return gt;
    }
}
