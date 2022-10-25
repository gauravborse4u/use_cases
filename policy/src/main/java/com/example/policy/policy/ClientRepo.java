package com.example.policy.policy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<ClientsEntity, Integer> {

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

	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=6;", nativeQuery = true)
	public List<ClientsEntity> id6();

	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=7;", nativeQuery = true)
	public List<ClientsEntity> id7();

	@Query(value = "select * from insurance join clients on insurance.pid = clients.pid where cid=8;", nativeQuery = true)
	public List<ClientsEntity> id8();

}
