/**
 * 
 */
package com.example.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;
import java.util.*;


/**
 * @author Divya Chelikani 
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog>findByName(String Name);

}