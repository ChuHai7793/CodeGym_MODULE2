package ss4.BaiTap;



public class StopWatch {
    private double startTime, endTime;


    public StopWatch(){
        this.startTime = System.currentTimeMillis();

    }

    public double[] getTime(){
        return new double[]{this.startTime,this.endTime};
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
