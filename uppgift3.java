import javax.swing.*;

public class uppgift3{
	public static void main(String[]args){
String s;
double sum = 0;
s = JOptionPane.showInputDialog(null, "Hur högt kastas bollen ifrån? Svara i meter.");
double ns = Double.parseDouble(s);
while(ns > 0.01){
sum = sum + 1;
 ns = ns * 0.7;


		}
		JOptionPane.showMessageDialog(null, "Bollen studsade " + sum + " Gånger!");
	}
}