package es.daw.foodexpressapi.services;

import es.daw.foodexpressapi.dtos.DishDTO;
import es.daw.foodexpressapi.repositories.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DishService {

    private final DishRepository dishRepository;


    public List<DishDTO> getAll() {
        return dishRepository.findAll();
    }
}
