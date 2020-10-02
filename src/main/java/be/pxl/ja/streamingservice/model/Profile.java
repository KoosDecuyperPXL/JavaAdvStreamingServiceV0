package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Profile {
    String name;
    LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        if (getDateOfBirth() == null) {
            setDateOfBirth(LocalDate.now());
        }
        int age = LocalDate.now().getYear() - getDateOfBirth().getYear();
        if (getDateOfBirth().getDayOfYear() >= LocalDate.now().getDayOfYear()) {
            age--;
        }
        return age;
    }

    public boolean allowedToWatch(Content content) {
        if (content.getMaturityRating().ordinal() <= getAge()) {
            return true;
        }
        return false;
    }
}
