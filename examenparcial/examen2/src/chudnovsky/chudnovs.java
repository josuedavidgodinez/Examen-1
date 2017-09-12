package chudnovsky;

public interface chudnovs {

	/**
	 * @author Josue
	 * @param numero que deseamos calcular factorial
	 * @return factorial del numero n
	 */
public int factorial(int n );

/**
 * @author Josue
 * @param numero de sumas del algoritmo de chudnovsky que deseamos calcular
 * @return 
 */
public double calcularsuma(int k);
/**
 * @author Josue
 * @param digitos que deseamos obtener de pi
 * @return pi con el numero de digitos
 */
public double calcularpi(int digitos);

/**
 * @author Josue
 * @param un valor decimal y las cifras a las que deseamos redondear
 * @return decimal redondeado a n cifras
 */
public  double redondear(double valor, int cifras);
	}

