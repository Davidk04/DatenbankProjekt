package ch.bbw.dk.ProjektAuftrag.model;

import jakarta.persistence.*;

@Entity
@Table(name = "member")
@NamedQuery(name = "Member.findAll", query = "FROM Member")
public class Member {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "split_id", insertable = true, updatable = true)
    private Split split;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sub_id", insertable = true, updatable = true)
    private Subscription subscription;

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
