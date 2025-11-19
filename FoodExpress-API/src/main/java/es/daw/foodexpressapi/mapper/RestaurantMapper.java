package es.daw.foodexpressapi.mapper;

import es.daw.foodexpressapi.dtos.RestaurantDTO;
import es.daw.foodexpressapi.entities.Restaurant;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {


    Restaurant toEntity(RestaurantDTO restaurantDTO);
    RestaurantDTO toDTO(Restaurant restaurant);
    List<Restaurant> toEntityList(List<RestaurantDTO> restaurantDTOList);
    List<RestaurantDTO> toDTOList(List<Restaurant> restaurantList);


}