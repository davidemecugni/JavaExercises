package oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook{
    final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person p) {
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null && phoneBook[i].equals(p)) {
                return false;
            }
        }
        for(int i=0;i<MAX_PERSONS;i++){
            if(phoneBook[i] == null){
                phoneBook[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null ) {
                if(phoneBook[i].equals(p)){
                    phoneBook[i] = null;
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String surname) {
        Person[] found = new Person[MAX_PERSONS];
        int nr = 0;
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null) {
                if (phoneBook[i].getLastname().equals(surname)) {
                    found[nr++] = phoneBook[i];
                }
            }
        }
        return Arrays.copyOf(found,nr);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String surname) {
        Person[] found = new Person[MAX_PERSONS];
        int nr = 0;
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null) {
                if (phoneBook[i].getLastname().equals(surname) && phoneBook[i].getName().equals(name)) {
                    found[nr++] = phoneBook[i];
                }
            }
        }
        return Arrays.copyOf(found,nr);
    }
}
