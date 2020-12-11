package LabyrinthOfNestedLoops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SquareDigitsSequence {
    int squareDigitsSequence(int a0) {
        int temp = sqdigitsSequence(a0);
        List<Integer> list = new ArrayList<>();
        list.add(a0);
        while (!list.contains(temp)) {
            list.add(temp);
            temp = sqdigitsSequence(temp);
        }
        return list.size() + 1;
    }

    int sqdigitsSequence(int num) {
        int temp = num;
        int result = 0;
        while (temp > 0) {
            int dv = temp % 10;
            result += (dv * dv);
            temp = temp / 10;
        }
        return result;
    }

}
