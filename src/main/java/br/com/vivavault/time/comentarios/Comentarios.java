/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vivavault.time.comentarios;

/**
 *
 * Classe voltada para adicionar comentários referente aos códigos, utilizada para sugestões de desenvolvimento ou possíveis dúvidas. Utilizando essa classe, 
 * iremos deixar o nosso código mais limpo para as implementações e podemos nos comunicar de uma forma mais clara.
 * Lembrando que os comentários nos códigos ainda podem ser incluídos, uma vez que facilita o nosso desenvolvimento, principalmente se um método não foi inteiramente implementado então
 * você poderá colocar o que falta para ser implementado, por exemplo.
 * 
 * GUIA DE CRIAÇÃO DE COMENTÁRIOS:
 * -- Número da Dúvida (Seguir o padrão)
 * -- Autor(a)
 * -- Dúvida ou Sugestão
 * -- Código a ser analisado
 * -- Classe a qual o código pertence
 */
public class Comentarios {
      
    /*
    1 -
    Autora: Ariadne Cavilha Jorge
    
    Sugestão: Podemos implementar uma classe que verifica qual tipo de movimentação que é e realiza essas movimentações, instanciando a classe Estoque uma única vez,
    para não perder os registros que foram adicionados ou removidos, porém temos que ver como implementar essa classe, tal como supracitado acima.
    
    Classe: MovimentacaoEstoque
    
    Código: 
    public void adicionaMovimentacao(EnumTipoMovimentacao tipoMovimentacao, Produto produto, ItemEstoque itemEstoque, Long quantidade) {
        Estoque estoque = new Estoque();
        
        if(tipoMovimentacao == EnumTipoMovimentacao.ENTRADA) {
            movimentarEntrada(produto, itemEstoque, quantidade, estoque);
        } 
        else {
            //movimentarSaida
        }
    }
    
    2 -
    Autora: Ariadne Cavilha Jorge
    
    Sugestão: Gostei muito da ideia de fazer uma classe apenas para a movimentação de produtos porém ela ocasiona alguns erros em relação ao estoque do produto, uma vez que se eu realizar duas movimentações eu irei criar duas instâncias de estoque
    Poderiamos utilizar uma instância de movimentação estoque para realizar diversas movimentações mas acredito que isso saia um pouco do foco do que é a MovimentacaoEstoquea e também pode ocasionar erros, uma vez que teria o mesmo ItemEstoque para
    diversos produtos que eu iria criar. Podemos pensar em uma maneira mais fácil e objetiva de criar essa classe, ou podemos utilizar apenas a classe Estoque, tal como exemplificado no Main do projeto.
    
    Classe: MovimentacaoEstoque
    
    Código:
    public MovimentacaoEstoque(ItemEstoque item, Funcionario funcionario, Papel alcada, LocalDate dataMovimentacao, EnumTipoMovimentacao tipoMovimentacao, Long quantidade) {
        this.id = UUID.randomUUID();
        this.item = item;
        this.funcionario = funcionario;
        this.alcada = alcada;
        this.dataMovimentacao = dataMovimentacao;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
    }
    */
    
}