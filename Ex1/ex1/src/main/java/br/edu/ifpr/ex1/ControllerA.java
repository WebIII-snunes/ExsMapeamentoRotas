package br.edu.ifpr.ex1;
// EXERCICIO 5
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/a")
public class ControllerA {

    @GetMapping("/inicio")
    public String redirecionarParaFim() {
        return "redirect:/b/fim";
    }
}