public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    private boolean hasPartner;

    private String partnerSurname;
    private String gender;

    Person(String firstName, String lastName, int age, String hasPartner, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        setHasPartner(hasPartner);
        this.gender=gender;
    }

    public abstract boolean isRetired();

    public void registerPartnership (Woman person1, Man person2){
        if (person1.getHasPartner()== person2.getHasPartner()) {
            if (person1.getLastName() != person2.getLastName()) {
                person1.setLastName(person2.getLastName());
                person1.setPartnerSurname(person2.getLastName());
                person2.setPartnerSurname(person1.getGirlSurname());
                System.out.println("Прізвище стало " + getLastName());
            }
        }
        else {
            System.out.println("Один з вас вже у шлюбі!");
        }
    }
    public abstract void deregisterPartnership (boolean divorsed);

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getHasPartner() {
        return hasPartner;
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
    public void setHasPartner(String person) {
       if (person != null){
           this.hasPartner=true;
       }
    }

    public void  setHasPartnerDivorsed(boolean isDivorsed) {
        this.hasPartner=isDivorsed;
    }
}
