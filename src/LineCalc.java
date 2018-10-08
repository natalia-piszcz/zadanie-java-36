public class LineCalc {

    double lineLength(Line2D line) {
        double xLength = Math.abs(line.getaX() - line.getbX());
        double yLength = Math.abs(line.getaY() - line.getbY());
        return Math.sqrt(xLength * xLength + yLength * yLength);
    }

}
