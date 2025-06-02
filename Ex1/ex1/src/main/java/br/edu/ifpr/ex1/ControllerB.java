package br.edu.ifpr.ex1;
// EXERCICIO 5
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/b")
public class ControllerB {

    @GetMapping("/fim")
    public String fim() {
        return "Você chegou ao fim (Controller B)";
    }
    
}
