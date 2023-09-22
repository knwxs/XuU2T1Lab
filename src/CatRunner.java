public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bubbles", 2, 3.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("2", 3, 4.5);
        cat1.introduce();
        cat1.printCatInfo();
    }
}
