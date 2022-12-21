package task1.coordinateSystem;

public abstract class Vector implements VectorMethod {

    private static final String MESSAGE = "This solution for ...-dimensional coordinate systems";

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
}
