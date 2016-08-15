package com.mooo.ilsong02;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by swyang on 8/14/16.
 */
@RepositoryRestResource(collectionResourceRel="marketnews", path="marketnews")
public interface MarketNewsRepository extends MongoRepository<MarketNews, String>{

    List<MarketNews> findAll();
    @Query("{ 'event' : ?0 }")
    List<MarketNews> findByEvent(@Param("event") String event);

    @Query("{ 'event' : 'option' }")
    List<OptionNews> findOptionNews();

    @Query("{ 'event' : 'earning-beat' }")
    List<EarningBeat> findEarningBeat();






}
