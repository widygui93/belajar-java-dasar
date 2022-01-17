public class Komentar {
    public static void main(String[] args) {
        System.out.println(sum(3,4));
    }
    /*
    kalau komentar multi line biasa ny berada di luar method atau class
     */

    /**
     * Method untuk menjumlahkan 2 nilai
     * @param a nilai pertama
     * @param b nilai kedua
     * @return hasil penjumlahan nilai pertama dan nilai kedua
     */
    static int sum(int a, int b){
        // jumlah nilai a dan nilai b
        // komentar single line biasa ny berada di dlm blok method
        return a + b;
    }
}
