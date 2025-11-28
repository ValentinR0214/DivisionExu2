package mx.edu.utez.server.modules;

import mx.edu.utez.server.modules.dto.NumsDTO;
import mx.edu.utez.server.utils.APIResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

    public ResponseEntity<APIResponse> doDivision(NumsDTO dto) {
        if(dto.getNum2() == 0){
            APIResponse errorBody = new APIResponse(
                    "Error al dividir entre cero",
                    null,
                    HttpStatus.BAD_REQUEST
            );

            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
        }

        double resultado = (double) dto.getNum1() / dto.getNum2();

        APIResponse body = new APIResponse(
                "Division realizada con exito",
                resultado,
                HttpStatus.OK
        );

        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
