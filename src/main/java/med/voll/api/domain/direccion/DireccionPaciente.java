package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DireccionPaciente {
    private String urbanizacion;
    private String numero;
    private String distrito;
    private String ciudad;
    private String complemento;
    private String provincia;
    private String codigo_postal;

    public DireccionPaciente(DatosDireccionPaciente direccionPaciente){
        this.ciudad= direccionPaciente.ciudad();
        this.numero= direccionPaciente.numero();
        this.urbanizacion= direccionPaciente.urbanizacion();
        this.complemento= direccionPaciente.complemento();
        this.provincia= direccionPaciente.provincia();
        this.codigo_postal= direccionPaciente.codigo_postal();
        this.distrito= direccionPaciente.distrito();
    }
}
