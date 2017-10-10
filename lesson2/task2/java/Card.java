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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}

