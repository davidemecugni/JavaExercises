package oop.phonebook;

public interface PhoneBook {
    public static final int MAX_PERSONS = 256;
    boolean addPerson(Person p);
    boolean removePerson(Person p);
    Person[] searchByLastname(String surname);
    Person[] searchByNameAndLastname(String name, String surname);
}
