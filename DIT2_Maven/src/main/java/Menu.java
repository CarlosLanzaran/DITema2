import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 235);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Artículos");
		menuBar.add(mnNewMenu);
		
		 JMenuItem mntmNewMenuItem = new JMenuItem("Alta");
	        // Añadir el ActionListener para abrir la ventana de articulos
	        mntmNewMenuItem.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                altaarticulos articulosFrame = new altaarticulos(); // Crear una nueva instancia de articulos
	                articulosFrame.setVisible(true); // Hacer visible la ventana
	            }
	        });
	        mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consulta");
		// Añadir el ActionListener para abrir la ventana de articulos
        mntmNewMenuItem_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultaarticulo articulosFrame = new consultaarticulo(); // Crear una nueva instancia de articulos
                articulosFrame.setVisible(true); // Hacer visible la ventana
            }
        });
        mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Baja");
		// Añadir el ActionListener para abrir la ventana de articulos
        mntmNewMenuItem_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	bajaarticulo articulosFrame = new bajaarticulo(); // Crear una nueva instancia de articulos
                articulosFrame.setVisible(true); // Hacer visible la ventana
            }
        });
        mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Modificación");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	modarticulo articulosFrame = new modarticulo(); // Crear una nueva instancia de articulos
                articulosFrame.setVisible(true); // Hacer visible la ventana
            }
        });
        mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_1 = new JMenu("Tickets");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Alta");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	altatickets articulosFrame = new altatickets(); // Crear una nueva instancia de tickets
                articulosFrame.setVisible(true); // Hacer visible la ventana
            }
        });
        mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Consulta");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	consultatickets articulosFrame = new consultatickets(); // Crear una nueva instancia de tickets
                articulosFrame.setVisible(true); // Hacer visible la ventana
            }
        });
        mnNewMenu_1.add(mntmNewMenuItem_6);
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
