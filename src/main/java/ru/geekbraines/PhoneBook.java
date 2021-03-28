package ru.geekbraines;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<PhoneRecord> book;

    public PhoneBook() {
        this.book = new ArrayList<PhoneRecord>();
    }

    public void add(String family, String number) {
        PhoneRecord record = new PhoneRecord(family,number);
        boolean add = book.add(record);
    }

    public PhoneBook get(String family) {
        PhoneBook res = new PhoneBook();
        for (PhoneRecord phoneRecord : book) {
            if (phoneRecord.getFamily().equals(family)) {
                res.add(phoneRecord.getFamily(), phoneRecord.getNumber());
            }
        }
        return res;
    }

    public void print() {
        for (PhoneRecord phoneRecord : book) {
            System.out.println(phoneRecord.getFamily() + ": " + phoneRecord.getNumber());
        }
    }
}
