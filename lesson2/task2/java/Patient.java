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

}