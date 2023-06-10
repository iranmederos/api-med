package med.voll.api.domain.direccion;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public record DatosDireccionPaciente(
        @NotBlank
        String urbanizacion,
        @NotBlank
        String distrito,
        @NotBlank
        String ciudad,
        @NotBlank
        String numero,
        @NotBlank
        String complemento,
        @NotBlank
        String provincia,
        @NotBlank
        String codigo_postal
) {
}
