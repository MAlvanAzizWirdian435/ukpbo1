public class main {
    
    public static void main(String[] args) {
        // Membuat objek dari kelas anak
        buaya buaya = new buaya("Satria ", 18);
        macan macan = new macan("Abe ", 15);
        ikan ikan = new ikan("Kucing ", 2);

        // Menampilkan suara masing-masing hewan
        buaya.suara();
        macan.suara();
        ikan.suara();

        // Menggunakan setter dan getter
        buaya.setUmur(3);
        System.out.println(buaya.getNama() + " sekarang berumur " + buaya.getUmur() + " tahun.");
        
        // Overloading constructor (contoh)
        macan dinosaurus2 = new macan("Max", 4);
        
        System.out.println(dinosaurus2.getNama() + " berumur " + dinosaurus2.getUmur() + " tahun.");
        
        // Mengubah nama menggunakan setter
        dinosaurus2.setNama("Fatir");
        System.out.println("Nama baru dinosaurus adalah: " + dinosaurus2.getNama());
        
        // Demonstrasi polymorphism
        Hewan[] hewanArray = {buaya, macan, ikan};
        
        for (Hewan hewan : hewanArray) {
            hewan.suara(); // Memanggil metode suara yang sesuai berdasarkan objeknya
        }
    }
}