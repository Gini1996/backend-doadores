# Desafio do Banco de Sangue - Backend
## O Desafio
O desafio do Banco de Sangue consiste em desenvolver um sistema para importação de um arquivo JSON para cadastro dos possíveis doadores de sangue e a partir destes dados gerar alguns relatórios nas telas.


Para concluir o desafio, neste repositório se encontra o backend do projeto.

Os requisitos do desafio são:
   + Desenvolver uma tela de importação para o arquivo JSON.
   + Desenvolver um relatório que exiba quantos candidatos temos nessa lista em cada estado do Brasil.
   + Desenvolver um relatório que exiba o IMC médio em cada faixa de idade de dez em dez anos.
   + Desenvolver um relatório que exiba qual o percentual de obesos entre os homens e entre as mulheres.
   + Desenvolver um relatório que exiba qual a média de idade para cada tipo sanguíneo.

Como parte do desafio, desenvolvi APIs para cada um dos requisitos, estas que serão consumidas no desenvolvimento das telas no frontend.


## Pré Requisitos
> [!IMPORTANT]
> Para executar este projeto é necessário algumas configurações:
> + Possuir  o [JDK 17](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe) instalado.
> + É necessario possuir uma [IDE Java](https://spring.io/tools) de sua preferência. 
> + Ter um banco de dados [PostgreSQL](https://www.postgresql.org/download/) instalado em sua máquina e devidamente configurado no properties do projeto.

## JSON de Cadastro
Caso queira testar o cadastro de forma isolada, sem o repositório do frontend, via Postman é necessário seguir o padrão:
	{
		"nome": "string",
		"cpf": "string",
		"rg": "string",
		"data_nasc": "string",
		"sexo": "string",
		"mae": "string",
		"pai": "string",
		"email": "string",
		"cep": "string",
		"endereco": "string",
		"numero": integer,
		"bairro": "string",
		"cidade": "string",
		"estado": "string",
		"telefone_fixo": "string",
		"celular": "string",
		"altura": decimal,
		"peso": integer,
		"tipo_sanguineo": "string"
	}
