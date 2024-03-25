public class Phone extends Device{
    private int battery;
    private String colour;
    private double camera;
    public Phone(int id, double price, double discount, int stock, String name, String brand, int storage, int ram, double screenSize, int battery, String colour,double camera) {
        super(id, price, discount, stock, name, brand, storage, ram, screenSize);

        this.battery = battery;
        this.colour = colour;
        this.camera = camera;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }
}
