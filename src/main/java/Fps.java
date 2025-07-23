public class Fps {
    long start;
    long stop;
    long time;
    double fps;
    public  void start() {
        this.start = System.nanoTime();
    }
    public void stop() {
        this.stop = System.nanoTime();
    }
    public double calculateFps() {
        this.time = this.stop - this.start;
        this.fps = 1000000000.0 / this.time;
        return this.fps;
    }
}