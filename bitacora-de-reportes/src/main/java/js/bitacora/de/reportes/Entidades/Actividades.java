package js.bitacora.de.reportes.Entidades;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actividades")

public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @SuppressWarnings("null")
    @Column(name="nombre", nullable = false, length = 80)
    @NonNull
    private String nombre;


    @SuppressWarnings("null")
    @Column(name="descripcion", nullable = false, length = 80)
    @NonNull
    private String descripcion;



    

    
    


   
    
}
