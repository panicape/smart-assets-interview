package es.panicape.smartassets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "CAMPAING")
public class CampaignEntity {

    /** campaign id */
    @Id
    @Column(name = "ID")
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
