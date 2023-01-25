package ch.bbw.dk.ProjektAuftrag.model;

public class Split {
    private int id;
    private String title;
    private int days;

    public Split(int id, String title, int days) {
        this.id = id;
        this.title = title;
        this.days = days;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
