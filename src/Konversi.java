import java.util.Scanner;

public class Konversi {
    private int desimal;
    // overloading method
    public Konversi() {
        this.desimal = 0;
    }
    public Konversi(int desimal) {
        this.desimal = desimal;
    }
    
    // overloading constructor
    public void konversiBiner(String bilangan) {
        this.desimal = Integer.parseInt(bilangan, 2);
    }
    public void konversiOktal(String bilangan) {
        this.desimal = Integer.parseInt(bilangan, 8);
    }
    public void konversiHeksadesimal(String bilangan) {
        this.desimal = Integer.parseInt(bilangan, 16);
    }

    public void tampilHasil() {
        System.out.println("Hasil konversi: " + this.desimal);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        String bilangan;

        System.out.println(" + == Program Konversi Bilangan == +");

        Konversi konversi = new Konversi();

        do {
            System.out.println("Jenis bilangan");
            System.out.println("1. Biner");
            System.out.println("2. Oktal");
            System.out.println("3. Heksadesimal");
            System.out.println("4. Keluar");
            System.out.print("Pilih jenis bilangan: ");
            pilihan = input.nextInt();
            if(pilihan == 1){
                System.out.print("Masukkan Bilangan Biner: ");
                bilangan = input.next();
                konversi.konversiBiner(bilangan);
                konversi.tampilHasil();
            }
            else if(pilihan == 2){
                System.out.println("Masukkan Bilangan Oktal: ");
                bilangan = input.next();
                konversi.konversiOktal(bilangan);
                konversi.tampilHasil();
            }
            else if(pilihan == 3){
                System.out.println("Masukkan Bilangan Heksadesimal: ");
                bilangan = input.next();
                konversi.konversiHeksadesimal(bilangan);
                konversi.tampilHasil();
            }
            else if(pilihan == 4){}
            else{System.out.println("Harap pilih dengan benar");}
            System.out.println("\n");
        } while (pilihan != 4);
    }
}
