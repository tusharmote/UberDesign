package Models;

public class Rider {
    int id;
    String name;
    Rating rating;

    public Rider(int id, String name,Rating rating) {
        this.id = id;
        this.name = name;
        this.rating=rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
