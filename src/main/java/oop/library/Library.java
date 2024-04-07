package oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    ArrayList<Rent> rents;

    public Library() {
        this.rents = new ArrayList<Rent>();
    }
    public boolean addRent(Rent r){
        return rents.add(r);
    }
    public boolean removeRent(Rent r){
        return rents.remove(r);
    }
    public ArrayList<Rent> getExpired(LocalDate date){
        ArrayList<Rent> expired = new ArrayList<Rent>();
        for(Rent rent : rents){
            if(rent.isExpired(date)){
                expired.add(rent);
            }
        }
        return expired;
    }
}
