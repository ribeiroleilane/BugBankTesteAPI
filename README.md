# Projeto de Testes API - ViaCEP

Este projeto contém testes automatizados utilizando JUnit e RestAssured para validar o serviço de consulta de CEP fornecido pela API ViaCEP ([https://viacep.com.br/](https://viacep.com.br/)).

## Pré-requisitos

Antes de executar os testes, certifique-se de ter instalado as seguintes ferramentas:

1.  Java Development (JDK) - [https://www.oracle.com/java/technologies/javase-downloads.html](https://www.oracle.com/java/technologies/javase-downloads.html)
2.  Eclipse IDE (ou outra IDE de sua preferência) - [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/)

## Configuração

1.  Clone o repositório do projeto para o seu ambiente de desenvolvimento.
2.  Importe o projeto no Eclipse IDE ou na IDE de sua preferência.
3.  Certifique-se de ter o RestAssured configurado como dependência no arquivo pom.xml. Caso não tenha, adicione a seguinte dependência:

`<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>4.3.3</version>
    <scope>test</scope>
</dependency>` 

## Executando os Testes

Os testes automatizados estão implementados na classe `CepTestes`. Para executá-los, siga os passos abaixo:

1.  Abra a classe `CepTestes`.
2.  Clique com o botão direito na classe e selecione "Run As" -> "JUnit Test".

Os testes serão executados e você poderá ver os resultados no console do Eclipse.

## Descrição dos Testes

### Teste `testCepValido()`

Este teste verifica se o serviço da API ViaCEP retorna informações corretas para um CEP válido. Ele realiza uma requisição GET para o CEP "12237140" e verifica se o código de resposta é 200 (OK). Além disso, valida se o corpo da resposta contém a informação "Rua Professor Francisco Pereira da Silva".

### Teste `testCepInvalido()`

Este teste verifica se o serviço da API ViaCEP retorna a informação de erro para um CEP inválido. Ele realiza uma requisição GET para o CEP "00000000" e verifica se o código de resposta é 200 (OK). Em seguida, valida se o corpo da resposta contém a palavra "erro".

## Conclusão

Este projeto demonstra a realização de testes automatizados para o serviço de consulta de CEP da API ViaCEP utilizando JUnit e RestAssured. Ao executar os testes, você poderá verificar se o serviço está retornando as informações corretas para um CEP válido e tratando adequadamente um CEP inválido. 
