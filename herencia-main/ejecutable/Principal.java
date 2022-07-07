package clases;


public class Principal
{
    //metodo principal//
    public static void public static void main(String[] args) 
    {
    //entrada de datos//
    double x = Double.parseDOuble(JOptionPane.showInputDialog("Digote el valor de x"));
    double y = Double.parseDOuble(JOptionPane.showInputDialog("Digite el valor de y"));   

    //creacion de un objeto Suma
    Suma miSuma = new Suma(x,y);
    miSuma.Sumar()
    JOptionPane.showMessageDialog(null, " la suma de " + x+ "y" + y + " es " + miSuma.mostrarResultado());
    System.exit(0);
    }
}