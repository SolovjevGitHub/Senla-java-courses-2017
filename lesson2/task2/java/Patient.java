public class Patient extends APerson {
    private int id;
    private String phoneNumber;
    private Card card;
    private Adress adress;
    private Doctor doctor;

    public Patient(int id,String firstName,String lastName, String gender,int age,String phoneNumber,Card card,Adress adress,Doctor doctor) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.card=card;
        this.adress=adress;
        this.doctor=doctor;
        System.out.println("Создание пациента");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}