package br.edu.ifpr.ex1;
// EXERCICIO 2
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/produtos")
public class ProdutoBuscaController {
    //exemplo /produtos/search?nome=produtoX&categoria=eletrônicos
    @GetMapping("/search")
    public String buscarProdutos(
        @RequestParam(required = false) String nome,
        @RequestParam(required = false) String categoria,
        @RequestParam(required = false) String marca
    ) {
        return "Buscando produtos com: nome=" + nome +
               ", categoria=" + categoria +
               ", marca=" + marca;
    }
}