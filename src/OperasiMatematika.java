public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // augmented assignment
        int c = 100;
        c += 10; // sama artinya dengan c = c + 10;
        System.out.println(c);

        // unary operator
        int d = 10;
        d++;
        System.out.println(d);

        System.out.println(!false);
    }
}
