package oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
        if(phoneBook.contains(p) || phoneBook.size() >= MAX_PERSONS){
            return false;
        }
        return phoneBook.add(p);
    }

    @Override
    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    @Override
    public Person[] searchByLastname(String surname) {
        ArrayList<Person> found= new ArrayList<>();
        for(Person p : phoneBook){
            if(p.getLastname().equals(surname)){
                found.add(p);
            }
        }
        return found.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String surname) {
        ArrayList<Person> found= new ArrayList<>();
        for(Person p : phoneBook){
            if(p.getLastname().equals(surname) && p.getName().equals(name)){
                found.add(p);
            }
        }
        return found.toArray(new Person[]{});
    }
}
