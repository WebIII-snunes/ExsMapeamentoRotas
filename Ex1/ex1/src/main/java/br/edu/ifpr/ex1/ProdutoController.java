// package br.edu.ifpr.ex1;

// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/produtos")
// public class ProdutoController {

//     @GetMapping
//     public String listarProdutos() {
//         return "Listando todos os produtos";
//     }

//     @GetMapping("/{id}")
//     public String obterProduto(@PathVariable String id) {
//         return "Listando produto com id: " + id;
//     }

//     @PostMapping
//     public String criarProduto(@RequestBody String dados) {
//         return "Criando produto com dados: " + dados;
//     }

//     @PutMapping("/{id}")
//     public String atualizarProduto(@PathVariable String id, @RequestBody String dados) {
//         return "Atualizando produto com id: " + id + " e dados: " + dados;
//     }

//     @DeleteMapping("/{id}")
//     public String excluirProduto(@PathVariable String id) {
//         return "Excluindo produto com id: " + id;
//     }
// }

