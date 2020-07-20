public class User3 {
    public static void main(String[] args) {

        User marek = new User("Marek", 26);
        User ania = new User("Ania", 24);
        User daniel = new User("Daniel", 25);
        User magda = new User("Magda", 35);
        User karolina = new User("Karolina", 27);

        User users[] = {marek, ania, daniel, magda, karolina};

        double sum = 0;
        for (int i =0; i < users.length; i++) {
        sum = sum + users[i].getAge();

        }
        double avg = sum/users.length;
    System.out.println(avg);
    }


}