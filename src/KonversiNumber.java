public class KonversiNumber {
    public static void main(String[] args) {
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 128;
        byte iniByte2 = (byte) iniInt2;
        // ini kena number overflow
        // karena byte hanya bisa sampai 127
        // jadi jika byte di isi 128 maka akan balik lagi ke nilai awal byte yaitu -128

        System.out.println(iniByte2);
    }
}
