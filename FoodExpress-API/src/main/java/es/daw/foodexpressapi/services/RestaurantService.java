package es.daw.foodexpressapi.services;

import es.daw.foodexpressapi.dtos.RestaurantDTO;
import es.daw.foodexpressapi.repositories.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;


    public List<RestaurantDTO> findAll() {

        return restaurantRepository.findAll();
    }
}
