package br.com.cursojava.aula021;

public class Exercicio1 {

}

/*
 * java.lang.IllegalArgumentException
 *  indicar que um método foi aprovado em um argumento ilegal ou inadequado.
 *   derivada de RuntimeException 
 *   extends RuntimeException
 * 
 * java.lang.IllegalStateException 
 * Sinaliza que um método foi invocado em um horário ilegal ou inadequado. Aplicativo Java não está em um estado
 * apropriado para a operação solicitada. 
 * derivada de RuntimeException 
 * extends RuntimeException
 * 
 * java.lang.ArrayIndexOfBoundException
 *  Lançada para indicar que uma matriz foi
 * acessada com um índice ilegal. O índice é negativo ou maior que ou igual ao
 * tamanho da matriz. 
 * deriva de IndexOutOfBoundsException que deriva de RuntimeException 
 * extends IndexOutOfBoundsException
 * 
 * java.lang.NullPointerException 
 * extends RuntimeException
 *  * Lançada quando um aplicativo tenta usar nullem um caso em que um objeto é necessário. exemplo:
 * Chamando o método de instância de um objeto null . Acessando ou modificando o
 * campo de um objeto null. Tomando o comprimento de null como se fosse uma
 * matriz. Acessando ou modificando os slots null como se fosse um array.
 * Jogando null como se fosse um valor de exceção.
 * 
 * java.sql.SQLException 
 * extends Exception
 *  fornece informações sobre um erro de  acesso ao banco de dados ou outros erros relacionados ao banco.
 *  cada SQLException que ocorrer pode ter alguns tipos de informaçãoes diferentes
 * como por exemplo: Usando string para descrever o erro : Isso é usado como a
 * mensagem Java Exception, disponível por meio do método getMesasge. Uma String
 * "SQLstate", que segue as convenções SQLState XOPEN ou as SQL: 2003. os
 * valores são descritos na especificação apropriada o método getSQLStateType é
 * usado para descobrir se o driver retorna o tipo XOPEN ou o tipo SQL: 2003.
 * 
 * java.io.IOException 
 * derivada de exception 
 * extends de exception 
 * Sinaliza que ocorreu uma exceção de I/O de algum tipo. É a classe geral de exceções
 * produzidas por operações de I/O com falha ou interrupções.
 * 
 * 
 * 
 * java.io.FileNotFoudException 
 * extends IOException 
 * Sinaliza que uma tentativa de abrir o arquivo por um nome de caminho especificado falhou. Esta exceção
 * será lançada pelos construtores FileInputStream, FileOutputStream, e
 * RandomAccessFile, quando um arquivo com o nome de caminho especificado não
 * existe. Ele também será lançado por esses construtores se o arquivo existir,
 * mas, por algum motivo, estiver inacessível, por exemplo, quando for feita uma
 * tentativa de abrir um arquivo somente leitura para gravação.
 */
