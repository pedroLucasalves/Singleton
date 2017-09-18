/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

import java.sql.Connection;

/**
 *
 * @author Pedro
 */
public class Conexao extends Teste.TesteConexao {

    private Connection Conexao;
    

    private static Conexao instancia = null;

    private Conexao() {
    }

    public static synchronized Conexao getInstance() {

        if (instancia == null) {
            instancia = new Conexao();
        }

        return instancia;

    }

    public void conectar() {
        System.out.println("conectei");
    }

    public void desconctar() {
        System.out.println("desconectei");
    }

}
