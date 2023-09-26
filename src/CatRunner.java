public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ruru", 8, 5.7);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Nene", 7, 3.4);
        cat2.printCatInfo();
        cat2.introduce();


    }
}
