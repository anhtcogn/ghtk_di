import Cars.Engine.IEngine;
import Cars.Engine.SuperEngine;
import Cars.Engine.UsedEngine;
import Cars.Wheel.IWheel;
import Cars.Wheel.SuperWheel;
import Cars.Wheel.UsedWheel;

public class main {
    public static void main(String[] args) {
        IEngine spc = new SuperEngine();
        IEngine uc = new UsedEngine();
        IWheel spw = new SuperWheel();
        IWheel uw = new UsedWheel();

        Car supercar = new Car(spc, spw);
        Car usedcar = new Car(uc, uw);

        supercar.showCar();
        usedcar.showCar();
    }
}
