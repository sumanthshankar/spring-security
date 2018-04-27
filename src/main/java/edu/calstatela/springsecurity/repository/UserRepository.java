package edu.calstatela.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.calstatela.springsecurity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByemail(String useremail);
	
}
