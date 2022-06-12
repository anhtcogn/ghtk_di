package Cars.Wheel;

import Cars.Wheel.IWheel;

public class UsedWheel implements IWheel {
    int wheel = 4;

    @Override
    public void showWheel() {
        System.out.println(this.wheel);
    }
}
