package mx.edu.utez.examenunidad.models.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.examenunidad.models.product.Product;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
//ID del usuario (entero, clave primaria)
//        Nombre completo (texto)
//        Correo electrónico (texto)
//        Contraseña (texto)
//        Lista de deseos (texto)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long name;
    @Column()
    private String user_name;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String wishList;
//    @OneToMany(mappedBy = "user")
//    @JsonIgnore
//    private List<Product> products;
}
