package es.daw.foodexpressapi.dtos;

import jakarta.validation.Valid;
import lombok.Data;

//
//CREATE TABLE IF NOT EXISTS restaurants
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
//address VARCHAR
//        (
//    150
//        ),
//phone VARCHAR
//        (
//    20
//        )
//    );


@Data
@Valid
public class RestaurantDTO {

    private Long id;
    private String name;
    private String address;
    private String phone;

}

