package med.voll.api.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MedicoYaRegistradoException.class)
    public ResponseEntity<String> handleMedicoYaRegistradoException(MedicoYaRegistradoException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}