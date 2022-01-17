public class Array {
    public static void main(String[] args) {
        String[] Fruits;
        Fruits = new String[3];
        Fruits[0] = "Apple";
        Fruits[1] = "Pear";
        Fruits[2] = "Orange";

        System.out.println(Fruits[2]);

        int[] numbers = new int[]{
          2,3,4
        };
        System.out.println(numbers[0]);

        int[] numbers2 = {
          4,2,1
        };
        System.out.println(numbers2[2]);

        numbers2[0] = 0;
        System.out.println(numbers2[0]);

        System.out.println("Total buah ada " + Fruits.length);

        // array nesting
        String[][] members = {
                {"widy", "gui"},
                {"sally", "chan"},
                {"budi"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[1][1]);
        System.out.println(members[1][0]);

    }
}
