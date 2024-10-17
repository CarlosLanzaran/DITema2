import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class modarticulo extends JFrame {

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
					modarticulo frame = new modarticulo();
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
	public modarticulo() {
		setBounds(100, 100, 400, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Seleccione artículo a modificar");
		lblNewLabel.setBounds(103, 10, 182, 13);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(36, 159, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(272, 159, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Volver");
		btnNewButton_2.setBounds(151, 172, 85, 21);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();  // Cerrar la ventana actual
			}
		});
		contentPane.add(btnNewButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 32, 123, 21);
		contentPane.add(comboBox);
		
		JTextArea txtrDni = new JTextArea();
		txtrDni.setText("Dni:");
		txtrDni.setBounds(58, 63, 109, 22);
		contentPane.add(txtrDni);
		
		JTextArea txtrNombre = new JTextArea();
		txtrNombre.setText("Nombre:");
		txtrNombre.setBounds(58, 90, 109, 22);
		contentPane.add(txtrNombre);
		
		JTextArea txtrApellido = new JTextArea();
		txtrApellido.setText("Apellido:");
		txtrApellido.setBounds(58, 116, 109, 22);
		contentPane.add(txtrApellido);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(227, 63, 96, 19);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(227, 93, 96, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(227, 119, 96, 19);
		contentPane.add(textField_2);
	}

}
