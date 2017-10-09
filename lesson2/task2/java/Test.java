public class Test {
    public static void main(String[] args) {
        System.out.println("Run test class:");
        Adress adress=new Adress("Minsk","Kupali",10,"2312222");
        Doctor doctor=new Doctor("Stephen","King","+3332230","hirurg");
        Card card=new Card(1,"12.12.2012","zzzzzz", "ppz");
        Patient patient=new Patient(99,"Homer","Simpson","male",29,"+37529888888",card,adress,doctor);
    }
}
