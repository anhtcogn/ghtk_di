package Cars.Engine;


public class SuperEngine implements IEngine {
    int engine = 1500;

    @Override
    public void showEngine() {
        System.out.println(this.engine);
    }
}


