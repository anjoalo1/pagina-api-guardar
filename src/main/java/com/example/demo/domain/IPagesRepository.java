package com.example.demo.domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface IPagesRepository extends MongoRepository<Pages, String> {
	
	 @Query("{'seccion': ?0}")
	    List<Pages> findBySeccion(String seccion);

}
