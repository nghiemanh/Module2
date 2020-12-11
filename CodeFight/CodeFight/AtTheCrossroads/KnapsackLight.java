package AtTheCrossroads;

public class KnapsackLight {
    int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 > maxW && weight2 > maxW) {
            return 0;
        }
        if ((weight2 + weight1) <= maxW) {
            return (value1 + value2);
        }
        if (weight1 <= maxW && weight2 <= maxW) {
            return Math.max(value1, value2);
        }
        if (weight1 <= maxW && weight2 > maxW) {
            return value1;
        } else {
            return value2;
        }
    }

}
