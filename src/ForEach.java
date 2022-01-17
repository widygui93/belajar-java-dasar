public class ForEach {
    public static void main(String[] args) {
        String[] fruits = {
          "apple", "orange", "pear", "banana", "melon"
        };

        // tanpa foreach
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println("+++++++++++++");

        // dengan foreach
        for (var fruit : fruits) {
            System.out.println(fruit);

        }

    }
}
