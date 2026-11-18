package E3;

public class Ani {

    interface Animal {
        void makeSound();
        void eat();
        //void name();
    }

    static class Lion implements Animal {
        @Override
        public void makeSound() {
            System.out.println("RAAAAAAAAAAAAWR");
        }

        @Override
        public void eat() {
            System.out.println("NAM NAM NAM");
        }
    }

    static class Elephant implements Animal {
        @Override
        public void makeSound() {
            System.out.println("AWOOOOOOOOOOOO");
        }
        @Override
        public void eat() {
            System.out.println("ARMCH ARMCH ARMCH");
        }
    }

    static class Parrot implements Animal {
        @Override
        public void makeSound() {
            System.out.println("REEEEEEEEEEEEEE");
        }
        @Override
        public void eat() {
            System.out.println("peep peep peep");
        }
    }
}
