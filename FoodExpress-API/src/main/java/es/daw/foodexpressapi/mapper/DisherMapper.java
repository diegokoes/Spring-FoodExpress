package es.daw.foodexpressapi.mapper;


import es.daw.foodexpressapi.dtos.DishDTO;
import es.daw.foodexpressapi.entities.Dish;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DisherMapper {
    Dish toEntity(DishDTO dishDTO);
    DishDTO toDTO(Dish dish);
    List<Dish> toEntityList(List<DishDTO> dishDTOList);
    List<DishDTO> toDTOList(List<Dish> dishList);

}
