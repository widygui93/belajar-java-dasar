public class ForLoop {
    public static void main(String[] args) {
        // tanpa kondisi awal, conditional, post after assignment
//        for (;;){
//            System.out.println("Perulangan");
//        }

        // dengan conditional
        var counter = 1;
        for (; counter <= 10 ;){
            System.out.println(counter);
            counter++;
        }

        // dengan init conditional
        for(var counter2 = 1; counter2 <= 10;){
            System.out.println(counter2);
            counter2++;
        }

        // dengan post statement
        for (var counter3 = 1; counter3 <=10; counter3++){
            System.out.println(counter3);
        }
    }
}
