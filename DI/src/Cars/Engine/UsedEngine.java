package Cars.Engine;


public class UsedEngine implements IEngine {
    int engine = 400;

    @Override
    public void showEngine() {
        System.out.println(this.engine);
    }
}
