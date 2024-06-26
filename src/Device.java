public abstract class Device {
    private int id;
    private double price;
    private double discount;
    private int stock;
    private String name;
    private String brand;
    private int storage;
    private int ram;
    private double screenSize;

    public Device(int id, double price, double discount, int stock, String name, String brand, int storage, int ram, double screenSize) {
        this.id = id;
        this.price = price - (price * (discount/100));
        this.discount = discount;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

}
