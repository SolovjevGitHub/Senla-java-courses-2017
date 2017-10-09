public class Doctor {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String speciality;

    public Doctor(String firstName, String lastName, String phoneNumber, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        System.out.println("Создание доктора");
    }

}
