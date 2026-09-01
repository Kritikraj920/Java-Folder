public class DefineInterface {

    // 1. PROTECTED NESTED INTERFACE: Accessible within the same package and subclasses
    protected interface Animal {
        void eat();
        void sleep();
    }

    // 2. PRIVATE NESTED INTERFACE: Accessible strictly inside DefineInterface
    private interface Pet {
        void play();
    }

    // Outer inner class implementing the protected interface
    public class Dog implements Animal, Pet {
        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }

        @Override
        public void sleep() {
            System.out.println("Dog is sleeping.");
        }

        @Override
        public void play() {
            System.out.println("Dog is playing.");
        }
    }

    public static void main(String[] args) {
        DefineInterface defineInterface = new DefineInterface();
        Dog dog = defineInterface.new Dog();
        dog.eat();
        dog.sleep();
        dog.play();
    }
}