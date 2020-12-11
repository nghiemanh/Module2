package LoopTunnel;

public class MagicalWell {
    int magicalWell(int a, int b, int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + a * b;
            a++;
            b++;
        }
        return (result);
    }

}
