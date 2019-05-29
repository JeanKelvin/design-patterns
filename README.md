**Strategy**

Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação.
O Strategy nos oferece uma maneira flexível para escrever diversos algoritmos diferentes, e de passar esses algoritmos para classes clientes que precisam deles. Esses clientes desconhecem qual é o algoritmo "real" que está sendo executado, e apenas mandam o algoritmo rodar. Isso faz com que o código da classe cliente fique bastante desacoplado das implementações concretas de algoritmos, possibilitando assim com que esse cliente consiga trabalhar com N diferentes algoritmos sem precisar alterar o seu código.


**Chain of Responsibility**

Quando temos uma lista de comandos a serem executados de acordo com algum cenário em específico, e sabemos também qual o próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.
Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar esses comportamentos novamente.


**Template Method**

Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução. Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos", que serão implementados de maneira diferente por cada uma das implementações específicas.
Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.


**Decorator**

Quando temos comportamentos que podem ser compostos por comportamentos de outras classes envolvidas em uma mesma hierarquia. 
O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher no momento da instanciação, quais instancias serão utilizadas para realizar o trabalho.
 
 
**State**
 
A necessidade de implementação de uma máquina de estados. Geralmente, o controle das possíveis transições são vários e complexos, fazendo com que a implementação não seja simples. O State auxilia a manter o controle dos estados simples e organizados através da criação de classes que representem cada estado e saiba controlar as transições.
 
 
**Builder**
 
Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos, ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.
Além de centralizar o código de criação e facilitar a manutenção, ainda facilitamos a vida das classes que precisam criar essa classe complexa, afinal a interface do Builder tende a ser mais clara e fácil de ser usada.
 
 
**Observer**
 
Quando o acoplamento da nossa classe está crescendo, ou quando temos diversas ações diferentes a serem executadas após um determinado processo, podemos implementar o Observer.
Ele permite que diversas ações sejam executadas de forma transparente à classe principal, reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.


**Factory**

Quando temos que isolar o processo de criação de um objeto em um único lugar.


**Flyweight**

Flyweight serve para quando temos muitas instâncias do mesmo objeto andando pelo sistema, e precisamos economizar.
A própria JVM faz uso de um Flyweight internamente. Quando você declara um "int", e repete o mesmo valor de "int" em vários lugares, ela sempre devolve a mesma instância desse número. É um bom exemplo de implementação do padrão.


**Memento**

Captura e externaliza o estado interno de um objeto, sem violar o encapsulamento, permitindo que o objeto consiga ser restaurado a esse estado futuramente.
Um possível problema é a quantidade de memória que ele pode ocupar, afinal estamos guardando muitas instâncias de objetos que podem ser pesados.
Nada impede você também de limitar a quantidade máxima de objetos no histórico que será armazenado.


**Interpreter**

Quando temos expressões que devem ser avaliadas, e a transformamos em uma estrutura de dados, e depois fazemos com que a própria árvore se avalie, damos o nome de Interpreter.
O padrão é bastante útil quando temos que implementar interpretadores para DSLs(https://pt.wikipedia.org/wiki/Linguagem_de_dom%C3%ADnio_espec%C3%ADfico).


**Visitor**

Representa uma operação a ser realizada sobre elementos da estrutura de um objeto, sendo permitida a criação de uma nova operação sem que mude a classe dos elementos sobre as quais é operado.
Quando temos uma árvore, e precisamos navegar nessa árvore de maneira organizada, podemos usar um Visitor.


**Bridge**

Bridge é uma ponte em dois sistemas, uma ponte para a implementação concreta.

**Adapter**

Quando temos um conjunto de classes legadas, que achamos que seu uso vai sujar o novo sistema, criamos um "adaptador" que facilita sua utilização.


**Command**

Usamos ele quando temos que separar os comandos que serão executados do objeto que ele pertence.

**Singleton**

Uma classe que tenha apenas uma instância na aplicação. Abaixo, mostra alguns aspectos que devem serem cuidados ao criar esse padrão.

- O construtor da classe fica como privado (private), sendo que não pode ser instanciada para fora da própria classe.
- A classe é final, pois não permite a criação de subclasses da própria classe.
- O acesso é permitido através do método que retorna a instância única da classe, ou faz a criação de uma, caso não tenha sido criada.

**Facade**

O Padrão de Projeto Facade oculta toda a complexidade de uma ou mais classes através de uma Facade (Fachada). A intenção desse Padrão de Projeto é simplificar uma interface. 
