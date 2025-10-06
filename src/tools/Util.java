/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author u05594757139
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
             componentes[i].setEnabled(valor);
            
        }
    }
    public static void limpar(JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            
            if (componentes[i] instanceof JTextField) {
            ((JTextField)componentes[i]).setText("");
            }
            if (componentes[i] instanceof JComboBox) {
            ((JComboBox)componentes[i]).setSelectedIndex(-1);
            }
        }
    }
    
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    
    public static boolean perguntar(String cad) {
        int resp = JOptionPane.showConfirmDialog(null, cad, "Perguntar", JOptionPane.YES_NO_OPTION); 
        //return resp == JOptionPane.YES_OPTION;
        if (resp == JOptionPane.YES_OPTION) {
            return true;
        } else {
           return false;
        }
    }
    
    
    
    public static  int strToInt(String num ){
        return Integer.valueOf(num);
    }
    
    public static String intToStr(int num){
    return String.valueOf(num);
    }
    
    public static String doubleToStr(int num){
    return "";
    }
    
    public static String strToDouble(String num){
    return null;
    }
    
     public static Date strToDate(String data){
        return null;
    }
    public static String dateToStr(Date data){
        return "";
    }
    
}
