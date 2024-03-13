package es.panicape.smartassets.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The campaign entity
 *
 * @author Paulo Carrillo
 * @version 1.0 March 2024
 */
@Getter
@Setter
@Entity
@Table(name = "CAMPAIGN")
public class CampaignEntity {

    /** campaign id */
    @Id
    @Column(name = "C2_ID")
    private Integer id;

    /** campaign name */
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
    @JoinColumn(name = "C2_BRAND_ID")
    private BrandEntity brand;


    // Constructor

    /**
     * Constructor
     */
    public CampaignEntity() {
    }

    /**
     * Constructor
     *
     * @param id
     * @param name
     * @param dateCreate
     * @param dateUpdate
     */
    public CampaignEntity(Integer id, String name, String dateCreate, String dateUpdate) {
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
    public CampaignEntity(String name, String dateCreate, String dateUpdate) {
        this.name = name;
        this.dateCreate = dateCreate;
        this.dateUpdate = dateUpdate;
    }

}
