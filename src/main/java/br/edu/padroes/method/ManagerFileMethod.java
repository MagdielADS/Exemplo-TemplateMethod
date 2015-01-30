/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.padroes.method;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Magdiel Ildefonso
 */
public abstract class ManagerFileMethod {
    public void criaArquivo(Map<String, String> texto, String name){
        FileWriter arq = null;
        try {
            arq = new FileWriter(name);
            PrintWriter gravarArq = new PrintWriter(arq);
            String conteudo = gerenciaConteudo(texto);
            gravarArq.printf(conteudo);
        } catch (IOException ex) {
            Logger.getLogger(ManagerFileMethod.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(ManagerFileMethod.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
    abstract String gerenciaConteudo(Map<String, String> texto);  
}
