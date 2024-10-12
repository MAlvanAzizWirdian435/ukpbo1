class macan extends Hewan {

    public macan(String nama, int umur) {
        super(nama, umur);
    }

    @Override
    public void suara() {
        System.out.println(getNama() + "berkata : rawwrrrrr!");
    }
}