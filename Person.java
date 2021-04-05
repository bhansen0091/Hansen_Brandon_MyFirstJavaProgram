
public class Person {

    String name;
    int age;
    String hometown;

    public Person(String name, int age, String hometown){
        this.name = name;
        this.age = age;
        this.hometown = hometown;
    }

    public String toString(){
        System.out.println("SysOut from toString ----- \nMy name is %s. \nI am %d years old. \nMy hometown is %s, TX.\n\n".formatted(this.name, this.age, this.hometown));
        String result = "result ---- \nMy name is %s. \nI am %d years old. \nMy hometown is %s, TX.\n\n".formatted(this.name, this.age, this.hometown);
        return result;
    }

    public static void main(String[] args) {
        
        Person person1 = new Person("Brandon", 32, "Amarillo");

        System.out.println(person1.toString());
        System.out.println("SysOut ---\nMy name is %s. \nI am %d years old. \nMy hometown is %s, TX.\n\n".formatted(person1.name, person1.age, person1.hometown));


    }
}