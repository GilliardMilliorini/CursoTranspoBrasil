package br.com.cursojava.aula021;

public class Exercicio1 {

}

/*
 * java.lang.IllegalArgumentException
 *  indicar que um m�todo foi aprovado em um argumento ilegal ou inadequado.
 *   derivada de RuntimeException 
 *   extends RuntimeException
 * 
 * java.lang.IllegalStateException 
 * Sinaliza que um m�todo foi invocado em um hor�rio ilegal ou inadequado. Aplicativo Java n�o est� em um estado
 * apropriado para a opera��o solicitada. 
 * derivada de RuntimeException 
 * extends RuntimeException
 * 
 * java.lang.ArrayIndexOfBoundException
 *  Lan�ada para indicar que uma matriz foi
 * acessada com um �ndice ilegal. O �ndice � negativo ou maior que ou igual ao
 * tamanho da matriz. 
 * deriva de IndexOutOfBoundsException que deriva de RuntimeException 
 * extends IndexOutOfBoundsException
 * 
 * java.lang.NullPointerException 
 * extends RuntimeException
 *  * Lan�ada quando um aplicativo tenta usar nullem um caso em que um objeto � necess�rio. exemplo:
 * Chamando o m�todo de inst�ncia de um objeto null . Acessando ou modificando o
 * campo de um objeto null. Tomando o comprimento de null como se fosse uma
 * matriz. Acessando ou modificando os slots null como se fosse um array.
 * Jogando null como se fosse um valor de exce��o.
 * 
 * java.sql.SQLException 
 * extends Exception
 *  fornece informa��es sobre um erro de  acesso ao banco de dados ou outros erros relacionados ao banco.
 *  cada SQLException que ocorrer pode ter alguns tipos de informa��oes diferentes
 * como por exemplo: Usando string para descrever o erro : Isso � usado como a
 * mensagem Java Exception, dispon�vel por meio do m�todo getMesasge. Uma String
 * "SQLstate", que segue as conven��es SQLState XOPEN ou as SQL: 2003. os
 * valores s�o descritos na especifica��o apropriada o m�todo getSQLStateType �
 * usado para descobrir se o driver retorna o tipo XOPEN ou o tipo SQL: 2003.
 * 
 * java.io.IOException 
 * derivada de exception 
 * extends de exception 
 * Sinaliza que ocorreu uma exce��o de I/O de algum tipo. � a classe geral de exce��es
 * produzidas por opera��es de I/O com falha ou interrup��es.
 * 
 * 
 * 
 * java.io.FileNotFoudException 
 * extends IOException 
 * Sinaliza que uma tentativa de abrir o arquivo por um nome de caminho especificado falhou. Esta exce��o
 * ser� lan�ada pelos construtores FileInputStream, FileOutputStream, e
 * RandomAccessFile, quando um arquivo com o nome de caminho especificado n�o
 * existe. Ele tamb�m ser� lan�ado por esses construtores se o arquivo existir,
 * mas, por algum motivo, estiver inacess�vel, por exemplo, quando for feita uma
 * tentativa de abrir um arquivo somente leitura para grava��o.
 */
