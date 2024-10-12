class ikan extends Hewan {

    public ikan(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + "berkata : bub!");
    }
}