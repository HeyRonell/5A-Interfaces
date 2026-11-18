package E3;

public class Main {
    public static void main(String[] args) {
        Ani.Lion Leony = new Ani.Lion();
        Ani.Elephant EllePhan = new Ani.Elephant();
        Ani.Parrot Parroly = new Ani.Parrot();

        Leony.makeSound();
        EllePhan.eat();
        Parroly.eat();
        EllePhan.makeSound();
        Parroly.makeSound();
        Leony.eat();
    }
}
