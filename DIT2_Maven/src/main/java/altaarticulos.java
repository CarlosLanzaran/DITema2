import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class altaarticulos extends JFrame {

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
					altaarticulos frame = new altaarticulos();
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
	public altaarticulos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(125, 20, 0, 0);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(130, 20, 0, 0);
		contentPane.add(label_1);
		
		JTextArea txtrDni = new JTextArea();
		txtrDni.setBounds(81, 20, 109, 22);
		txtrDni.setText("Dni:");
		contentPane.add(txtrDni);
		
		JTextArea txtrNombre = new JTextArea();
		txtrNombre.setBounds(81, 53, 109, 22);
		txtrNombre.setText("Nombre:");
		contentPane.add(txtrNombre);
		
		JTextArea txtrApellido = new JTextArea();
		txtrApellido.setBounds(81, 85, 109, 22);
		txtrApellido.setText("Apellido:");
		contentPane.add(txtrApellido);
		
		textField = new JTextField();
		textField.setBounds(218, 20, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 56, 96, 19);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(218, 88, 96, 19);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(54, 139, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(267, 139, 85, 21);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnLimpiar);
		
		JButton btnVolver = new JButton("Volver");
	    btnVolver.setBounds(161, 172, 85, 21);
	    btnVolver.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            dispose();  // Cerrar la ventana actual
	            
	        }
	    });
	    contentPane.add(btnVolver);
	}
}
