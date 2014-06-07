package utfpr.ct.dainf.if62c.exemplos;

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 * 
 * Classe genérica que calcula estatísticas de uma amostra de dados.
 * @param <T> O tipo dos elementos do vetor cujas estatísticas serão calculadas.
 */
public class Estatistica<T extends Number & Comparable<T>> {
    
    // o vetor de dados da amostra
    private T[] amostra;
    
    private static final String MSG_AMOSTRA_VAZIA = "Amostra nula ou vazia"; 

    /**
     * Construtor que não inicializa os dados da amostra.
     */
    public Estatistica() {
    }

    /**
     * Construtor que inicializa a amostra com um vetor.
     * @param amostra O vetor contendo os dados da amostra
     */
    public Estatistica(T[] amostra) {
        if (amostra == null || amostra.length == 0)
            throw new RuntimeException(MSG_AMOSTRA_VAZIA);
        this.amostra = amostra;
    }

    /**
     * Retorna o vetor de dados da amostra.
     * @return O vetor de dados da amostra
     */
    public T[] getAmostra() {
        return amostra;
    }

    /**
     * Inicializa o vetor de dados da amostra.
     * @param amostra O vetor de dados da amostra
     */
    public void setAmostra(T[] amostra) {
        if (amostra == null || amostra.length == 0)
            throw new RuntimeException(MSG_AMOSTRA_VAZIA);
        this.amostra = amostra;
    }

    /**
     * Retorna o menor valor da amostra
     * @return O menor valor da amostra
     */
    public T minimo() {
        T min = amostra[0];
        for (T x: amostra) {
            if (x.compareTo(min) < 0) min = x;
        }
        return min;
    }

    /**
     * Retorna o maior valor da amostra.
     * @return O maior valor da amostra
     */
    public T maximo() {
        T max = amostra[0];
        for (T x: amostra) {
            if (x.compareTo(max) > 0) max = x;
        }
        return max;
    }

    /**
     * Retorna a média dos valores da amostra.
     * @return A média dos valores da amostra
     */
    public double media() {
        double soma = 0;
        for (T x: amostra) {
            soma += x.doubleValue();
        }
        return soma / amostra.length;
    }

    /**
     * Retorna o desvio padrão dos valores da amostra.
     * @return O desvio padrão dos valores da amostra
     */
    public double desvioPadrao() {
        double m = media();
        double soma = 0;
        for (T x: amostra) {
            soma += Math.pow(x.doubleValue() - m, 2);
        }
        return Math.sqrt(soma / amostra.length);
    }
}
