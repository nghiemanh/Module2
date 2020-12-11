package LabyrinthOfNestedLoops;

public class IsPower {
    boolean isPower(int n) {
        for (int i = 1; i < 100; i++) {
            int result = i;
            for (int j = 1; j < 10; j++) {
                result *= i;
                if (result == n)
                    return true;
            }
        }

        return false;
    }
}
