package med.voll.api.domain.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {
    private String calle;
    private String numero;
    private String distrito;
    private String ciudad;
    private String complemento;

    public Direccion(DatosDireccion datosDireccion){
        this.calle= datosDireccion.calle();
        this.numero= datosDireccion.numero();
        this.distrito= datosDireccion.distrito();
        this.ciudad= datosDireccion.ciudad();
        this.complemento= datosDireccion.complemento();

    }

    public Direccion actualizarDatos(DatosDireccion datosDireccion) {
        this.calle= datosDireccion.calle();
        this.numero= datosDireccion.numero();
        this.distrito= datosDireccion.distrito();
        this.ciudad= datosDireccion.ciudad();
        this.complemento= datosDireccion.complemento();
        return this;
    }
}
