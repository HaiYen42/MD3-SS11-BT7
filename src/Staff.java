import java.time.LocalDate;

public class Staff {
    private boolean sex;
    private LocalDate dateOfBirth;
    private String name;

    public Staff(boolean sex, LocalDate dateOfBirth, String name) {
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", name='" + name + '\'' +
                '}';
    }
}
