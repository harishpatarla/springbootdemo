package com.harry;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by patharh on 12-11-2016.
 */
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
