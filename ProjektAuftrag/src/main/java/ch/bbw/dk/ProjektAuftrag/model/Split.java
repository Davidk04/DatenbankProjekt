package ch.bbw.dk.ProjektAuftrag.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "split")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQuery(name = "Split.findAll", query = "FROM Split")
public class Split {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    @Size(max=15, min=2, message = "Not between 2-15")
    private String title;

    @Column(name = "days")
    @Max(value = 7, message = "max value is 7")
    private int days;

    @JsonIgnore
    @OneToMany(mappedBy = "split")
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }
}
