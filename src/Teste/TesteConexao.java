/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import classededados.Conexao;

/**
 *
 * @author Pedro
 */
public class TesteConexao {

    public static void main(String[] args) {
        Conexao.getInstance().conectar();
        
        Conexao.getInstance().desconctar();
    }
}
