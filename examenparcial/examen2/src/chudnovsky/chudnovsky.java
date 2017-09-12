package chudnovsky;

public class chudnovsky implements chudnovs {
public int factorial(int n ) {
		
		if(n==0) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}


	

public double calcularsuma(int k) {
	if(k==0) {
		
		return 13591409;
	}else {
		return calcularsuma(k-1)+ (factorial(6*k)*(545140134*k+13591409))/(factorial(3*k)*Math.pow(factorial(k), 3)*Math.pow(-262537412640768000L, k));
	}
	
}
public double calcularpi(int digitos) {
	int k;
	if(digitos%14==0) {
		
		k=digitos/14;
		return redondear((426880*Math.sqrt(10005))/calcularsuma(k),digitos);
	}else {
		k=(digitos/14)+1;
		return redondear((426880*Math.sqrt(10005))/calcularsuma(k),digitos);
	}
	
}
public  double redondear(double valor, int cifras) {
    if (cifras < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, cifras);
    valor = valor * factor;
    long tmp = Math.round(valor);
    return (double) tmp / factor;
}


}
