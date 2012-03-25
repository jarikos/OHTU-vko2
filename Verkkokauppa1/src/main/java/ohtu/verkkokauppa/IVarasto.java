/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.verkkokauppa;

/**
 *
 * @author JKosk2
 */
public interface IVarasto {

    Tuote haeTuote(int id);
    int saldo(int id);
    void otaVarastosta(Tuote t);
    void palautaVarastoon(Tuote t);
    void alustaTuotteet();
}
