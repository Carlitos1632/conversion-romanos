import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class FrmConversion extends JFrame{

    public  FrmConversion(){
    setSize(300,200);                 //tamaño de la ventana
    setTitle("Conversion a Romanos");   //asignar titulo
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);   // salir del programa
    
    setLayout(null);    // anular diseño

    JLabel lblNumero= new JLabel("Número arábigo"); // creando etiqueta
    lblNumero.setBounds(10, 10, 100, 25);  // ubicacion y dimensiones de la etiqueta
    this.getContentPane().add(lblNumero);
    







}




}
