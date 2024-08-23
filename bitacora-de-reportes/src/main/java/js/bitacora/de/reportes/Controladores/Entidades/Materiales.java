package js.bitacora.de.reportes.Controladores.Entidades;

import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Materiales {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @SuppressWarnings("null")
    @Column(name="nombre", nullable = false, length = 80)
    @NonNull
    private String nombre;


    @SuppressWarnings("null")
    @Column(name="descripcion", nullable = false, length = 500)
    @NonNull
    private String descripcion;

    

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
