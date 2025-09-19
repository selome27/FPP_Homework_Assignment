package LESSON9.problem4;

public class Ticket {
    private int id;
    private String description;

    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Ticket { id=" + this.id + ", description='" + this.description + "'}";
    }
}


