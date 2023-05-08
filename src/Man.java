public class Man extends Person {

    private String job;

    Man(String firstName, String lastName, int age, String hasPartner, String gender, String job) {
        super(firstName, lastName, age, hasPartner, gender);
        this.job = job;
    }

    public boolean isRetired(){
        return (getAge()>65);
    }

    public void deregisterPartnership(boolean divorced){
        if (divorced) {
            setPartnerSurname(null);
            setHasPartnerDivorsed(false);
            System.out.println("Ти вільний чувак");
            System.out.println(getHasPartner());
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
