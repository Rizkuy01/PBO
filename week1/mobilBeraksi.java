package week1;

public class mobilBeraksi {
    public static void main(String[] args) {

        // Object1
        mobil mobilku = new mobil();
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2024;

        // Object2
        mobil mobilmu = new mobil();
        mobilmu.warna = "Maroon";
        mobilmu.tahunProduksi = 2021;

        // Object3
        mobil mobilPanji = new mobil();
        mobilPanji.warna = "biru";
        mobilPanji.jenis = "amphibi";

        // Output
        System.out.println("Rektor mempunyai pajero " + mobilku.warna + " dan Civic rektor berwarna " + mobilmu.warna);
        System.out.println("Dikirim dari tahun produksi " + mobilmu.tahunProduksi + " dan pajaknya mati ditahun "
                + mobilku.tahunProduksi);
        System.out.println("Mobil Panji itu mobil " + mobilPanji.jenis + " berwarna " + mobilPanji.warna);

        boolean mesin = true;
        mobilku.kondisiMesin(mesin);
    }

}