public class Car extends TransportCommon{
    public String modelName;
    public int wheelsCount;
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


}
