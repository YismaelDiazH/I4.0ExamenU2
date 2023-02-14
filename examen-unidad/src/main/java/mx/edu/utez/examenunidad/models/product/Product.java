package mx.edu.utez.examenunidad.models.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.examenunidad.models.user.User;

import javax.persistence.*;

@Entity
@Table(name = "products")

@NoArgsConstructor
@Getter
@Setter
public class Product {
//    ID del producto (entero, clave primaria)
//    Nombre del producto (texto)
//    Categoría del producto (texto)
//    Precio del producto (decimal)
//    Disponibilidad (booleano)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String product_name;
    @Column
    private String category;
    @Column
    private Double price;
    @Column
    private Boolean disponibility;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;



}
