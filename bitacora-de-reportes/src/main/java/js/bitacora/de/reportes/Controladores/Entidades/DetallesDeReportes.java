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

public class DetallesDeReportes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    
    @SuppressWarnings("null")
    @Column(name="reporte", nullable = false, length = 100)
    @NonNull
    private String reporte;


    @SuppressWarnings("null")
    @Column(name="actividad", nullable = false, length = 80)
    @NonNull
    private String  actividad;


    @SuppressWarnings("null")
    @Column(name="equipo", nullable = false, length = 500)
    @NonNull
    private String equipo;

    
    @SuppressWarnings("null")
    @Column(name="material", nullable = false, length = 100)
    @NonNull
    private String material;


    @SuppressWarnings("null")
    @Column(name="cantidad", nullable = false, length = 80)
    @NonNull
    private String  cantidad;


    @SuppressWarnings("null")
    @Column(name="hora_inicio", nullable = false, length = 500)
    @NonNull
    private String horaInicio;


    @SuppressWarnings("null")
    @Column(name="hora_fin", nullable = false, length = 500)
    @NonNull
    private String horaFin;






    

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
     * @return String return the reporte
     */
    public String getReporte() {
        return reporte;
    }

    /**
     * @param reporte the reporte to set
     */
    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    /**
     * @return String return the actividad
     */
    public String getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    /**
     * @return String return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return String return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return String return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return String return the horaInicio
     */
    public String getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return String return the horaFin
     */
    public String getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

}
