package es.daw.foodexpressapi.repositories;

import es.daw.foodexpressapi.entities.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish,Long> {

}
