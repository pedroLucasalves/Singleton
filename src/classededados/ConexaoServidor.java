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
public class ConexaoServidor extends Teste.TesteConexao {

    private Connection conexaoServidor;
    

    private static ConexaoServidor instancia = null;

    private ConexaoServidor() {
    }

    public static synchronized ConexaoServidor getInstance() {

        if (instancia == null) {
            instancia = new ConexaoServidor();
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
