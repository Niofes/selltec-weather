package wetterstation;

class Tag {

    private int tagImMonat;
    private int temperatur;

    public Tag(int tagImMonat, int temperatur) {
        this.tagImMonat = tagImMonat;
        this.temperatur = temperatur;
    }

    public int getTagImMonat() {
        return tagImMonat;
    }

    public int getTemperatur() {
        return temperatur;
    }

}