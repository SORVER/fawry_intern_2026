public class Engine {
    int speed;
    String currentRunning;
    Engine( String currentRunning ){
        this.currentRunning = currentRunning;
        speed = 0;
    }
    public  void Inc(){
        speed+=1;
    }
    public  void dec(){
        speed-=1;
    }

}
