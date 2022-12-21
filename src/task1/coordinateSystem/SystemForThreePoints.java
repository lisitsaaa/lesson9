package task1.coordinateSystem;

public class SystemForThreePoints extends Vector {
    private static final String MESSAGE = "This solution for three-dimensional coordinate systems";

    public SystemForThreePoints() {
        super();
    }

    public SystemForThreePoints(int x1, int y1, int z1,
                                int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    public void vectorLength() {
        double result = Math.sqrt(
                Math.pow((x2 - x1), 2)
                        + Math.pow((y2 - y1), 2)
                        + Math.pow((z2 - z1), 2));

        String s = String.format("%.2f", result);
        System.out.println("vector length -> " + s);
    }

    @Override
    public void scalarMultiplication(Vector v1, Vector v2) {
        int resX = ((v1.x2 - v1.x1) * (v2.x2 - v2.x1));
        int resY = ((v1.y2 - v1.y1) * (v2.y2 - v2.y1));
        int resZ = ((v1.z2 - v1.z1) * (v2.z2 - v2.z1));
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
        System.out.println(MESSAGE + "\nfirst vector: "+
                "\nx = " + (v1.x2 - v1.x1) +
                "\ny = " + (v1.y2 - v1.y1)+
                "\nz = " + (v1.z2 - v1.z1)+
                "\nsecond vector: "+
                "\nx = " + (v2.x2 - v2.x1) +
                "\ny = " + (v2.y2 - v1.y1)+
                "\nz = " + (v2.z2 - v2.z1));

        v1.vectorLength();
        v2.vectorLength();
        scalarMultiplication(v1, v2);
        vectorAddition(v1, v2);
    }
}
