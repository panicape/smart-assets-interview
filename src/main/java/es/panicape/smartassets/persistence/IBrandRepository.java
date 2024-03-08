package es.panicape.smartassets.persistence;

import es.panicape.smartassets.model.BrandEntity;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Paulo Carrillo
 * @version 1.01 March 2024
 */
@org.springframework.stereotype.Repository
public interface IBrandRepository extends Repository<BrandEntity, Integer> {

    List<BrandEntity> findById(@Param("id") Integer id);

    List<BrandEntity> findByName(@Param("name") String name);

    List<BrandEntity> findAll() ;

}
