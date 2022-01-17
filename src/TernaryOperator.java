public class TernaryOperator {
    public static void main(String[] args) {
        // tanpa ternary operator
        var nilai = 85;
        String ucapan;

        if (nilai >=80){
            ucapan = "Nilai anda Bagus";
        } else {
            ucapan = "Nilai anda kurang bagus";
        }

        System.out.println(ucapan);

        // dengan ternary operator
        String ucapan2 = nilai >=85 ? "Nilai anda bagus" : "Nilai anda kurang bagus";
        System.out.println(ucapan2);

        System.out.println(nilai >= 85 ? "Nilai anda bagus" : "Nilai anda kurang bagus");
    }
}
