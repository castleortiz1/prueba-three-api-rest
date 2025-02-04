package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DireccionMedicos {

        private String calle;
        private String numero;
        private String complemento;
        private String distrito;
        private String ciudad;

        public DireccionMedicos(DatosDireccionMedicos direccion) {
            this.calle = direccion.calle();
            this.numero = direccion.numero();
            this.distrito = direccion.distrito();
            this.complemento = direccion.complemento();
            this.ciudad = direccion.ciudad();
        }
}
