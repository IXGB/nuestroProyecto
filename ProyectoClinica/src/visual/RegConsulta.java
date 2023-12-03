package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class RegConsulta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegConsulta dialog = new RegConsulta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegConsulta() {
		setTitle("Registrar Consulta");
		setBounds(100, 100, 465, 501);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Paciente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(12, 13, 423, 82);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("NHC:");
				label.setBounds(12, 35, 56, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Nombre:");
				label.setBounds(180, 35, 56, 16);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setEditable(false);
				textField.setColumns(10);
				textField.setBounds(52, 32, 116, 22);
				panel.add(textField);
			}
			{
				textField_1 = new JTextField();
				textField_1.setEnabled(false);
				textField_1.setColumns(10);
				textField_1.setBounds(235, 32, 176, 22);
				panel.add(textField_1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBorder(new TitledBorder(null, "Datos de la Consulta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(12, 96, 423, 310);
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("Fecha Realizada:");
				label.setBounds(29, 29, 116, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Motivo de Consulta:");
				label.setBounds(29, 58, 116, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Prioridad Triaje:");
				label.setBounds(29, 87, 116, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Descripci\u00F3n:");
				label.setBounds(29, 145, 84, 16);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Vacuna:");
				label.setBounds(29, 116, 56, 16);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(29, 164, 384, 104);
				panel.add(textField_2);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(146, 55, 267, 22);
				panel.add(textField_3);
			}
			{
				JSpinner spinner = new JSpinner();
				spinner.setBounds(133, 84, 30, 22);
				panel.add(spinner);
			}
			{
				JSpinner spinner = new JSpinner();
				spinner.setEnabled(false);
				spinner.setModel(new SpinnerDateModel(new Date(1701403200000L), null, null, Calendar.DAY_OF_YEAR));
				spinner.setBounds(129, 26, 127, 22);
				panel.add(spinner);
			}
			{
				JLabel lblNewLabel = new JLabel("\u00BFFue importante la consulta?");
				lblNewLabel.setBounds(29, 281, 175, 16);
				panel.add(lblNewLabel);
			}
			{
				JRadioButton btnNo = new JRadioButton("no");
				btnNo.setBounds(247, 277, 127, 25);
				panel.add(btnNo);
			}
			
			JRadioButton btnYes = new JRadioButton("s\u00ED");
			btnYes.setSelected(true);
			btnYes.setBounds(203, 277, 127, 25);
			panel.add(btnYes);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(82, 114, 133, 22);
			panel.add(comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
