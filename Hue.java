public class Hue {
    public static void main(String [] args) {
        Person hue = new Person();
        hue.setName("Hue"); // hue.name = "Hue"
        System.out.println("Hue's name: " + hue.getName());
        hue.setAge(15);
        System.out.println("Hue's age: " + hue.getAge());
    }
}