import java.util.*;
public class Main {
    static void perkenalankel6(){
        System.out.println("=====  Anggota Kel 6 SHIFT 1 =====");
        System.out.println("1. Javiar Riski Aditya (211201261300)");
        System.out.println("2. Adityo Yusuf Yanesa (21120126130086)");
        System.out.println("3. mboh (21120126140)");
        System.out.println("4. lupa (21120126140)\n");

    }
    static String ngecekhasil(char a){
        if(a == 'A'){
            return "DA kamu LULUS cumlaude!!!";
        }
        else if(a == 'B') {
            return "SELAMAT kamu LULUS!!!";
        }
        else {
            return "D, Mohon maaf anda harus mengambil ULANG tesnya!!!!";
        }
    }
    static void JenisTes(int a){

        switch(a){
            case 1:
                System.out.println("Ok, siap siap!!!");
                System.out.println("------------------ UJIAN BAHASA INGGRIS ----------------");
                break;
            case 2:
                System.out.println("Wah Jamkos!!!");
                break;
            default:
                System.out.println("Eh maaf, kita hanya punya 2 tes hari ini");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        KelasTes tesBing = new KelasTes();
        char nilai;
        boolean[] hasil = new boolean[3];


        System.out.println("============== TUGAS PRAKTIKUM MODUL 4 =================");
        perkenalankel6();
        do {
            nilai = 'D';
            System.out.println("============== PROGRAM TES UJIAN HARIAN ================");
            System.out.println("Hi, kamu mau ngambil tes apa?");
            System.out.println("(Hint: 1. Inggris 2. Matematika)");
            System.out.print("Tes yang ingin diambil : ");
            int TesDiambil = input.nextInt();
            JenisTes(TesDiambil);
            if (TesDiambil == 1) {
                tesBing.soal_inggris(input, hasil);
                nilai = tesBing.nilaikehuruf(hasil);
            }

            System.out.println(ngecekhasil(nilai));
            char ulang = 'y';
            switch(nilai){
                case 'A': case 'B':
                    System.out.print("Ok...Apakah anda ingin mengambil ulang tesnya?(y/n): ");
                    ulang = input.next().charAt(0);

                default: System.out.println(" ");
            }
            if (ulang == 'N' || ulang == 'n') break;

        }while(true);
        System.out.println("Terimakasih telah menggunakan program ini -Kelompok 6 Shift 1");
    }
}