package Facade;

public class FacadeTest {
    public static void main(String[] args){
        CarStartFacade c = new CarStartFacade(new EngineImpl(), new LightsImpl());
        c.start();
        System.out.println("---------------------------------");
        c.stop();
    }
}
