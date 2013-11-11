/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.soid.viviano.scriba.requisicoes;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author viviano
 */
public class Util {
    public Date formataData(String texto){
        String[] vetor = texto.split("/");
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(vetor[0]), Integer.parseInt(vetor[2]), Integer.parseInt(vetor[1]));
        return c.getTime();
    }
    
}
