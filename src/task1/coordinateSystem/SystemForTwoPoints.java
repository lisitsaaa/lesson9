package task1.coordinateSystem;


public class SystemForTwoPoints extends Vector {
    private static final String MESSAGE = "This solution for two-dimensional coordinate systems";

    public SystemForTwoPoints() {
        super();
    }

    public SystemForTwoPoints(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void vectorLength() {
        double firstVector = Math.sqrt(
                Math.pow((x2 - x1), 2)
                        + Math.pow((y2 - y1), 2));

        String s = String.format("%.2f", firstVector);
        System.out.println("vector length -> " + s);
    }

    @Override
    public void scalarMultiplication(Vector v1, Vector v2) {
        int resX = ((v1.x2 - v1.x1) * (v2.x2 - v2.x1));
        int resY = ((v1.y2 - v1.y1) * (v2.y2 - v2.y1));
        int result = resX + resY;

        System.out.println("scalar multiplication -> " + result);
    }

    @Override
    public void vectorAddition(Vector v1, Vector v2) {

    }

    @Override
    public void vectorDifference(Vector v1, Vector v2) {

    }

    @Override
    public void vectorCompare(Vector v1, Vector v2) {

    }

    @Override
    public void printInformation(Vector v1, Vector v2) {
        System.out.println(MESSAGE + "\nfirst vector: "+
                "\nx = " + (v1.x2 - v1.x1) +
                "\ny = " + (v1.y2 - v1.y1)+
                "\nsecond vector: "+
                "\nx = " + (v2.x2 - v2.x1) +
                "\ny = " + (v2.y2 - v2.y1));

        v1.vectorLength();
        v2.vectorLength();
        scalarMultiplication(v1, v2);
        vectorAddition(v1, v2);
    }
}
