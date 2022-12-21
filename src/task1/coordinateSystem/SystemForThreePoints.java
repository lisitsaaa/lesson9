package task1.coordinateSystem;

public class SystemForThreePoints extends Vector {
    private static final String MESSAGE = "This solution for three-dimensional coordinate systems";

    public SystemForThreePoints() {
        super();
    }

    public SystemForThreePoints(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public double vectorLength() {
        double result = Math.sqrt(Math.pow(x, 2) +
                Math.pow(y, 2) + Math.pow(z, 2));

        String s = String.format("%.2f", result);
        System.out.println("vector length -> " + s);
        return result;
    }

    @Override
    public void scalarMultiplication(Vector v1, Vector v2) {
        int resX = (v1.x * v2.x);
        int resY = (v1.y * v2.y);
        int resZ = (v1.z * v2.z);
        int result = resX + resY + resZ;

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
        System.out.println(MESSAGE + "\nfirst vector: " +
                "\nx = " + v1.x +
                "\ny = " + v1.y +
                "\nz = " + v1.z +
                "\nsecond vector: " +
                "\nx = " + v2.x +
                "\ny = " + v2.y +
                "\nz = " + v2.z);

        v1.vectorLength();
        v2.vectorLength();
        scalarMultiplication(v1, v2);
        vectorAddition(v1, v2);
    }
}
