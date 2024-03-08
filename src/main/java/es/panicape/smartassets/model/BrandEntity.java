package es.panicape.smartassets.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The Branding Entity
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Getter
@Setter
@Entity
@Table(name = "BRAND")
public class BrandEntity {

    /**
     * brand Id
     * -- GETTER --
     *
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BRAND_ID")
    private Integer brandId;

    /**
     * brand name
     * -- GETTER --
     *
     * @return

     */
    @Column(name = "NAME", nullable = false)
    private String name;

    /**
     * the date create
     *
     * -- GETTER --
     *
     * @return the date
     */
    @Column(name = "DATE_CREATE")
    private String dateCreate;

    /**
     * the date update
     *
     * -- GETTER --
     *
     * @return the date

     */
    @Column(name = "DATE_UPDATE")
    private String dateUpdate;


    // Constructor

    /**
     * constructor
     */
    public BrandEntity() {
    }

    /**
     * constructor
     *
     * @param name
     * @param dateCreate
     * @param dateUpdate
     */
    public BrandEntity(String name, String dateCreate, String dateUpdate) {
        this.name = name;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

    /**
     * constructor
     *
     * @param brandId
     * @param name
     * @param dateCreate
     * @param dateUpdate
     */
    public BrandEntity(Integer brandId, String name, String dateCreate, String dateUpdate) {
        this.brandId = brandId;
        this.name = name;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }
}
