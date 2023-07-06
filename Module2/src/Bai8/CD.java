package Bai8;

public class CD {
    private int id;
    private String title;
    private int numberOfTracks;
    private double price;

    public CD(int id, String title, int numberOfTracks, double price) {
        this.id = id;
        this.title = title;
        this.numberOfTracks = numberOfTracks;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CD [id=" + id + ", title=" + title + ", numberOfTracks=" + numberOfTracks + ", price=" + price + "]";
    }
}
