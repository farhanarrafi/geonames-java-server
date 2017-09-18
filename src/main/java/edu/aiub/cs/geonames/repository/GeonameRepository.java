package edu.aiub.cs.geonames.repository;

import edu.aiub.cs.geonames.model.Geoname;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Farhan on 9/18/2017.
 * This is a helper class for accessing the database.
 */
public interface GeonameRepository extends CrudRepository<Geoname, Long> {
}
