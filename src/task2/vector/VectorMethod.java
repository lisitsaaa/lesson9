package task2.vector;

public interface VectorMethod {

    double vectorLength();
    void scalarMultiplication(Vector v1, Vector v2);
    void vectorAddition(Vector v1, Vector v2);
    void vectorDifference(Vector v1, Vector v2);
    void vectorCompare(Vector v1, Vector v2);
    void printInformation(Vector v1, Vector v2);
}
