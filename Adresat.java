package Lesson_3;
import java.util.Objects;
public class Adresat {
  private String name;
  private String surName;
  private String status;
  private int numberOfPhone;

    public Adresat(String name, String surName, String status, int numberOfPhone) {
        this.name = name;
        this.surName = surName;
        this.status = status;
        this.numberOfPhone = numberOfPhone;
    }

    public Adresat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(int numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adresat adresat = (Adresat) o;

        if (numberOfPhone != adresat.numberOfPhone) return false;
        if (!name.equals(adresat.name)) return false;
        if (!surName.equals(adresat.surName)) return false;
        return status.equals(adresat.status);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surName.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + numberOfPhone;
        return result;
    }

    @Override
    public String toString() {
        return "Пользователь { " +
                "Имя = '" + name + '\'' +
                ", Фамилия = '" + surName + '\'' +
                ", Социальний статус = '" + status + '\'' +
                ", Номер телефона = " + numberOfPhone +
                " }";
    }
}
