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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
