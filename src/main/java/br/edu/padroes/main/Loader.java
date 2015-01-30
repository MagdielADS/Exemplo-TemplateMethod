/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.padroes.main;

import br.edu.padroes.method.ManagerFileProperties;
import br.edu.padroes.method.ManagerFileXml;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Magdiel Ildefonso
 */
public class Loader {
    public static void main(String[] args) {
        ManagerFileXml manager = new ManagerFileXml();
        ManagerFileProperties manager2 = new ManagerFileProperties();
        Map<String, String> conteudo = new HashMap<String, String>();
        conteudo.put("nome", "Magdiel");
        conteudo.put("idade", "15");
        conteudo.put("profissao", "Lascado");
        manager.criaArquivo(conteudo, "teste.xml");
        manager2.criaArquivo(conteudo, "teste2.properties");
    }
}
