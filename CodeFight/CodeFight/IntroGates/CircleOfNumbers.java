package IntroGates;

public class CircleOfNumbers {
    int circleOfNumbers(int n, int firstNumber) {
        return ((firstNumber + n / 2) % n);
    }

}
