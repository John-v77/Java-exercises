package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private Integer yearsOfTeachings;


    public Teacher(String firstName, String lastName, String subject, Integer yearsOfTeachings){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsOfTeachings = yearsOfTeachings;
    }

    public  Teacher(String firstName, String lastName, String subject){
        this(firstName, lastName, subject, 0);
    }

//    setters and getters
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getYearsOfTeachings() {
        return yearsOfTeachings;
    }

    public void setYearsOfTeachings(Integer yearsOfTeachings) {
        this.yearsOfTeachings = yearsOfTeachings;
    }

}

