package ago7;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.size = 40;

        d.bark();

        Dog c = d;
        c = null;

        c.bark(); // null pointer

    }
}
