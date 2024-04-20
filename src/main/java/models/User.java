package models;



public class User {
    String place;
    String name;
    String lastName;
    String position;
    String id;
    String email;
    String phone;
    String location;

    public String getPlace() {
        return place;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public User withPlace(String place) {
        this.place = place;
        return this;
    }

    public User withName(String name) {
        this.name = name;
        return this;
    }

    public User withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User withPosition(String position) {
        this.position = position;
        return this;
    }

    public User withtId(String id) {
        this.id = id;
        return this;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public User withLocation(String location) {
        this.location = location;
        return this;
    }
}
