package task2.vector;

import task1.coordinateSystem.SystemForTwoPoints;

import java.util.Arrays;

public class Vector implements VectorMethod {
    private static final String MESSAGE = "it's vector :)";
    private int[] coordinates;

    public Vector(int... coordinates) {     //0 - 1 - 2 - 3 - 4 - 5 -...
        if (coordinates.length % 2 == 0) { //(x1-x2)-(y1-y2)-(z1-z2)-...
            this.coordinates = coordinates;
        }
    }


    @Override
    public double vectorLength() {
        double result = 1.0;
        for (int i = 0; i < coordinates.length; i += 2) {
            result *= Math.sqrt(Math.pow((coordinates[i + 1] - coordinates[i]), 2));
        }
        return result;
    }

    @Override
    public void scalarMultiplication(Vector v1, Vector v2) {
        int result = 0;
        for (int i = 0; i < coordinates.length; i+=2) {
            result += ((v1.coordinates[i + 1] - v1.coordinates[i]) * (v2.coordinates[i + 1] - v2.coordinates[i]));
        }
        System.out.println("scalar multiplication -> " + result);

    }

    @Override
    public void vectorAddition(Vector v1, Vector v2) {
        double lengthV1 = v1.vectorLength();
        double lengthV2 = v2.vectorLength();

        System.out.print("addition vectors -> ");

        if (lengthV1 > lengthV2) {
            printLength(v1);
        } else {
            printLength(v2);
        }
    }

    @Override
    public void vectorDifference(Vector v1, Vector v2) {
        double lengthV1 = v1.vectorLength();
        double lengthV2 = v2.vectorLength();
        double s;

        System.out.print("difference vectors -> ");

        if (lengthV1 > lengthV2) {
            s = v1.vectorLength() - v2.vectorLength();
        } else {
            s = v2.vectorLength() - v1.vectorLength();
        }
        System.out.println(s);
    }

    @Override
    public void vectorCompare(Vector v1, Vector v2) {
        System.out.print("compare vectors -> ");

        if (v1.equals(v2)) {
            System.out.println("v1 = v2");
        } else {
            System.out.println("v2 != v1");
        }

    }

    public static void arrayOfVectors(int n) {
        task1.coordinateSystem.Vector[] array = new task1.coordinateSystem.Vector[n];
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
        System.out.println(MESSAGE + "\nfirst vector: ");

        for (int i = 0; i < coordinates.length; i+=2) {
            System.out.println(i +" -> "+ (v1.coordinates[i + 1] - v1.coordinates[i]));
        }

        System.out.println(MESSAGE + "\nsecond vector: ");
        for (int i = 0; i < coordinates.length; i+=2) {
            System.out.println(i +" -> "+ (v2.coordinates[i + 1] - v2.coordinates[i]));
        }

        printLength(v1);
        printLength(v2);

        scalarMultiplication(v1, v2);

        vectorAddition(v1, v2);

        vectorDifference(v1, v2);

        vectorCompare(v1, v2);
    }

    protected void printLength(Vector v) {
        String s = String.format("%.2f", v.vectorLength());
        System.out.println("vector length -> " + s);
    }
}
