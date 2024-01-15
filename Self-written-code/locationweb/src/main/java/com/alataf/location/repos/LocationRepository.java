package com.alataf.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alataf.location.entities.Location;
/*
 * replace T with the actual entity class for which you want to create the repository, 
 * and ID with the type of your entity's primary key.
 * CrudRepository<T, ID>
 * T- model class/entity--> here Location
 * ID- primaryKey in database--> here integer
 */

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
