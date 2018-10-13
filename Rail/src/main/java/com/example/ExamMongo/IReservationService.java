package com.example.ExamMongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

//MongoRepository interface
public interface IReservationService extends MongoRepository<RailwayReservation,String> {

	List<RailwayReservation> getByPnrno(String pnrno);

}

