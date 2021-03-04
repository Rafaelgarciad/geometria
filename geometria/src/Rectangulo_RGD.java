
/**
 * @author garri
 * Rafael Garcia Diaz
 * @version
 * 
 */
public class Rectangulo_RGD extends FiguraGeometrica_RGD {
	private double l1;
	private double l2;
	
	/**
	 * constructor de la clase.
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_RGD(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * calcula el area
	 * @return 11*12
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	
	/**
	 * calcula el perimetro
	 * @return (2*11) + (2 * 12)
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
