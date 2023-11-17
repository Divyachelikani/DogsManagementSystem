/**
 * 
 */
package com.example.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;
import com.example.DMS.Models.Trainer;



/**
 * @author Divya Chelikani 
 * 
 */
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
