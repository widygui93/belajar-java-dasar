public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80,50,80,80};
        sayCongrats("Budi", values);
        sayCongrats("Tono", 80,90,70,85);
    }

    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value: values) {
            total += value;
        }

        var nilaiFinal = total / values.length;

        if(nilaiFinal >= 75){
            System.out.println("Selamat " + name + " ,Anda lulus");
        } else {
            System.out.println("Maaf " + name + " ,Anda tidak lulus");
        }

    }
}
