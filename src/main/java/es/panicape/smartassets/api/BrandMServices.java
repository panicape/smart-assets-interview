package es.panicape.smartassets.api;

import es.panicape.smartassets.model.BrandEntity;
import es.panicape.smartassets.model.CampaignEntity;
import es.panicape.smartassets.model.CreativeEntity;
import es.panicape.smartassets.persistence.IBrandRepository;
import es.panicape.smartassets.persistence.ICampaignRepository;
import es.panicape.smartassets.persistence.ICreativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Paulo Carrillo
 * @version 1.0 March 2024
 */
@RestController
@RequestMapping("brand_api")
public class BrandMServices {

    /**
     * IBrandRepository
     */
    @Autowired
    IBrandRepository brandRepo;

    /**
     * ICampaignRepository
     */
    @Autowired
    ICampaignRepository campaignRepo;

    /**
     * ICreativeRepository
     */
    @Autowired
    ICreativeRepository iCreativeRepo;


    // Methods

    /**
     *
     * @return
     */
    @GetMapping("/brands_list")
    public Iterable<BrandEntity> findAllBrands() {
        return brandRepo.findAll();
    }

    /**
     *
     * @param id the id
     * @return the brand element
     */
    @GetMapping("/brand/{id}")
    public Optional<BrandEntity> findBrandById(@PathVariable Integer id) {
        return brandRepo.findById(id);
    }

    /**
     * Get the list of creatives
     * @return the list of creative elements
     */
    @GetMapping("/creatives_list")
    public Iterable<CreativeEntity> findCreativeList() {
        return iCreativeRepo.findAll();
    }

    /**
     *
     * @param id the id
     * @return the creative element
     */
    @GetMapping("/creative")
    public Optional<CreativeEntity> findCreativeById(Integer id) {
        return iCreativeRepo.findById(id);
    }

    /**
     * API to get the creative list by brand id
     * @param brandId the id
     * @return the list of creatives that belongs to a brand
     */
    @GetMapping("/campaign_list/brand/{id}")
    public Iterable<CreativeEntity> allCreativesByBrandId(@PathVariable Integer brandId) {
        return iCreativeRepo.findCreativeByBrandId(brandId);
    }

    /**
     * API to get all the campaigns
     *
     * @return the list of campaigns
     */
    @GetMapping("/campaign_list")
    public Iterable<CampaignEntity> findAllCampaigns() {
        return campaignRepo.findAll();
    }

    /**
     * API to get a campaign by its id
     *
     * @param id the id
     * @return the campaign element
     */
    @GetMapping("/campaign")
    public Optional<CampaignEntity> findCampaignById(@PathVariable Integer id) {
        return campaignRepo.findById(id);
    }

    /**
     * API to get campaign by brand id
     *
     * @param id the brand id
     * @return the campaign
     */
    @GetMapping("/campaign/brand/{id}")
    public Iterable<CampaignEntity> findCampaignByBrandId(@PathVariable Integer id) {
        return campaignRepo.findCampaignByBrandId(id);
    }

}
