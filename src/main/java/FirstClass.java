public class FirstClass {
    public static void main(String[] args) {
        Notebook lightNotebook = new Notebook(500, 600, 2018);
        System.out.println(lightNotebook.weight + " " + lightNotebook.price);
        lightNotebook.checkPrice();

        Notebook heavyNotebook = new Notebook(500,600,2018);
        System.out.println(heavyNotebook.weight);
        heavyNotebook.checkWeight();

        Notebook oldNotebook = new Notebook(500,600,2018);
        System.out.println(oldNotebook.year);
        oldNotebook.checkYear();
    }
}