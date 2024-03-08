package es.panicape.smartassets.persistence;

import es.panicape.smartassets.model.CampaignEntity;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Repository to handle campaign data
 *
 * @author Paulo Carrillo
 * @version 1.0 March 2024
 */
@Repository
public interface ICampaignRepository extends CrudRepository<CampaignEntity, Integer> {

    /**
     * Method to get campaigns by brand id
     *
     * @param brandId the brand id
     * @return the campaign list related to the brand
     */
    Iterable<CampaignEntity> findCampaignByBrandId(Integer brandId);

}
