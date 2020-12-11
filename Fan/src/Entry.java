public class Entry {
    public static void main(String[] args) {
        Fan f1 = new Fan( 3,10,"yellow", true);
        Fan f2 = new Fan();
        f2.setSpeed(3);
        f2.setRadius(5);
        System.out.println(f1.toString());
        System.out.println(f2.toString());




    }
}
