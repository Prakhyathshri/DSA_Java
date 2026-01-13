class Human {
    static int population;
}

public class Main2 {
    public static void main(String[] args) {

        Human h1 = new Human();
        Human h2 = new Human();

        h1.population = 1;

        System.out.println(h2.population); // Output: 1
    }
}
