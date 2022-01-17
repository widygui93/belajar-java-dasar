public class Variable {
    public static void main(String[] args) {
        String nama;
        nama = "Widy Gui";

        int umur = 28;
        String kota = "Medan";

        System.out.println(nama);
        System.out.println(umur);
        System.out.println(kota);

        var fruit = "apple"; // java 10 keatas dpt mengetahui tipe data asal ada nilai nya
        //var vegetable; // error karena perlu nilai saat deklarasi variable dgn var

        final String app = "C++";
        //app = "PHP"; // error karena tidak boleh mengubah nilai konstanta

    }
}
