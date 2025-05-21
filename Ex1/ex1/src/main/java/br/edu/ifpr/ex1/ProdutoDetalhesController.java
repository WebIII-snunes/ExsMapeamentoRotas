package br.edu.ifpr.ex1;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoDetalhesController {

    @GetMapping("/{id}")
    public String obterCampoProduto(
        @PathVariable String id,
        @RequestParam(required = false) String campo
    ) {
        // Simulação de produto fictício
        String nome = "Produto X";
        String preco = "R$ 99,90";
        String descricao = "Descrição do Produto X";

        if (campo == null) {
            return "Produto completo: " + nome + ", " + preco + ", " + descricao;
        }

        return switch (campo) {
            // exemplo http://localhost:8080/produtos/{id}?campo=preco
            case "nome" -> "Nome: " + nome;
            case "preco" -> "Preço: " + preco;
            case "descricao" -> "Descrição: " + descricao;
            default -> "Campo não reconhecido: " + campo;
        };
    }
}

