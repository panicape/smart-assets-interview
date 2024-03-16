package es.panicape.smartassets.persistence;

import es.panicape.smartassets.model.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to handle brand data
 *
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@Repository
public interface IBrandRepository extends JpaRepository<BrandEntity, Integer> {


}
