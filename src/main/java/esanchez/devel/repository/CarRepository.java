package esanchez.devel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import esanchez.devel.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
