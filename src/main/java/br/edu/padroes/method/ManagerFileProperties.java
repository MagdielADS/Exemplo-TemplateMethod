/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.padroes.method;

import java.util.Map;

/**
 *
 * @author Magdiel Ildefonso
 */
public class ManagerFileProperties extends ManagerFileMethod{

    @Override
    String gerenciaConteudo(Map<String, String> texto) {
        String result = "";
        for (Map.Entry<String, String> entry : texto.entrySet()) {
            result += entry.getKey() + "=" + entry.getValue()+"\n";
        }
        return result;
    }
    
}
