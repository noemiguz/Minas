/**
 *
 * @author arquitectura de software I 2016
 */
import java.awt.Color;

import javax.swing.JButton;
public class Casilla extends JButton{
    int valorCasilla;
    int posicionCasilla;
    
    public Casilla(int posicion) {
        setText("[]"); 
        setBackground(Color.blue);
        setVisible(true);
        posicionCasilla=posicion;
    } 
    public boolean esBomba(){
        return  valorCasilla == -1;
    }   
    public void setValor(int valor){
        valorCasilla=valor;      
    }
    public int getValor(){
        return valorCasilla;
    }
    private void setColor() {
        this.setBackground(Color.lightGray);
        if (esBomba()){          
           this.setBackground(Color.black);        
        }
        
    }
    private void mostrarValor(){
        this.setText("");
        if (valorCasilla>0 ){
            this.setText(Integer.toString(valorCasilla));
        }
    }
    public void mostrarJugador(){
        setColor();
        mostrarValor();
    }
}
