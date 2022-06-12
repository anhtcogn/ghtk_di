import Cars.Engine.IEngine;
import Cars.Wheel.IWheel;

public class Car {
    private IEngine engine;
    private IWheel wheel;

    public Car(IEngine engine, IWheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void showCar() {
        this.engine.showEngine();
        this.wheel.showWheel();
    };
}