package zipcode.rocks;

public class Person {
    private String firstname;
    private String lastname;
    private String beverage;
    private String color;
    private String birthmonth;
    private Boolean pets;

    public Person(String fname, String lname, String beverage, String color, String bmonth, String pets) {
        this.firstname = fname;
        this.lastname = lname;
        this.beverage = beverage;
        this.color = color;
        this.birthmonth = bmonth;
        this.pets =Boolean.valueOf(pets);

    }

    //public Person(String firstname, String lastname, String beverage, String color, String birthmonth) {}


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getbirthmonth() {
        return birthmonth;
    }

    public void setbirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public Boolean getPets() {
        return pets;
    }

    public void setPets(Boolean pets) {
        this.pets = pets;
    }

    public String toString() {
        return this.lastname + ", " + this.firstname + ", " + this.beverage + ", " + this.color + ", " + this.birthmonth + ", " + this.pets;
    }
}
