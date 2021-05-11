package com.ddd.sample.demo.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.ddd.sample.domain.AudioqualityType;

public interface AudioqualityTypeRepository  extends CrudRepository <AudioqualityType, Integer>{
  
  @Query("select count(*) from order_item")
  int countAudioqualityType();

}
