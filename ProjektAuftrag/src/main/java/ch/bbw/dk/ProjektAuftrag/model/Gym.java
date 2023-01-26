package ch.bbw.dk.ProjektAuftrag.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "gym")
@NamedQuery(name = "Gym.findAll", query = "FROM Gym")
public class Gym {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @Size(max=15, min=2)
    private String name;

    @Column(name = "location")
    @Size(max=20, min=2)
    private String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
