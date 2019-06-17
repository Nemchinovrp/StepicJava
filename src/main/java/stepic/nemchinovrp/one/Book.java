package stepic.nemchinovrp.one;

import java.util.Collection;
import java.util.List;

public class Book {
    private String name;
    private int year;
    private Collection<String> authorList;

    public Book() {
    }

    public Book(String name, int year, Collection<String> authorList) {
        this.name = name;
        this.year = year;
        this.authorList = authorList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Collection<String> getAuthors() {
        return authorList;
    }

    public void setAuthors(Collection<String> authorList) {
        this.authorList = authorList;
    }
}
