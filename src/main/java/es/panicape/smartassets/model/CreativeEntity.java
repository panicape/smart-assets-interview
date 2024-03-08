package es.panicape.smartassets.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The creative entity
 *
 * @author Paulo Carrillo
 * @version 1.0 March 2024
 */
@Getter
@Setter
@Entity
@Table(name = "CREATIVE")
public class CreativeEntity {

    /** The id */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Integer id;

    /**  the name */
    @Column(name = "NAME", nullable = false)
    private String name;

    /** the dateCreate */
    @Column(name = "DATE_CREATE")
    private String dateCreate;

    /** the dateUpdate */
    @Column(name = "DATE_UPDATE")
    private String dateUpdate;


    // Constructor

    /**
     * Constructor
     */
    public CreativeEntity() {
    }

    /**
     * Constructor
     *
     * @param id
     * @param name
     * @param dateCreate
     * @param dateUpdate
     */
    public CreativeEntity(Integer id, String name, String dateCreate, String dateUpdate) {
        this.id = id;
        this.name = name;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    /**
     * Constructor
     *
     * @param name
     * @param dateCreate
     * @param dateUpdate
     */
    public CreativeEntity(String name, String dateCreate, String dateUpdate) {
        this.name = name;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

}
