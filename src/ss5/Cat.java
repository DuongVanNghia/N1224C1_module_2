package ss5;

public class Cat extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("cat flying");
    }

    public void sound() {
        System.out.println("meo meo");
    }
    public void batchuot() {
        System.out.println("bat chuot");
    }
}
