import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sn = new Scanner(System.in);

		String formas;
		String tipo;

		String cuad = "cuadrado";
		String tria = "triangulo";
		String circ = "circulo";

		System.out.println("introduzca la forma geometrica circulo, cuadrado o triangulo");
		formas = sn.nextLine();
		System.out.println("introduzca area o perimetro");
		tipo = sn.nextLine();


		if (formas.equals(circ)) {
			if (tipo.equals("area")) {
				double radio = 0;
				double areacirculo = 0;
				System.out.println("introduca radio");
				radio = sn.nextDouble();
				areacirculo = HallarAreaCirculo(radio);
				System.out.println("el area del circulo es "+areacirculo);				
			}else if (tipo.equals("perimetro")) {
				double radio = 0;
				double perimetrocirculo = 0;
				System.out.println("introduca radio");
				radio = sn.nextDouble();
				perimetrocirculo = HallarPerimetroCirculo(radio);
				System.out.println("el perimetro del circulo es "+perimetrocirculo);							
			}
		} else {
			if (formas.equals(cuad)) {
				if (tipo.equals("area")) {
					double lado = 0;
					double areacuadrado = 0;
					System.out.println("introduzca lado");
					lado = sn.nextDouble();
					areacuadrado = HallarAreaCuadrado(lado);
					System.out.println("el area del cuadrado es "+areacuadrado);					
				}else if (tipo.equals("perimetro")) {
					double lado = 0;
					double perimetrocuadrado = 0;
					System.out.println("introduzca lado");
					lado = sn.nextDouble();
					perimetrocuadrado = HallarPerimetroCuadrado(lado);
					System.out.println("el perimetro del cuadrado es "+perimetrocuadrado);					
				}
			} else {

				if (formas.equals(tria)) {
					if (tipo.equals("area")) {
						double base = 0;
						double altura = 0;
						double areatriangulo = 0;
						System.out.println("introduzca base");
						base = sn.nextDouble();
						System.out.println("introduzca altura");
						altura = sn.nextDouble();
						areatriangulo = HallarAreaTriangulo(base, altura);
						System.out.println("el area del triangulo es "+areatriangulo);
					}else if (tipo.equals("perimetro")) {
						double base = 0;
						double altura = 0;
						double perimetrotriangulo = 0;
						System.out.println("introduzca base");
						base = sn.nextDouble();
						perimetrotriangulo = HallarPerimetroTriangulo(base);
						System.out.println("el perimetro del triangulo es "+perimetrotriangulo);						
					}
				}
			}
		}

	}
	
	public static double HallarAreaCirculo(double radio) {

		double areacirculo = 0;

		areacirculo = Math.PI * Math.pow(radio, 2);
		return areacirculo;
	}
	public static double HallarAreaCuadrado(double lado) {

		double areacuadrado = 0;

		areacuadrado = lado * lado;
		return areacuadrado;
	}

	public static double HallarAreaTriangulo(double base, double altura) {

		double areatriangulo = 0;

		areatriangulo = (base * altura) / 2;
		return areatriangulo;

	}
	public static double HallarPerimetroCirculo(double radio) {

		double perimetrocirculo = 0;

		perimetrocirculo = 2 * Math.PI * radio;
		return perimetrocirculo;
	}
	public static double HallarPerimetroCuadrado(double lado) {

		double perimetrocuadrado = 0;

		perimetrocuadrado = 4 * lado;
		return perimetrocuadrado;

	}
	public static double HallarPerimetroTriangulo(double base) {

		double perimetrotriangulo = 0;

		perimetrotriangulo = 3 * base;
		return perimetrotriangulo;

	}

	}


