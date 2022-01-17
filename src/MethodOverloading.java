public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Widy");
        sayHello("Widy", "Gui");
        sayHello(2);

    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String firstName){
        System.out.println("Hello " + firstName);
    }

    static void sayHello(int nilai){
        System.out.println("Hello " + nilai);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " +lastName);
    }
}
