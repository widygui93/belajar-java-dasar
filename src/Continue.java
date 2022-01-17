public class Continue {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++){
            if (counter % 2 == 0){
                continue; // akan menghentikan perulangan saat ini aja dan dilanjutkan ke perulangan berikutnya
            }
            System.out.println("perulangan ganjil " + counter);
        }
    }
}
