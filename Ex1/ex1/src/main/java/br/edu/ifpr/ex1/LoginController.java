package br.edu.ifpr.ex1;
// EXERCICIO 5
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(@RequestParam(required = false) Boolean autenticacao) {
        if (Boolean.TRUE.equals(autenticacao)) {
            return "Login realizado com sucesso!";
        } else {
            return "redirect:/errologin?motivo=nao-autenticado";
        }
    }
    @GetMapping("/errologin")
    public String erroLogin(@RequestParam String motivo) {
        return "Erro de login: " + motivo;
    }
}
