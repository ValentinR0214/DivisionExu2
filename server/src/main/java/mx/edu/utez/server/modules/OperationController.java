package mx.edu.utez.server.modules;


import lombok.AllArgsConstructor;
import mx.edu.utez.server.modules.dto.NumsDTO;
import mx.edu.utez.server.utils.APIResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/operations")
@CrossOrigin(origins = {"*"})
public class OperationController {

    private final OperationService service;

    @PostMapping("/division")
    public ResponseEntity<APIResponse> doDivision(@RequestBody NumsDTO dto) {
        return service.doDivision(dto);
    }
}
