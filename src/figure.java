public abstract class figure {
    public abstract double getarea();
    public abstract double getperimetr();

}
class triangle extends figure{
    private double A;
    private double B;
    private double C;

    public triangle(double a, double b, double c) {
        this.A = a;
        this.B = b;
        this.C = c;
    }
    public double getarea() {
        double P = (A+B+C)/2;
        return Math.sqrt(P*(P-A)*(P-B)*(P-C));
    }
    public double getperimetr() {
        return A+B+C;
    }
}
class rectangle extends figure {
    private double D;
    private double E;

    public rectangle(double d, double e) {
        this.D = d;
        this.E = e;
    }
    public double getperimetr() {
        double P = 2*(D+E);
        return  P;
    }
    public double getarea() {
        double S = D*E;
        return S;
    }
}
class circle extends figure{
    private double R;
    private double Pi=3.14;

    public circle(double r) {
        this.R = r;

    }
    public double getperimetr() {
        double P = 2*Pi*R;
        return  P;
    }
    public double getarea() {
        double S = Pi*R*R;
        return S;
    }

}