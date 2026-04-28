public class Car {
    Engine engine;

    Car(String engineType){
        if(engineType == "gas")engine = new GasEngine(engineType);
        else if (engineType == "electric") engine = new ElectricEngine(engineType);
        else if (engineType== "hybrid") engine = new HypridEngine(engineType);
        else {
            System.out.println("Unkown Engine Type");
            engine = new Engine("not known");
        }
    }

    public void start(){
        if(engine.speed != 0) {System.out.println("can not start a car if it's already started");}
        else{
            engine.speed = 0;
        }
    }
    public  void stop(){
        if(engine.speed == 0){
            System.out.println("car stopped");
        }else{
            System.out.println("please slow down or brake first");
        }

    }
    public void accelerate(){
        if(engine.getSpeed() +20 > 200){
            System.out.println("Watch out you will exceed 200km/h");
        }else{
            for(int i =0 ;i <20;i++) {
                engine.Inc();
            }
        }
    }

    public void brake(){
        if(engine.getSpeed() -20 < 0){
            System.out.println("Wait you will brake too much");
        }else{
            for(int i =0 ;i <20;i++) {
                engine.dec();
            }

        }
    }
}
