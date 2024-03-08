package es.panicape.smartassets.persistence;

import es.panicape.smartassets.model.CreativeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Repository to handle creatives data
 *
 * @author Paulo Carrillo
 * @version 1.0 March 2024
 */
@Repository
public interface ICreativeRepository extends CrudRepository<CreativeEntity, Integer> {

    /**
     * find Creative By Brand Id
     *
     * @param brandId the brand id
     * @return the creative list related to this brand
     */
    Iterable<CreativeEntity> findCreativeByBrandId(Integer brandId);

}
