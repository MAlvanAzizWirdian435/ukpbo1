public class main {
    
    public static void main(String[] args) {
        buaya buaya = new buaya("Satria ", 18);
        macan macan = new macan("Abe ", 15);
        ikan ikan = new ikan("Kucing ", 2);

        buaya.suara();
        macan.suara();
        ikan.suara();

        buaya.setUmur(3);
        System.out.println(buaya.getNama() + " sekarang berumur " + buaya.getUmur() + " tahun.");
        
        macan dinosaurus2 = new macan("Max", 4);
        
        System.out.println(dinosaurus2.getNama() + " berumur " + dinosaurus2.getUmur() + " tahun.");
        
        dinosaurus2.setNama("Fatir");
        System.out.println("Nama baru dinosaurus adalah: " + dinosaurus2.getNama());
        
        Hewan[] hewanArray = {buaya, macan, ikan};
        
        for (Hewan hewan : hewanArray) {
            hewan.suara();
        }
    }
}
