DESAFIO JAVA Samuel Ramos- Estoque

Desafio:

Criar um estoque de produtos em Java usando polimorfismo, herança e obrigatoriamente utilizando a classe ArrayList do pacote java.util.

Descrição do Desafio: Neste desafio, você deve criar um sistema para gerenciar um estoque de produtos em uma loja.
O estoque deve ser capaz de armazenar diferentes tipos de produtos,
como por exemplo, produtos eletrônicos, roupas, alimentos, etc.
Cada tipo de produto deve herdar características comuns da classe Produto,
que inclui atributos como nome, código, preço e quantidade em estoque.

O sistema deve ser capaz de realizar as seguintes operações:


1) Adicionar produtos ao estoque: O sistema deve permitir a adição de novos produtos ao estoque, seja eletrônico,
roupa, alimento, ou qualquer outro tipo de produto suportado.

2) Listar produtos em estoque: O sistema deve ser capaz de exibir a lista de todos os produtos presentes no estoque,
mostrando os detalhes de cada produto, como nome, código, preço e quantidade em estoque.

3) Atualizar quantidade de produtos em estoque: O sistema deve permitir a atualização da quantidade de produtos em estoque,
seja para adicionar ou remover unidades.

4) Buscar produtos por código: O sistema deve permitir a busca de um produto pelo seu código,
exibindo os detalhes do produto caso seja encontrado.

5) Remover produtos do estoque: O sistema deve permitir a remoção de produtos do estoque.

Requisitos:

1. O projeto deve usar polimorfismo para lidar com diferentes tipos de produtos de forma genérica,
permitindo que novos tipos de produtos possam ser facilmente adicionados ao sistema.

2. O projeto deve usar herança para criar uma hierarquia de classes,
com a classe Produto sendo a superclasse e as classes dos diferentes tipos de produtos sendo subclasses.

3. O projeto deve usar a classe ArrayList do pacote java.util para armazenar os produtos em estoque,
permitindo o uso dinâmico da lista de produtos.

4. O código deve ser bem organizado, com boas práticas de programação e comentários adequados para facilitar a compreensão.

Desenvolva o sistema de estoque de produtos seguindo os requisitos acima e testando todas as funcionalidades
para garantir o correto funcionamento. O uso de outras classes da java.util além do ArrayList
é permitido e encorajado para melhorar a funcionalidade e eficiência do sistema.