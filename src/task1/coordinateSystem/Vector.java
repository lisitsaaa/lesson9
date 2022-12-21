package task1.coordinateSystem;

public abstract class Vector implements VectorMethod {

    private static final String MESSAGE = "This solution for ...-dimensional coordinate systems";

    protected int x;
    protected int y;
    protected int z;

    public Vector(){
        this.x = 5;
        this.y = 5;
        this.z = 5;
    }

    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
