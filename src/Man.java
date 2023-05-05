public class Man extends Person {

    private String job;

    Man(String firstName, String lastName, int age, String partner, String gender, String job) {
        super(firstName, lastName, age, partner, gender);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
