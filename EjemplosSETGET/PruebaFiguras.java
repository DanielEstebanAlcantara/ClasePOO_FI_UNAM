package EjemplosSETGET;
public class PruebaFiguras {
    
    
    public static void main( String[] args) {
        Circulo cir = new Circulo();
        cir.setRadio(7.2f);
        System.out.println("El area es "+cir.area());
        System.out.println("El permitro es "+cir.perimetro());
        System.out.println("El radio es "+cir.getRadio());
    }


}
