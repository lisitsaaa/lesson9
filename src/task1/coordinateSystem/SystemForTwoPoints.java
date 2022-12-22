package task1.coordinateSystem;


import java.util.Arrays;

public class SystemForTwoPoints extends Vector {
    private static final String MESSAGE = "This solution for two-dimensional coordinate systems";

    public SystemForTwoPoints() {
        super();
    }

    public SystemForTwoPoints(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public double vectorLength() {
        return Math.sqrt(
                Math.pow((x2 - x1), 2)
                        + Math.pow((y2 - y1), 2));
    }

    @Override
    public void scalarMultiplication(Vector v1, Vector v2) {
        int resX = ((v1.x2 - v1.x1) * (v2.x2 - v2.x1));
        int resY = ((v1.y2 - v1.y1) * (v2.y2 - v2.y1));
        int result = resX + resY;

        System.out.println("scalar multiplication -> " + result);
    }

    public static void arrayOfVectors(int n) {
        Vector[] array = new Vector[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new SystemForTwoPoints((int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10),
                    (int) (Math.random() * 10)) {
            };
        }
        System.out.println(Arrays.toString(array));
    }

    @Override
    public void printInformation(Vector v1, Vector v2) {
        System.out.println(MESSAGE + "\nfirst vector: " +
                "(" + (v1.x2 - v1.x1) +
                ", " + (v1.y2 - v1.y1) +
                ")\nsecond vector: " +
                "(" + (v2.x2 - v2.x1) +
                ", " + (v2.y2 - v2.y1) + ")");

        printLength(v1);
        printLength(v2);

        scalarMultiplication(v1, v2);

        vectorAddition(v1, v2);

        vectorDifference(v1, v2);

        vectorCompare(v1, v2);
    }

}
