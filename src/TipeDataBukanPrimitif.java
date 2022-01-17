public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        // tipe data bukan primitif itu adalah tipe data objek
        // jadi di awali dgn huruf besar dan memiliki method
        // dan nilai default nya null
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        // cara mengkonversi tipe data primitif ke tipe data bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        System.out.println(iniInteger2);

        // cara mengkonversi tipe data bukan primitf (objek) ke tipe data primitif tapi beda tipe data(tidak kompatible)
        // maka panggil method dari tipe data bukan primitf(objek)

        short iniShort = iniInteger2.shortValue();
        System.out.println(iniShort);
    }
}
