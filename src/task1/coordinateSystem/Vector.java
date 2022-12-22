package task1.coordinateSystem;

public abstract class Vector implements VectorMethod {
    protected int x1;
    protected int y1;
    protected int x2;
    protected int y2;
    protected int z1;
    protected int z2;

    public Vector(){
        this.x1 = 0;
        this.y1 = 0;
        this.z1 = 0;

        this.x2 = 5;
        this.y2 = 5;
        this.z2 = 5;
    }

    public Vector(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Vector(int x1, int y1, int z1,
                  int x2, int y2, int z2){
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
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
    public void vectorCompare(Vector v1, Vector v2) {
        System.out.print("compare vectors -> ");

        if(v1.equals(v2)){
            System.out.println("v1 = v2");
        } else{
            System.out.println("v2 != v1");
        }
    }

    protected void printLength(Vector v) {
        String s = String.format("%.2f", v.vectorLength());
        System.out.println("vector length -> " + s);
    }
}
