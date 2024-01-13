package com.cloudhubs.trainticket.cancel.repository;

import com.cloudhubs.trainticket.cancel.entity.TrainFood;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TrainFoodRepository extends CrudRepository<TrainFood, String> {

    TrainFood findById(UUID id);

    @Override
    List<TrainFood> findAll();


    TrainFood findByTripId(String tripId);

    void deleteById(UUID id);
}
