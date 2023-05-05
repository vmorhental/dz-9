public class Woman extends Person{

    private String girlSurname;

    Woman(String firstName, String lastName, int age, String partner, String gender) {
        super(firstName, lastName, age, partner, gender);
        this.girlSurname=lastName;
    }
    @Override
    public boolean isRetired(){
        if (Person.getAge()>60){
            return true;
        }
        return false;
    }

    public void deregisterPartnership(boolean divorced){
        if (divorced) {
            setLastName(getGirlSurname());
            setPartnerSurname("Вільна");
            setPartner(false);
            System.out.printf("Прізвище стало %s, Стан сімейний %s, Партнер %s", getLastName(), getPartner(), getPartnerSurname());
        }
    }
    public void setGirlSurname(String girlSurname) {
        this.girlSurname = girlSurname;
    }

    public String getGirlSurname() {
        return girlSurname;
    }
}
