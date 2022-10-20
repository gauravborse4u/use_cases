package com.example.policy.policy;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends CrudRepository<ClientsEntity, Integer> {

	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=1;", nativeQuery = true)
	public List<ClientsEntity> id1();
	
	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=2;", nativeQuery = true)
	public List<ClientsEntity> id2();
	
	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=3;", nativeQuery = true)
	public List<ClientsEntity> id3();
	
	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=4;", nativeQuery = true)
	public List<ClientsEntity> id4();
	
	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=5;", nativeQuery = true)
	public List<ClientsEntity> id5();

}
