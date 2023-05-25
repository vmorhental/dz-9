public class Woman extends Person{

    private String girlSurname;

    Woman(String firstName, String lastName, int age, String hasPartner, String gender) {
        super(firstName, lastName, age, hasPartner, gender);
        this.girlSurname=lastName;
    }

    public boolean isRetired(){
    return (getAge()>60);
    }

    public void deregisterPartnership(boolean divorced){
        if (divorced) {
            setLastName(getGirlSurname());
            setPartnerSurname(null);
            setHasPartnerDivorsed(false);
            System.out.printf("Прізвище стало %s, Стан сімейний %s, Партнер %s", getLastName(), getHasPartner(), getPartnerSurname());
            System.out.println();
        }
    }
    public void setGirlSurname(String girlSurname) {
        this.girlSurname = girlSurname;
    }

    public String getGirlSurname() {
        return girlSurname;
    }
}
