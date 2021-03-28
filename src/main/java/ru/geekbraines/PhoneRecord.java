package ru.geekbraines;

public class PhoneRecord {
    private String family;
    private String number;

    public PhoneRecord(String family, String number) {
        this.family = family;
        this.number = number;
    }

    public String getFamily() {
        return family;
    }

    public String getNumber() {
        return number;
    }
}
