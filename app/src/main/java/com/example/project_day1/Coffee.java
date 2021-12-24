package com.example.project_day1;

public class Coffee {
    private  String title,description;
    private  int id;

    public Coffee(String title, String description, int id) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public Coffee() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
