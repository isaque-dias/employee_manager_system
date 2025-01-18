# Sistema de Gerenciamento de Funcionários

Este é um sistema simples de gerenciamento de funcionários que permite cadastrar, listar e filtrar funcionários com base em critérios como salário e anos de experiência.

## Funcionalidades

- **Cadastrar Funcionário**: Adicione funcionários com informações como nome, endereço, email, telefone, idade, função, salário e anos de experiência.
- **Mostrar Funcionários**: Exibe todos os funcionários cadastrados em ordem alfabética.
- **Filtrar Funcionários**: Permite filtrar funcionários com base em:
  - Salário acima de um limite especificado.
  - Anos de experiência acima de um valor informado.
- **Fechar Sistema**: Encerra o sistema.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **LocalDate**: Para gerenciamento de datas (como a data de contratação).
- **Scanner**: Para entrada de dados do usuário.
- **Streams e Lambdas**: Para filtragem de funcionários com interfaces funcionais.

## Estrutura do Código

### Interfaces Funcionais

O sistema faz uso de **interfaces funcionais** do Java para realizar a ordenação e filtragem dos funcionários. As principais interfaces utilizadas são:

### 1. **Comparator** (para ordenação de funcionários)
O `Comparator` é utilizado para comparar dois funcionários com base em um critério específico, no nosso caso, o nome.

#### Como funciona:
A classe `NameComparator` implementa a interface `Comparator<Employee>` e define como comparar dois objetos `Employee` para ordená-los em ordem alfabética pelo nome.

### 2. **Predicate** (para filtragem de funcionários)
O Predicate é utilizado para filtrar os funcionários com base em condições como salário e anos de experiência.

#### Como funciona:
Na classe FilterEmployee, o Predicate é usado para criar condições de filtragem. O método salaryAbove filtra funcionários com um salário superior a um valor fornecido, enquanto o método experienceAbove filtra com base nos anos de experiência.

### Contribuições
Contribuições são bem-vindas! Se você tiver alguma sugestão ou correção, sinta-se à vontade para abrir um pull request.
