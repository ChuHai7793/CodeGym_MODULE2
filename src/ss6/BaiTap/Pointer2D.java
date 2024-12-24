package ss6.BaiTap;

public class Pointer2D {

    private float x,y;

    public Pointer2D(){
        this.x = 0.0f;
        this.y =0.0f;
    }

    public Pointer2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return this.x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return new float[]{this.x, this.y};
    }

    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}
