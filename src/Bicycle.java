public class Bicycle extends ServiceStation {
    public String modelName;
    public int wheelsCount;

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}

