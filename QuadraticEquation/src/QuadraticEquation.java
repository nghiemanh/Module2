import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        System.out.print("Nhap c: ");
        c = sc.nextDouble();

    }
    public void getDiscriminant() {
        double root1;
        double root2;
        double delta = (Math.pow(b, 2)) - 4 * a * c ;
        if (delta <0){
            System.out.println("The equation has no roots");
        }
        else if (delta == 0 ){
            System.out.println("Root1: "  + -b/(2*a));
        }
        else  {
            root1 = (-b + Math.pow(delta,0.5))/(2*a);
            root2 = (-b - Math.pow(delta,0.5))/(2*a);
            System.out.println("Root1: " +root1);
            System.out.println("Root2: " +root2);
        }
    }

}
