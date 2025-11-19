package es.daw.foodexpressapi.repositories;


import es.daw.foodexpressapi.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

public interface RestaurantRepository extends JpaRepository<Restaurant, BigInteger> {


}
