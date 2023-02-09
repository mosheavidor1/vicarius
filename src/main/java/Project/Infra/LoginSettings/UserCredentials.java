package Project.Infra.LoginSettings;

import Project.Infra.LoginSettings.LoginCredentials;

public class UserCredentials {

    String name;
    String lastname;

    String workEmail ;

    public String getPass() {

        this.pass= LoginCredentials.pass;
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    String company;

    String pass;




    public String getName() {

        this.name=LoginCredentials.firstName;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        this.lastname=LoginCredentials.lastName;
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getWorkEmail() {
        this.workEmail=LoginCredentials.workEmail;
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getCompany() {
        this.company=LoginCredentials.company;
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
