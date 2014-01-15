
import br.com.soid.viviano.scriba.entidades.Pessoa;
import br.com.soid.viviano.scriba.entidades.Secretario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viviano
 */
public class TesteManual {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        Secretario secretario = new Secretario();
        
        System.out.println(p.getClass());
        p = secretario;
        System.out.println(p.getClass());
    }
}
