package es.daw.foodexpressapi.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

//CREATE TABLE IF NOT EXISTS orders
//        (
//                id
//                        BIGINT
//    AUTO_INCREMENT
//                        PRIMARY
//                        KEY,
//                order_date
//                        TIMESTAMP
//    NOT
//                        NULL,
//                status
//                        VARCHAR
//(
//                        30
//        ) NOT NULL,
//user_id BIGINT NOT NULL,
//restaurant_id BIGINT NOT NULL,
//FOREIGN KEY
//        (
//                user_id
//                ) REFERENCES users
//(
//id
//),
//FOREIGN KEY
//        (
//                restaurant_id
//                ) REFERENCES restaurants
//(
//id
//)
//        );
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Timestamp orderDate;

    private String status;

    private Long userId;

}
