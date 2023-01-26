package ch.bbw.dk.ProjektAuftrag.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "subscription")
@NamedQuery(name = "Subscription.findAll", query = "FROM Subscription")
public class Subscription {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    @Size(max=15, min=2, message = "Not between 2-15")
    private String title;

    @Column(name = "cost")
    @Min(value = 10, message = "Min value is 10")
    private int cost;

    @JsonIgnore
    @OneToMany(mappedBy = "subscription")
    private List<Member> member;

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }
}
