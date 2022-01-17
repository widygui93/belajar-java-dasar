public class IfStatement {
    public static void main(String[] args) {
        var nilaiAbsensi = 60;
        var nilaiAkhir = 90;

        if (nilaiAbsensi >=75 && nilaiAkhir >=80){
            System.out.println("Anda Lulus");
        } else{
            System.out.println("Anda kurang beruntung. Coba lagi.");
        }

        if(nilaiAbsensi >= 80 && nilaiAkhir >=80){
            System.out.println("Nilai Anda A");
        } else if (nilaiAbsensi >= 70 && nilaiAkhir >=70){
            System.out.println("Nilai Anda B");
        } else if (nilaiAbsensi >= 60 && nilaiAkhir >=60){
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("Nilai Anda D");
        }
    }
}
