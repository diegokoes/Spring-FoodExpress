package es.daw.foodexpressapi.dtos;


import lombok.Data;


//CREATE TABLE IF NOT EXISTS dishes
//        (
//                id
//                        BIGINT
//    AUTO_INCREMENT
//                        PRIMARY
//                        KEY,
//                name
//                        VARCHAR
//(
//                        100
//        ) NOT NULL,
//price DECIMAL
//        (
//    8,
//            2
//        ) NOT NULL,
//category VARCHAR
//        (
//    50
//        ),
//restaurant_id BIGINT NOT NULL,
//FOREIGN KEY
//        (
//                restaurant_id
//                ) REFERENCES restaurants
//(
//id
//)
//        )
@Data
public class DishDTO {

    private Long id;
    private String name;
    private Double price;
    private String category;
    private Long restaurantId;
}
