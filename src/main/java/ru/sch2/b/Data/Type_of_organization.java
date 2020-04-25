package ru.sch2.b.Data;

import javax.persistence.*;

@Entity
public class Type_of_organization {
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Organization organization;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Type_of_organization{" +
         //       "organization=" + organization +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
