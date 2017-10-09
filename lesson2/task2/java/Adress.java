public class Adress {
    private String city;
    private String street;
    private int houseNumber;
    private String index;

    public Adress(String city, String street, int houseNumber, String index) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.index = index;
        System.out.println("Создание адреса");

    }
}
