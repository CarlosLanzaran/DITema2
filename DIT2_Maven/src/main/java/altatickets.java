import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;

public class altatickets extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					altatickets frame = new altatickets();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public altatickets() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrCdigo = new JTextArea();
		txtrCdigo.setText("Código:");
		txtrCdigo.setBounds(63, 33, 109, 22);
		contentPane.add(txtrCdigo);
		
		JTextArea txtrFecha = new JTextArea();
		txtrFecha.setText("Fecha:");
		txtrFecha.setBounds(63, 66, 109, 22);
		contentPane.add(txtrFecha);
		
		JTextArea txtrNombre = new JTextArea();
		txtrNombre.setText("Nombre:");
		txtrNombre.setBounds(63, 98, 109, 22);
		contentPane.add(txtrNombre);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(26, 152, 85, 21);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(227, 33, 96, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(227, 69, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(227, 101, 96, 19);
		contentPane.add(textField_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(154, 172, 85, 21);
		btnVolver.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            dispose();  // Cerrar la ventana actual
	            
	        }
	    });
		contentPane.add(btnVolver);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(276, 152, 85, 21);
		contentPane.add(btnLimpiar);
	}

}
