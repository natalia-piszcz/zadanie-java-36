import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double circleArea(Circle circle) {
        return PI* Math.pow(circle.getRadius(),2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideA() * rectangle.getSideB();

    }

    @Override
    public double ballVolume(Ball ball) {
        return 4.0 / 3.0 * PI * pow(ball.getRadius(), 3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }
}
