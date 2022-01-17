public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "F";

        switch (nilai){
            case "A":
                System.out.println("Anda Lulus dengan memuaskan");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus dengan baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }

        // cara menggunakan switch lambda
        switch (nilai){
            case "A" -> System.out.println("Anda lulus dengan memuaskan");
            case "B", "C" -> System.out.println("Anda lulus dengan baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Anda salah jurusan");
            }
        }

        // cara menggunakan yield
        var ucapan = switch (nilai) {
            case "A":
                yield "Anda lulus dengan memuaskan";
            case "B", "C":
                yield "Anda lulus dengan baik";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Anda salah jurusan";
        };

        System.out.println(ucapan);
    }
}
