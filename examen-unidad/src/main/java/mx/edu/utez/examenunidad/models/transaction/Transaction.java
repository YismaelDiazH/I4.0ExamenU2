package mx.edu.utez.examenunidad.models.transaction;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.examenunidad.models.product.Product;
import mx.edu.utez.examenunidad.models.user.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Transaction {
//    ID de la transacción (entero, clave primaria)
//    ID del usuario (entero, clave foránea)
//    ID del producto (entero, clave foránea)
//    Fecha de compra (fecha)
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id")
    private Product product;

    @Column(name = "fecha_compra")
    private Date fechaCompra;

}
