public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(4));
        System.out.println(factorialRecursive(4));
    }

    static int factorialLoop(int value){
        var result = 1;
        for (var counter=1; counter <= value; counter++){
            result *= counter;
        }

        return result;
    }

    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }else {
            return value * factorialRecursive(value - 1);
        }
    }
}
