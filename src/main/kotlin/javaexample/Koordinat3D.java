package javaexample;

public class Koordinat3D extends Koordinat{

    int z;

    public Koordinat3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public int getX() {
        return 10000;
    }

    @Override
    public int getY() {
        return 900;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
