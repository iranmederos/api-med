package med.voll.api.domain.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.direccion.Direccion;
@Table(name = "Medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;
    private boolean activo;

    public Medico(DatosRegistroMedico datosRegistroMedico){
        this.activo=true;
        this.nombre= datosRegistroMedico.nombre();
        this.email= datosRegistroMedico.email();
        this.telefono= datosRegistroMedico.telefono();
        this.documento= datosRegistroMedico.documento();
        this.especialidad= datosRegistroMedico.especialidad();
        this.direccion= new Direccion(datosRegistroMedico.direccion());
    }

    public void actualizarDatos(DatosActualizarMedico datosActualizarMedico) {
        if(datosActualizarMedico.nombre() != null){
            this.nombre= datosActualizarMedico.nombre();
        }
        if (datosActualizarMedico.email() != null){
            this.email= datosActualizarMedico.email();
        }
        if(datosActualizarMedico.direccion() != null){
            this.direccion= direccion.actualizarDatos(datosActualizarMedico.direccion());
        }
    }

    public void desactivarMedico() {
        this.activo=false;
    }
}

