public class Main {
    public static void main(String[] args) {
        figure[] figure = new figure[5];
        figure[0] = new circle(5);
        figure[1] = new rectangle(8,9);
        figure[2] = new triangle(4,6,9);
        figure[3] = new circle(9);
        figure[4] = new triangle(3,4,5);
        double P = 0;
        for (int i = 0; i < 5; i++) {
            P += figure[i].getperimetr();
        }
        System.out.println(" общий периметр " + P);
    }
}