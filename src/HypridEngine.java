public class HypridEngine extends Engine{

    HypridEngine(String engineType){
     super(engineType);
        currentRunning= "electric";
    }

    @Override
    public void Inc(){
        if(getSpeed() +1 > 50){
            currentRunning= "gas";
        }
        speed++;
    }

    @Override
    public void dec(){
        if(getSpeed() -1 < 50){
            currentRunning= "electric";
        }
        speed--;
    }
}
