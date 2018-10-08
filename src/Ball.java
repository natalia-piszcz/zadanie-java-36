import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Ball extends Shape3D {
    private double radius;
//    final  static double PI = 3.14;

    public Ball(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        radius = radius;
    }


}
