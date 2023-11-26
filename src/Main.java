public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
        System.out.println("Задание 2");
        System.out.println(fullName.toUpperCase());
        System.out.println("Задание 3");
        String first = "Семён";
        String middle = "Семёнович";
        String last = "Иванов";
        first = first.replace("ё","е");
        middle = middle.replace("ё","е");
        String full = last + " " + first + " " + middle;
        System.out.println(full);
    }
}