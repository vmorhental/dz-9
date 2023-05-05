public class Main {
    public static void main(String[] args) {
        Woman slavka = new Woman("Slavka","Loia",61,"Slavka","Woman");
        System.out.println("Дівоче прізвище "+ slavka.getGirlSurname() + ", чи є дівчина пенсіонер?  " + slavka.isRetired());
        slavka.registerPartnership("Loia", "Morhental");
        slavka.deregisterPartnership(true);
        Man valerii = new Man("Valerii","Morhental", 67, null,"Man","QA");
        System.out.println("Job is " + valerii.getJob() + ", is Valerii retired? " + valerii.isRetired());
    }
}
