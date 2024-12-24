package ss6.BaiTap;

public class Pointer3D extends Pointer2D{

    private float z;

    public Pointer3D(){}

    public Pointer3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{this.getX(), this.getY(),this.z};
    }

    public void setXYZ(float x,float y, float z){
        this.setXY(x,y);
        this.setZ(z);
    }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+","+this.getZ()+")";
    }
}
