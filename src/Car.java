public class Car {
    Engine engine;

    Car(String engineType){
        Engine engine = new Engine(engineType);
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
}
