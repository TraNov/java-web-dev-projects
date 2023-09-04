public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public void setyearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getfirstName() {
        return this.firstName;
    }


    public String getlastName() {
        return this.lastName;
    }


    public String getsubject() {
        return this.subject;
    }


    public int getyearsTeaching() {
        return this.yearsTeaching;
    }

}
