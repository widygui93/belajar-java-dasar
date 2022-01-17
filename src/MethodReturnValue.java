public class MethodReturnValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = sum(a,b);

        System.out.println(c);
    }

    static int sum(int a, int b){
        int hasil = a + b;
        return hasil;
    }
}
