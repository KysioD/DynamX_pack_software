package fr.kysio.dynamx_pack_gui_software.projects;

import java.util.ArrayList;

public class Project {

    private String name;
    private String author;
    private String recipient;

    public Project(String name, String author, String recipient){

        this.name = name;
        this.author = author;
        this.recipient = recipient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
