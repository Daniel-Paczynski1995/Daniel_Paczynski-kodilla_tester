public class Person {
    public static void main(String[] args) {
        UserDto adam = new UserDto("Adam", 40.5, 178);
        System.out.println(adam.age);
        adam.checkAge();
    }
}
