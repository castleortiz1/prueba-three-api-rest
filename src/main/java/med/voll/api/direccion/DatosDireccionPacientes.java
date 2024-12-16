package med.voll.api.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccionPacientes(
        @NotBlank
        String urbanizacion,
        @NotBlank
        String calle,
        @NotBlank
        String distrito,
        @NotBlank
        String ciudad,
        @NotBlank
        String numero,
        @NotBlank
        String complemento,
        @NotBlank
        String codigoPostal,
        @NotBlank
        String provincia) {
}
