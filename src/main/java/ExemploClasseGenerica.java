
import utfpr.ct.dainf.if62c.exemplos.Estatistica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class ExemploClasseGenerica {

    public static void main(String[] args) {
        Integer[] amostra = new Integer[200];
        for (Integer i = 0; i < amostra.length; i++) {
            amostra[i] = i < 100 ? 8 : 12;
        }
        Estatistica<Integer> e = new Estatistica<>(amostra);
        System.out.println("Mínimo = " + e.minimo());
        System.out.println("Máximo = " + e.maximo());
        System.out.println("Média = " + e.media());
        System.out.println("Desvio padrão = " + e.desvioPadrao());
    }
}
