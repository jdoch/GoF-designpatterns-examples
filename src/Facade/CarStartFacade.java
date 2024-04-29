package Facade;

public class CarStartFacade {
    private final Engine engine;
    private final Lights lights;

    public CarStartFacade(Engine engine, Lights lights) {
        this.engine = engine;
        this.lights = lights;
    }

    void start(){
        engine.turnOnEngine();
        lights.turnOnLights();
    }

    void stop(){
        lights.turnOffLights();
        engine.turnOffEngine();
    }
}
