package oop.library;

import java.util.Objects;

public class Dvd extends Item{
    int length;

    public Dvd(String title, int year, int lenght) {
        super(title, year);
        this.length = lenght;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dvd dvd = (Dvd) o;
        return Objects.equals(title,dvd.title) && Objects.equals(year,dvd.year) && Objects.equals(length,dvd.length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year , length);
    }
}
