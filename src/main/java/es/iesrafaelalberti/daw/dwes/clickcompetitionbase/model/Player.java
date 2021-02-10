package es.iesrafaelalberti.daw.dwes.clickcompetitionbase.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int clicks;

    public Player() {
    }

    public Player(String name, int clicks) {
        this.name = name;
        this.clicks = clicks;
    }

    public void addClicks(int clicks) {
        this.clicks += clicks;
    }
}
