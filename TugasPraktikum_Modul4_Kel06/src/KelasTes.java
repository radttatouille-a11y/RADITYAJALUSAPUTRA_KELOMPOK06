import java.util.*;

public class KelasTes {

    public boolean penilaian_inggris(char jawaban, char kunci) {
        if (jawaban == kunci) {
            return true;
        }
        else {
            return false;
        }
    }
    public char nilaikehuruf(boolean[] hasil) {

        int salah = 0;

        for (int i = 0; i < hasil.length; i++) {
            if (!hasil[i]) {
                salah++;
            }
        }

        if (salah == 0) {
            return 'A';
        }
        else if (salah == 1 || salah == 2) {
            return 'B';
        }
        else {
            return 'C';
        }
    }

    public void soal_inggris(Scanner input, boolean[] hasil) {

        for (int i = 0; i < 3; i++) {
        System.out.println("Harap diperhatikan untuk jawaban dengan huruf KAPITAL! (misal: B)");
            if (i == 0) {
                System.out.println("Soal 1");
                System.out.println("What is the meaning of 'book'?");
                System.out.println("A. Buku");
                System.out.println("B. Meja");
                System.out.println("C. Kursi");
                System.out.println("D. Pintu");

                System.out.print("Jawaban: ");
                char jawaban = input.next().charAt(0);

                hasil[i] = penilaian_inggris(jawaban, 'A');
            }

            else if (i == 1) {
                System.out.println("Soal 2");
                System.out.println("What is the meaning of 'cat'?");
                System.out.println("A. Anjing");
                System.out.println("B. Kucing");
                System.out.println("C. Burung");
                System.out.println("D. Ikan");

                System.out.print("Jawaban: ");
                char jawaban = input.next().charAt(0);

                hasil[i] = penilaian_inggris(jawaban, 'B');
            }

            else if (i == 2) {
                System.out.println("Soal 3");
                System.out.println("What is the meaning of 'red'?");
                System.out.println("A. Biru");
                System.out.println("B. Hijau");
                System.out.println("C. Merah");
                System.out.println("D. Kuning");

                System.out.print("Jawaban: ");
                char jawaban = input.next().charAt(0);

                hasil[i] = penilaian_inggris(jawaban, 'C');
            }
        }

        System.out.println("\n===== HASIL =====");

        for (int i = 0; i < 3; i++) {
            System.out.println("Soal " + (i + 1) + " : " + hasil[i]);
        }
    }
}