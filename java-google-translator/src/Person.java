public class Person {

    /*
    !!! CALL-OUT !!!
    PARENT CLASS
    */
    private String firstName;
    private String lastName;

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String fName) {
        firstName = fName;
        lastName = "";
    }

    public void setName(String name, String lName) {
        firstName = name;
        lastName = lName;
    }

}
