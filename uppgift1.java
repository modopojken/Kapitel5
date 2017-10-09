import javax.swing.*;

public class uppgift1{
	public static void main(String[]args){
String n;
double i = 1;
double sum = 0;
n = JOptionPane.showInputDialog(null, "Skriv in nummer");
double ns = Double.parseDouble(n);
while(i <= ns){
sum = sum + 1 * i;
i++;

 
	
	}

	JOptionPane.showMessageDialog(null, "Summan är: " + sum);
	}
}