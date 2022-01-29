public class Punkt {
    private int pX;
    private int pY;
    private int pZ;
    public Punkt (int x) {
        this.pX = x;

    }
    public Punkt (int x, int y, int z) {
        this.pX = x;
        this.pY = y;
        this.pZ = z;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpY() {
        return pY;
    }

    public void setpY(int pY) {
        this.pY = pY;
    }

    public int getpZ() {
        return pZ;
    }

    public void setpZ(int pZ) {
        this.pZ = pZ;
    }
    public int DodXZ(){
        return pX + pZ;
    }
    public int SubtractionZX(){
        return pZ - pX;
    }

}