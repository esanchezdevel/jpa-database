package esanchez.devel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import esanchez.devel.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
