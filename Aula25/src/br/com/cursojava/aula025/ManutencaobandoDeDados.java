package br.com.cursojava.aula025;
public class ManutencaobandoDeDados {

}
//create database "nome da tabela"; - para criar um data base
//-------
//
//create table nome_tabela(
//nome_da_coluna 	tipo_de_dado 	restri��es,
//nome_da_coluna 	tipo_de_dado 	restri��es,
//nome_da_coluna 	tipo_de_dado 	restri��es
//
//);
//
//Comando para criar tabela dentro da database.
//
//exemplo:
//
//create table pessoas(
//id integer not null,
//nome varchar(100) not null,
//apelido varchar(50)  -- aqui n�o tem nada de restri��o pois ela serve para informar se o campo � obrigatorio ou nao.
//    
//);
//
//---------
//
//
//drop table "NOME DA TABELA";			 para excluir a tabela.
//ex:
//drop table pessoas;
//
//-----
//
//alter table "NOME DA TABELA" 
//add column "NOME DA COLULA" "TIPO DA COLULA";
//
//ex:
//
//alter table pessoas
//add column idade integer;
//
//						para adicionar uma coluna na tabela ap�s criada.
//
//-------
//
//
//alter table "NOME DA TABELA"
//rename column "NOME DA COLUNA errado" to "NOME DA COLUNA correto";
//
//ex:
//
//alter table pessoas 
//alter column idade to idades;
//
//						para alterar o nome da coluna da tabela
//
//--------
//
//alter table pessoa
//rename to raparigas				para alterar o nome da tabela		
//
//
//alter table "NOME DA TABELA"
//alter column "NOME DA COLUNA"type Tipo de informa��o;
//
//ex:
//
//alter table pessoas 
//alter column idades type varchar(3);
//						altera o tipo da coluna
//
//
//-------------
//								
//
//alter table pessoas 
//alter column idades type integer USING (idades::integer);
//
//						mudar o tipo da tabela de varchar para integer
//
//----------------
//alter table "NOME DA TABELA" 
//drop column 'NOME DA COLUNA";
//
//ex:
//
//alter table pessoas 
//drop column idades;
//						excluir uma coluna especifica
//
//-----------------
//create table "nomeComposto"(
//id integer not null
//);
// ex:
//
//create table "pessoaJuridica"(
//id integer not null
//
//);						Criar uma tabela com nome composto necessita de aspas " "
//
//
//----------------
//
//
//insert into pessoas (id,nome, apelido)
//values
//(1, 'Jo�o da Silva','maninho'),
//(2,'maria da Silva', 'maninha');
//						Inserindo  manualmente valores na tabela pessoas
//
//
//---------------------------
//
//
//Select * from "NOME DA TABELA"			traz todas as informa��es da tabela
//
//---------------------
//
//Select nome,apelido from pessoas		traz as informa��es da coluna nome e apelido da tabela.
//
//----------------------------
//
//select nome,apelido from pessoas where id = 2; 		traz as informa��es da coluna nome e apelido filtrando com o where alguma informa��o especifica.
//
//---------------------
//
//
//update NOME DA TABELA
//set CAMPO DA TABELA = 'maninha'
//where id = 4
//
//							altera o valor um campo por outro informado
//
//
//----------------
//
//
//update NOME DA TABELA
//set 	apelido = 'maninha',
//	nome = 'Eva Oliveira'
//where id = 4
//
//							altera o valor de 2 ou mais campos de uma tabela.
//
//---------------------
//
//delete from pessoas
//where id = 1
//
//							deleta todos os valores setados no campo informado
//
//------------------
//
//delete from pessoas
//							deleta todas as informa��es da tabela
//
//--------------
// 
