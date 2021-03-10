package esanchez.devel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import esanchez.devel.entity.Car;
import esanchez.devel.entity.Person;
import esanchez.devel.repository.CarRepository;

@RestController
public class ApiController {

	@Autowired
	private CarRepository carRepository;
	
	/*
	 * insert in database two cars and one person
	 * the person is saved automatically calling to 
	 * carRepository.save because they have a relation
	 * oneToMany and ManyToOne
	 * 
	 * Important!!! in this cases the order matters, because
	 * if we save the person with the personRepository.save, then
	 * the cars are inserted with person_id=null because the person is
	 * still not saved in database.
	 */
	@PostMapping("/oneToMany")
	public ResponseEntity<?> save(Model model) {
		
		Person person = new Person();
		person.setName("persona1");

		Car car = new Car();
		car.setBrand("Renault");
		car.setModel("Laguna");
		car.setPerson(person);
		
		carRepository.save(car);
		
		car = new Car();
		car.setBrand("Ford");
		car.setModel("Fiesta");
		car.setPerson(person);
		
		carRepository.save(car);
		
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
