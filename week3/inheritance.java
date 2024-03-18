package week3;

// superclass
class Kendaraan {
    // access modifier protected untuk memungkinkan subclass mengakses
    protected String merek;
    protected int tahunProduksi;

    // constructor superclass
    public Kendaraan(String merek, int tahunProduksi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
    }

    // method untuk menampilkan informasi kendaraan
    public void display() {
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}

// subclass yang mewarisi dari superclass Kendaraan
class Mobil extends Kendaraan {
    // tambahan atribut khusus untuk subclass Mobil
    private int jumlahPintu;

    // constructor subclass Mobil
    public Mobil(String merek, int tahunProduksi, int jumlahPintu) {
        // memanggil constructor superclass menggunakan keyword super
        super(merek, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    // method untuk menampilkan informasi mobil, termasuk informasi dari superclass
    public void display() {
        super.display(); // memanggil method display dari superclass
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

// kelas utama
public class inheritance {
    public static void main(String[] args) {
        // membuat objek Kendaraan
        Kendaraan kendaraan = new Kendaraan("Honda", 2020);
        // memanggil method display dari objek Kendaraan
        kendaraan.display();

        System.out.println(); // baris kosong

        // membuat objek Mobil
        Mobil mobil = new Mobil("Toyota", 2019, 4);
        // memanggil method display dari objek Mobil
        mobil.display();
    }
}
