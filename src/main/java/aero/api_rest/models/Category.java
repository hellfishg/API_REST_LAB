package aero.api_rest.models;

import javax.persistence.*;

@Entity
public class Category {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Long parent_id;

    //Getter and Setters:
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }
}
