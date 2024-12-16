package med.voll.api.direccion;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DireccionPacientes {

    private String calle;
    private String numero;
    private String complemento;
    private String distrito;
    private String ciudad;
    private String urbanizacion; // Asegúrate de que este campo esté presente
    @Column(name = "codigoPostal")
    private String codigoPostal;
    private String provincia;

    public DireccionPacientes(DatosDireccionPacientes direccion) {
        this.calle = direccion.calle();
        this.numero = direccion.numero();
        this.distrito = direccion.distrito();
        this.complemento = direccion.complemento();
        this.ciudad = direccion.ciudad();
        this.urbanizacion = direccion.urbanizacion();
        this.codigoPostal = direccion.codigoPostal();
        this.provincia = direccion.provincia();
    }
}
