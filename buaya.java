class buaya extends Hewan {

    public buaya(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + "berkata : halo kak!");
    }
}