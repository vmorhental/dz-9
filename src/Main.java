public class Main {
    public static void main(String[] args) {
        Woman slavka = new Woman("Slavka","Loia",61,null,"Woman");
        slavka.getHasPartner();
        System.out.println("Дівоче прізвище "+ slavka.getGirlSurname() + ", чи є дівчина пенсіонер?  " + slavka.isRetired());
        Man valerii = new Man("Valerii","Morhental", 60, "Slavka","Man","QA");
        System.out.println("Job is " + valerii.getJob() + ", is Valerii retired? " + valerii.isRetired());
        slavka.registerPartnership(slavka,valerii);
        slavka.deregisterPartnership(true);
//        valerii.deregisterPartnership(true);
        slavka.registerPartnership(slavka,valerii);
    }
}
