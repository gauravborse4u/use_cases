package com.example.join.joinTables;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckRepo extends JpaRepository<TruckEntity, Integer> {

	@Query(value = "SELECT * FROM Truck t JOIN Car c ON t.tyres=c.tyres group by t.truckid;", nativeQuery = true)
	public List<TruckEntity> getjoin();

}