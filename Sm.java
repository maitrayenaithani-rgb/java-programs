public class Sm{
    public static void main(String[] args) {
        double t = 0.3;
        System.out.print(t);

        for (int i = 1; i < 8; i++) { 
            t= t + (0.3 / Math.pow(10, i));
            System.out.print(t+", " );
        }
    }
}
