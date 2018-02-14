# Brackets

Verifica se a ordem dos parênteses, colchetes e chaves de uma String recebida é válida.
A ordem é considerada válida se segue as seguintes condições:
* Não contém parênteses, colchetes e chaves sem par;
* O conjunto de caracteres aninhados em um par tem também correspondência de um par.

Exemplos:
* `(){}[]` é válido
* `[{()}](){}` é válido
* `[]{()` é inválido
* `[{)]` é inválido

## Requisitos

* Java 8;
* Maven 3.

## Como executar

Gerar o arquivo .jar executável
``` bash
mvn clean package
``` 

Executar o arquivo .jar, informando um conjunto de caracteres

``` bash
java -jar br.com.tpa.brackets (){}[]
``` 
Exemplos de saída:
``` bash
Ordem válida! []{}()
Ordem inválida! []{()
``` 
