package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author oquintansocampo
 */
public class Condicional {

    private int neg = 0;
    private int pos = 0;
    private int zero = 0;

    public void compararNum() {
        for (int cont = 0; cont < 10; cont++) {
            String dato = JOptionPane.showInputDialog("Introduzca número " + (cont + 1));
            double valor = Double.parseDouble(dato);
            if (valor > 0) {             
                pos++;
            } else if (valor == 0) {
                zero++;
            } else if (valor < 0) {
                neg++;
            } 
        }
    }

    public void contarNum() {
        JOptionPane.showMessageDialog(null, "Hay " + pos + " positivos");
        JOptionPane.showMessageDialog(null, "Hay " + neg + " negativos");
        JOptionPane.showMessageDialog(null, "Hay " + zero + " ceros");
    }
}
