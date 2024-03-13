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
    @Column(name = "C1_ID", nullable = false)
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

    /** the brand relation */
    @ManyToOne
    @JoinColumn(name = "C1_BRAND_ID")
    private BrandEntity brand;


    // Constructor

    /**
     * Constructor
     */
    public CreativeEntity() {
    }

    /**
     *
     * @param id the id
     * @param name the name
     * @param dateCreate the dateCreate
     * @param dateUpdate the dateUpdate
     * @param id the brandId
     * @param brand the brand
     */
    public CreativeEntity(Integer id, String name, String dateCreate, String dateUpdate,
                          BrandEntity brand) {
        this.id = id;
        this.name = name;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
        this.brand = brand;
    }

}
