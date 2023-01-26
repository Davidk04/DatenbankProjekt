package ch.bbw.dk.ProjektAuftrag.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

import java.util.Collection;

@Entity
@Table(name = "member")
@NamedQuery(name = "Member.findAll", query = "FROM Member")
public class Member {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @Size(max=15, min=2, message = "Not between 2-15")
    private String name;

    @Min(value = 17, message = "age min is 17")
    @Column(name = "age")
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "split_id", insertable = true, updatable = true)
    private Split split;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_id", insertable = true, updatable = true)
    private Subscription subscription;

    @ManyToMany
    @JoinTable(name = "member_gym", joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "gym_id", referencedColumnName = "id"))
    private Collection<Gym> gyms;

    public Collection<Gym> getGyms() {
        return gyms;
    }

    public void setGyms(Collection<Gym> gyms) {
        this.gyms = gyms;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Split getSplit() {
        return split;
    }

    public void setSplit(Split split) {
        this.split = split;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }
}
