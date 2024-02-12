package week1;

public class mobilBeraksi {
    public static void main(String[] args) {
        mobil mobilku = new mobil();
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2024;

        mobil mobilmu = new mobil();
        mobilmu.warna = "Maroon";
        mobilmu.tahunProduksi = 2021;

        System.out.println("Rektor mempunyai pajero " + mobilku.warna + " dan Civic rektor berwarna " + mobilmu.warna);
        System.out.println("Dikirim dari tahun produksi " + mobilmu.tahunProduksi + " dan pajaknya mati ditahun "
                + mobilku.tahunProduksi);
    }

}