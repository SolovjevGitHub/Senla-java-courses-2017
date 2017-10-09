public class Card {
    private int number;
    private String createDate;
    private String complaint;
    private String diagnosis;

    public Card(int number, String createDate, String complaint, String diagnosis) {
        this.number = number;
        this.createDate = createDate;
        this.complaint = complaint;
        this.diagnosis = diagnosis;
        System.out.println("Создание карты");

    }
}
