package pl.haladyj.h2dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.haladyj.h2dbservice.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
