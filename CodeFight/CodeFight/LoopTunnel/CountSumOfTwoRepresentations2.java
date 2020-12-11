package LoopTunnel;

public class CountSumOfTwoRepresentations2 {
    int countSumOfTwoRepresentations2(int n, int l, int r) {
        if (l > n / 2)
            return 0;
        return Math.min(n / 2 - l, r - n / 2) + ((n % 2 == 1) ? 0 : 1);
    }
}
