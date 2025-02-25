# Criptografia Segura para Login

## Visão Geral
Estamos desenvolvendo um novo método de criptografia em Java para aumentar a segurança no processo de login. O sistema gera uma senha criptografada baseada em dados pessoais do usuário, como CPF, RG, data de nascimento e nome.

## Estrutura da Matriz
A criptografia utiliza uma matriz de 4x4 onde cada linha representa uma informação do usuário:

1. **Linha 1**: Números do CPF divididos em quatro partes (exemplo: `222, 123, 123, 22`)
2. **Linha 2**: Números do RG no mesmo formato (exemplo: `99, 999, 9999, 99`)
3. **Linha 3**: Data de nascimento (exemplo: `20, 10, 19, 88`)
4. **Linha 4**: Representação numérica das letras do nome (exemplo: Rafael = `18, 1, 6, 1`)

## Operações de Criptografia
O usuário pode escolher uma operação matemática e uma direção (horizontal ou vertical) para gerar a senha.

### Exemplo de Operações:
- **Soma + Vertical**: Soma todos os valores das colunas e multiplica os resultados.
- **Subtração + Horizontal**: Subtrai os valores dentro de cada linha e multiplica os resultados das linhas.

## Como Usar
1. O usuário insere seus dados (CPF, RG, data de nascimento e nome).
2. O sistema gera a matriz 4x4 automaticamente.
3. O usuário escolhe uma operação e direção.
4. O sistema calcula a senha criptografada.

## Tecnologias Utilizadas
- **Java** para desenvolvimento principal
- **Java Swing** (opcional) para interface gráfica
- **JUnit** para testes automatizados
