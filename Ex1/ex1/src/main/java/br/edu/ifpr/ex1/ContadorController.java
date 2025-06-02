package br.edu.ifpr.ex1;
//  EXERCICIO 4
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/contador")
public class ContadorController {

    private int totalAcessos = 0;

    @GetMapping
    public String contarAcessos(HttpServletRequest request) {
        totalAcessos++;
        return "Página acessada " + totalAcessos + " vezes.";
    }
}

