package med.voll.api.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccionMedicos(
        @NotBlank
        String calle,
        @NotBlank
        String numero,
        String complemento,
        @NotBlank
        String distrito,
        @NotBlank
        String ciudad
) {

}
