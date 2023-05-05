public class Person {
    private String firstName;
    private String lastName;
    private static int age;

    private static boolean partner;

    private String partnerSurname;
    private String gender;

    Person(String firstName, String lastName, int age, String partner, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        Person.age = age;
        this.partner= partner!=null? true:false;
        this.partnerSurname = partner!=null? partner:"No partner";
        this.gender=gender;
    }

    public boolean isRetired(){
        if (Person.getAge()>65){
            return true;
        }
    return false;
    }

    public void registerPartnership (String womanSurname, String manSurname){
        if (womanSurname != manSurname){
            setLastName(manSurname);
            System.out.println("Прізвище стало " + getLastName());
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static boolean getPartner() {
        return partner;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPartnerSurname() {
        return partnerSurname;
    }

    public void setPartnerSurname(String partnerSurname) {
        this.partnerSurname = partnerSurname;
    }
    public static void setPartner(boolean partner) {
        Person.partner = partner;
    }
}
