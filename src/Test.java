public class Test {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println(shapeCalculator.ballVolume(new Ball(2.0)));
        System.out.println(shapeCalculator.circleArea(new Circle(2.0)));
        System.out.println(shapeCalculator.cubeVolume(new Cube(2.0)));
        System.out.println(shapeCalculator.rectangleArea(new Rectangle(2.0, 3.0)));
        System.out.println(shapeCalculator.lineLength(new Line2D(2.0, 3.0, 4.0, 1.5)));


    }
}
