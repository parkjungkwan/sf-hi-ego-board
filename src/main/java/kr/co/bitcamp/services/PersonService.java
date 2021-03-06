package kr.co.bitcamp.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import kr.co.bitcamp.domains.Person;
@Component
public interface PersonService {
	 public void save();
	 public void update();
	 public void findOne();
	 public List<Person> findAll();	
	 public void count();
	 public void delete();
	 public Person findByUseridAndPassword(Person person);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByAccessCodeIsNull();
	 public void findByGenerLike(String gender);
	 public void findByEmailOrderByNameAsc(String email);
}
