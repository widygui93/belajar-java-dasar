public class Scope {
    public static void main(String[] args) {
        sayHello("Widy");
    }

    static void sayHello(String name){
        String hello = "Hello "+ name;

        if(!name.isBlank()){
            String hi = "Hi "  + name;
            System.out.println(hi);
            System.out.println(hello); // ini masih bisa di akses karena variable hello berada di atas blok if
        }

        System.out.println(hello);
//        System.out.println(hi); // error karena variable hi berbeda scope

    }
}
