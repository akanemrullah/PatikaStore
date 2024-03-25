import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int id = 0;
    public static List<Brand> brandList = new ArrayList<>();
    public static List<Phone> phone = new ArrayList<>();
    public static List<Notebook> notebook = new ArrayList<>();


    public static void brands() {

        Main.brandList.add(new Brand(0, "Apple"));
        Main.brandList.add(new Brand(1, "Asus"));
        Main.brandList.add(new Brand(2, "Casper"));
        Main.brandList.add(new Brand(3, "HP"));
        Main.brandList.add(new Brand(4, "Huawei"));
        Main.brandList.add(new Brand(5, "Lenovo"));
        Main.brandList.add(new Brand(6, "Monster"));
        Main.brandList.add(new Brand(7, "Samsung"));
        Main.brandList.add(new Brand(8, "Xiaomi"));
        Main.brandList.sort(Comparator.comparing(Brand::getName));
    }

    public static void showBrands() {
        for (int i = 0; i < Main.brandList.size(); i++) {
            System.out.println("ID: " + Main.brandList.get(i).getId() + " ISIM: " + Main.brandList.get(i).getName());
        }
    }

    public static void addPhone(double price, double discount, int stock, String name, String brand, int storage, int ram, double screenSize, int battery, String colour, double camera) {

        Main.phone.add(new Phone(Main.id++, price, discount, stock, name, brand, storage, ram, screenSize, battery, colour, camera));
    }

    public static void addNotebook(double price, double discount, int stock, String name, String brand, int storage, int ram, double screenSize) {

        Main.notebook.add(new Notebook(Main.id++, price, discount, stock, name, brand, storage, ram, screenSize));
    }

    public static void listPhone() {
        System.out.println("\nCep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone p : phone) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-9.1f | %-9d | %-9d | %-9s |\n", p.getId(), p.getName(), p.getPrice(), p.getBrand(), p.getStorage(), p.getScreenSize(), p.getCamera(), p.getBattery(), p.getRam(), p.getColour());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    public static void listNotebook() {
        System.out.println("\nDizustu Bilgisayar Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran       | RAM      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Notebook n : notebook) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-9d |\n", n.getId(), n.getName(), n.getPrice(), n.getBrand(), n.getStorage(), n.getScreenSize(), n.getRam());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        brands();

        while (true) {

            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürünleri Listele");
            System.out.println("3. Ürün Sil");
            System.out.println("4. Marka Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            int select = input.nextInt();

            switch (select) {
                case 1:

                    while (true) {
                        System.out.println("Cep telefonu eklemek icin '1' seciniz.");
                        System.out.println("Dizustu bilgisayar eklemek icin '2' seciniz.");
                        System.out.print("Seciminiz : ");

                        int selectCategory = input.nextInt();

                        if (selectCategory == 1) { // Cep telefonu icin urun bilgileri aliniyor
                            System.out.println("Cep telefonu icin urun ekleniyor..");

                            System.out.print("Fiyat bilgisi gir: ");
                            double price = input.nextDouble();

                            System.out.print("Indirim miktarini gir: ");
                            double discount = input.nextDouble();

                            System.out.print("Stok durumunu gir: ");
                            int stock = input.nextInt();

                            input.nextLine();
                            System.out.print("Cihazin isim bilgisi gir: ");
                            String name = input.nextLine();

                            String brand;
                            while (true) {
                                System.out.println("Markalar listeleniyor...");
                                showBrands();
                                System.out.print("Cihazin marka bilgisi sec: ");
                                int selectBrand = input.nextInt();
                                if (selectBrand > 0 && selectBrand < 9) {
                                    brand = Main.brandList.get(selectBrand).getName();
                                    break;
                                } else {
                                    System.out.println("Hatali giris yaptin. Tekrar dene.");
                                }
                            }

                            System.out.print("Dahili hafiza bilgisi gir: ");
                            int storage = input.nextInt();

                            System.out.print("Ram bilgisi gir: ");
                            int ram = input.nextInt();

                            System.out.print("Ekran boyutu bilgisi gir: ");
                            double screenSize = input.nextDouble();

                            System.out.print("Batarya bilgisi gir: ");
                            int battery = input.nextInt();

                            input.nextLine();
                            System.out.print("Renk bilgisi gir: ");
                            String colour = input.nextLine();

                            System.out.print("Kamera cozunurluk bilgisini gir: ");
                            double camera = input.nextDouble();


                            addPhone(price, discount, stock, name, brand, storage, ram, screenSize, battery, colour, camera);
                            break;

                        } else if (selectCategory == 2) { // Dizustu icin urun bilgileri aliniyor...
                            System.out.println("Dizustu bilgisayar icin urun ekleniyor..");
                            System.out.print("Fiyat bilgisi gir: ");
                            double price = input.nextDouble();

                            System.out.print("Indirim miktarini gir: ");
                            double discount = input.nextDouble();

                            System.out.print("Stok durumunu gir: ");
                            int stock = input.nextInt();

                            input.nextLine();
                            System.out.print("Cihazin isim bilgisi gir: ");
                            String name = input.nextLine();

                            String brand;
                            while (true) {
                                System.out.println("Markalar listeleniyor...");
                                showBrands();
                                System.out.print("Cihazin marka bilgisi sec: ");
                                int selectBrand = input.nextInt();
                                if (selectBrand > 0 && selectBrand < 9) {
                                    brand = Main.brandList.get(selectBrand).getName();
                                    break;
                                } else {
                                    System.out.println("Hatali giris yaptin. Tekrar dene.");
                                }
                            }

                            System.out.print("Dahili hafiza bilgisi gir: ");
                            int storage = input.nextInt();

                            System.out.print("Ram bilgisi gir: ");
                            int ram = input.nextInt();

                            System.out.print("Ekran boyutu bilgisi gir: ");
                            double screenSize = input.nextDouble();

                            addNotebook(price, discount, stock, name, brand, storage, ram, screenSize);
                            break;

                        } else {
                            System.out.println("Hatali giris yapildi...");
                        }

                    }
                    break;

                case 2:
                    System.out.println("Urunler listeleniyor...");
                    System.out.println("Cep telefonu listelemek icin '1' basiniz.\nDizustu bilgisayar icin '2' basiniz.");

                    while (true) {
                        System.out.print("Seciminiz: ");
                        int selectDeviceToList = input.nextInt();

                        switch (selectDeviceToList) {
                            case 1:
                                System.out.println("Cep telefonlari listeleniyor...");
                                listPhone();
                                break;

                            case 2:
                                System.out.println("Dizustu bilgisayarlar listeleniyor...");
                                listNotebook();
                                break;

                            default:
                                System.out.println("Hatali giris yapildi.");
                                System.out.println("Tekrar dene.");
                        }
                        if (selectDeviceToList == 1 || selectDeviceToList == 2) {
                            break;
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        System.out.println("Cep telefonu silmek icin '1' tuslayin.\nDizustu bilgisayar silmek icin ise '2' tuslayin...");
                        System.out.print("Giris yapiniz lutfen.");
                        int selectCategory = input.nextInt();

                        if (selectCategory == 1) {
                            System.out.print("Silmek istedigin cep telefonunun id numarasini gir: ");
                            int id = input.nextInt();
                            phone.remove(id);
                            break;
                        } else if (selectCategory == 2) {
                            System.out.print("Silmek istedigin dizustu bilgisayarin id numarasini gir: ");
                            int id = input.nextInt();
                            notebook.remove(id);
                            break;
                        } else {
                            System.out.println("Hatali giris yapildi...");
                        }

                    }
                    break;

                case 4:
                    showBrands();
                    break;

                case 5:
                    System.out.println("Iyi gunler dileriz.\nCikis yapiliyor...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Hatali giris yaptiniz.");
            }
        }
    }
}