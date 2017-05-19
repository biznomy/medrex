package medrex.client.admin.diet.plan;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.admin.DietPlan;

import com.sX.swing.JxButton;
import com.sX.swing.JxComboBox;

public class PanelDietPlanDialog extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8224301861140734720L;
	private JTextField txtDietName;
	private JTextArea txtAreaDesert;
	private JTextArea txtAreaMain;
	private JTextArea txtAreaVegetables;
	private JTextArea txtAreaCereals;
	private JTextArea txtAreaLiquids;
	private JxButton saveButton;
	public static final Color DEF_COL = new Color(49, 104, 127);
	public static final Color BORDER_COL = new Color(180, 188, 193);

	private PanelDietPlanEditor panelDietPlanEditor;
	private JxButton cancelButton;
	private JxComboBox cmbDietType;

	public PanelDietPlanDialog() {
		super();
		setBackground(Color.WHITE);
		setLayout(null);
		setPreferredSize(new Dimension(1200, 690));
		setSize(1200, 690);
		setForeground(GuiModes.DESIGNER_FORMS.getDefaultForegroundColor());
		setBackground(GuiModes.DESIGNER_FORMS.getDefaultBackgroundColor());
		setFont(GuiModes.DESIGNER_FORMS.getDefaultFont());

		final JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.setBounds(0, 0, 1200, 690);
		add(panel);

		panelDietPlanEditor = new PanelDietPlanEditor("LIQUIDS");
		panelDietPlanEditor
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						if (evt.getPropertyName().equalsIgnoreCase("dietType")
								|| evt.getPropertyName().equalsIgnoreCase(
										"andButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"orButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"clearButton")) {
							doQuery(evt.getOldValue().toString(), evt
									.getNewValue().toString());
						}
					}
				});
		panelDietPlanEditor.setBounds(5, 50, 220, 330);
		add(panelDietPlanEditor);

		panelDietPlanEditor = new PanelDietPlanEditor("CEREALS");
		panelDietPlanEditor
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						if (evt.getPropertyName().equalsIgnoreCase("dietType")
								|| evt.getPropertyName().equalsIgnoreCase(
										"andButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"orButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"clearButton")) {
							doQuery(evt.getOldValue().toString(), evt
									.getNewValue().toString());
						}
					}
				});
		panelDietPlanEditor.setBounds(240, 50, 220, 330);
		add(panelDietPlanEditor);

		panelDietPlanEditor = new PanelDietPlanEditor("VEGETABLES");
		panelDietPlanEditor
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						if (evt.getPropertyName().equalsIgnoreCase("dietType")
								|| evt.getPropertyName().equalsIgnoreCase(
										"andButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"orButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"clearButton")) {
							doQuery(evt.getOldValue().toString(), evt
									.getNewValue().toString());
						}
					}
				});
		panelDietPlanEditor.setBounds(480, 50, 220, 330);
		add(panelDietPlanEditor);

		panelDietPlanEditor = new PanelDietPlanEditor("MAIN");
		panelDietPlanEditor
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						if (evt.getPropertyName().equalsIgnoreCase("dietType")
								|| evt.getPropertyName().equalsIgnoreCase(
										"andButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"orButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"clearButton")) {
							doQuery(evt.getOldValue().toString(), evt
									.getNewValue().toString());
						}
					}
				});
		panelDietPlanEditor.setBounds(720, 50, 220, 330);
		add(panelDietPlanEditor);

		panelDietPlanEditor = new PanelDietPlanEditor("DESERT");
		panelDietPlanEditor
				.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						if (evt.getPropertyName().equalsIgnoreCase("dietType")
								|| evt.getPropertyName().equalsIgnoreCase(
										"andButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"orButton")
								|| evt.getPropertyName().equalsIgnoreCase(
										"clearButton")) {
							doQuery(evt.getOldValue().toString(), evt
									.getNewValue().toString());
						}
					}
				});
		panelDietPlanEditor.setBounds(960, 50, 220, 330);
		add(panelDietPlanEditor);

		saveButton = new JxButton();
		saveButton.setArc(0.4f);
		saveButton.setBackground(Color.WHITE);
		saveButton.setForeground(DEF_COL);
		saveButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (doSave()) {
					close();
				}
			}
		});
		saveButton.setText("Save");
		saveButton.setBounds(996, 655, 85, 25);
		panel.add(saveButton);

		cancelButton = new JxButton();
		cancelButton.setArc(0.4f);
		cancelButton.setBackground(Color.WHITE);
		cancelButton.setForeground(DEF_COL);
		cancelButton.setBorder(new LineBorder(BORDER_COL, 1, false));
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setText("Cancel");
		cancelButton.setBounds(1089, 655, 85, 25);
		panel.add(cancelButton);

		final JLabel dietQueryLabel = new JLabel();
		dietQueryLabel.setForeground(SystemColor.desktop);
		dietQueryLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dietQueryLabel.setText("Diet Query: ");
		dietQueryLabel.setBounds(10, 395, 123, 14);
		panel.add(dietQueryLabel);

		final JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		panel_1.setBackground(Color.WHITE);
		panel_1.setLayout(null);
		panel_1.setBounds(10, 415, 1164, 234);
		panel.add(panel_1);

		txtAreaLiquids = new JTextArea();
		txtAreaLiquids.setForeground(SystemColor.desktop);
		txtAreaLiquids.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAreaLiquids.setBorder(new LineBorder(SystemColor.desktop, 1, false));

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(90, 5, 1070, 40);
		panel_1.add(scrollPane);
		scrollPane.setViewportView(txtAreaLiquids);

		final JLabel liquiLabel = new JLabel();
		liquiLabel.setForeground(SystemColor.desktop);
		liquiLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		liquiLabel.setText("LIQUIDS");
		liquiLabel.setBounds(5, 5, 55, 25);
		panel_1.add(liquiLabel);

		final JLabel cereLabel = new JLabel();
		cereLabel.setForeground(SystemColor.desktop);
		cereLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		cereLabel.setText("CEREALS");
		cereLabel.setBounds(5, 50, 65, 25);
		panel_1.add(cereLabel);

		txtAreaVegetables = new JTextArea();
		txtAreaVegetables.setForeground(SystemColor.desktop);
		txtAreaVegetables.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAreaVegetables.setBorder(new LineBorder(SystemColor.desktop, 1,
				false));

		final JScrollPane scrollPane1 = new JScrollPane();
		scrollPane1.setBounds(90, 95, 1070, 40);
		panel_1.add(scrollPane1);
		scrollPane1.setViewportView(txtAreaVegetables);

		final JLabel vegLabel = new JLabel();
		vegLabel.setForeground(SystemColor.desktop);
		vegLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		vegLabel.setText("VEGETABLES");
		vegLabel.setBounds(5, 100, 84, 25);
		panel_1.add(vegLabel);

		txtAreaCereals = new JTextArea();
		txtAreaCereals.setForeground(SystemColor.desktop);
		txtAreaCereals.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAreaCereals.setBorder(new LineBorder(SystemColor.desktop, 1, false));

		final JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(90, 50, 1070, 40);
		panel_1.add(scrollPane2);
		scrollPane2.setViewportView(txtAreaCereals);

		final JLabel mainLabel = new JLabel();
		mainLabel.setForeground(SystemColor.desktop);
		mainLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		mainLabel.setText("MAIN");
		mainLabel.setBounds(5, 140, 84, 25);
		panel_1.add(mainLabel);

		txtAreaMain = new JTextArea();
		txtAreaMain.setForeground(SystemColor.desktop);
		txtAreaMain.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAreaMain.setBorder(new LineBorder(SystemColor.desktop, 1, false));

		final JScrollPane scrollPane3 = new JScrollPane();
		scrollPane3.setBounds(90, 140, 1070, 40);
		panel_1.add(scrollPane3);
		scrollPane3.setViewportView(txtAreaMain);

		final JLabel desertLabel = new JLabel();
		desertLabel.setForeground(SystemColor.desktop);
		desertLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		desertLabel.setText("DESERT");
		desertLabel.setBounds(5, 190, 84, 25);
		panel_1.add(desertLabel);

		txtAreaDesert = new JTextArea();
		txtAreaDesert.setForeground(SystemColor.desktop);
		txtAreaDesert.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAreaDesert.setBorder(new LineBorder(SystemColor.desktop, 1, false));

		final JScrollPane scrollPane4 = new JScrollPane();
		scrollPane4.setBounds(90, 185, 1070, 40);
		panel_1.add(scrollPane4);
		scrollPane4.setViewportView(txtAreaDesert);

		final JLabel nameLabel = new JLabel();
		nameLabel.setForeground(SystemColor.desktop);
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameLabel.setText("Diet Name:");
		nameLabel.setBounds(10, 16, 78, 16);
		panel.add(nameLabel);

		txtDietName = new JTextField();
		txtDietName.setForeground(GuiModes.DESIGNER_FORMS
				.getControlForegroundColor());
		txtDietName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtDietName.setBorder(new LineBorder(SystemColor.desktop, 1, false));
		txtDietName.setBounds(80, 10, 333, 29);
		panel.add(txtDietName);

		final JLabel dietTypeLabel = new JLabel();
		dietTypeLabel.setForeground(SystemColor.desktop);
		dietTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		dietTypeLabel.setText("Diet Type: ");
		dietTypeLabel.setBounds(433, 16, 78, 16);
		panel.add(dietTypeLabel);

		cmbDietType = new JxComboBox();
		cmbDietType.setModel(new DefaultComboBoxModel(new String[] {
				"Breakfast", "Lunch", "Dinner" }));
		cmbDietType.setBackground(Color.WHITE);
		cmbDietType.setForeground(DEF_COL);
		cmbDietType.setArc(0.4f);
		cmbDietType.setBorder(new LineBorder(DEF_COL, 1, false));
		cmbDietType.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbDietType.setBounds(500, 10, 250, 29);
		panel.add(cmbDietType);

		doUpdate();
	}

	private void doUpdate() {
		if (Global.currentDietPlanKey != 0) {
			DietPlan dietPlan = null;
			try {
				dietPlan = MedrexClientManager.getInstance().getDietPlan(
						Global.currentDietPlanKey);
			} catch (Exception ex) {

			}
			txtDietName.setText(dietPlan.getDietName());
			cmbDietType.setSelectedItem(dietPlan.getDietType());
			txtAreaLiquids.setText(dietPlan.getLiquidsQuery());
			txtAreaCereals.setText(dietPlan.getCerealsQuery());
			txtAreaVegetables.setText(dietPlan.getVegetablesQuery());
			txtAreaMain.setText(dietPlan.getMainQuery());
			txtAreaDesert.setText(dietPlan.getDesertQuery());
		}
	}

	private boolean doSave() {
		boolean bool = false;
		DietPlan dietPlan = new DietPlan();
		dietPlan.setSerial(Global.currentDietPlanKey);
		dietPlan.setDietName(txtDietName.getText());
		dietPlan.setDietType(cmbDietType.getSelectedItem() + "");
		dietPlan.setLiquidsQuery(txtAreaLiquids.getText());
		dietPlan.setCerealsQuery(txtAreaCereals.getText());
		dietPlan.setVegetablesQuery(txtAreaVegetables.getText());
		dietPlan.setMainQuery(txtAreaMain.getText());
		dietPlan.setDesertQuery(txtAreaDesert.getText());
		try {
			int serial = MedrexClientManager.getInstance()
					.insertOrUpdateDietPlan(dietPlan);
			if (serial != 0) {
				bool = true;
			}
		} catch (Exception ex) {
			bool = false;
		}
		return bool;
	}

	private void doQuery(String cat, String butVal) {
		StringBuffer sbuffer = new StringBuffer();
		if (cat.equalsIgnoreCase("LIQUIDS")) {
			if (!txtAreaLiquids.getText().equalsIgnoreCase("")) {
				sbuffer.append(txtAreaLiquids.getText());
				String tempStr = sbuffer.toString();
				if (tempStr.endsWith("AND") || tempStr.endsWith("OR")) {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {

					} else {
						sbuffer.append(" " + butVal);
					}
				} else {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {
						sbuffer.append(" " + butVal);
					}
				}
			} else {
				if (butVal.equalsIgnoreCase("AND")
						|| butVal.equalsIgnoreCase("OR")) {
				} else {
					sbuffer.append(butVal);
				}
			}
			txtAreaLiquids.setText(sbuffer.toString());
			if (butVal.equalsIgnoreCase("CLEAR")) {
				txtAreaLiquids.setText("");
			}
		}
		if (cat.equalsIgnoreCase("CEREALS")) {
			if (!txtAreaCereals.getText().equalsIgnoreCase("")) {
				sbuffer.append(txtAreaCereals.getText());
				String tempStr = sbuffer.toString();
				if (tempStr.endsWith("AND") || tempStr.endsWith("OR")) {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {

					} else {
						sbuffer.append(" " + butVal);
					}
				} else {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {
						sbuffer.append(" " + butVal);
					}
				}
			} else {
				if (butVal.equalsIgnoreCase("AND")
						|| butVal.equalsIgnoreCase("OR")) {
				} else {
					sbuffer.append(butVal);
				}
			}
			txtAreaCereals.setText(sbuffer.toString());
			if (butVal.equalsIgnoreCase("CLEAR")) {
				txtAreaCereals.setText("");
			}
		}
		if (cat.equalsIgnoreCase("VEGETABLES")) {
			if (!txtAreaVegetables.getText().equalsIgnoreCase("")) {
				sbuffer.append(txtAreaVegetables.getText());
				String tempStr = sbuffer.toString();
				if (tempStr.endsWith("AND") || tempStr.endsWith("OR")) {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {

					} else {
						sbuffer.append(" " + butVal);
					}
				} else {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {
						sbuffer.append(" " + butVal);
					}
				}
			} else {
				if (butVal.equalsIgnoreCase("AND")
						|| butVal.equalsIgnoreCase("OR")) {
				} else {
					sbuffer.append(butVal);
				}
			}
			txtAreaVegetables.setText(sbuffer.toString());
			if (butVal.equalsIgnoreCase("CLEAR")) {
				txtAreaVegetables.setText("");
			}
		}
		if (cat.equalsIgnoreCase("MAIN")) {
			if (!txtAreaMain.getText().equalsIgnoreCase("")) {
				sbuffer.append(txtAreaMain.getText());
				String tempStr = sbuffer.toString();
				if (tempStr.endsWith("AND") || tempStr.endsWith("OR")) {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {

					} else {
						sbuffer.append(" " + butVal);
					}
				} else {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {
						sbuffer.append(" " + butVal);
					}
				}
			} else {
				if (butVal.equalsIgnoreCase("AND")
						|| butVal.equalsIgnoreCase("OR")) {
				} else {
					sbuffer.append(butVal);
				}
			}
			txtAreaMain.setText(sbuffer.toString());
			if (butVal.equalsIgnoreCase("CLEAR")) {
				txtAreaMain.setText("");
			}
		}
		if (cat.equalsIgnoreCase("DESERT")) {
			if (!txtAreaDesert.getText().equalsIgnoreCase("")) {
				sbuffer.append(txtAreaDesert.getText());
				String tempStr = sbuffer.toString();
				if (tempStr.endsWith("AND") || tempStr.endsWith("OR")) {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {

					} else {
						sbuffer.append(" " + butVal);
					}
				} else {
					if (butVal.equalsIgnoreCase("AND")
							|| butVal.equalsIgnoreCase("OR")) {
						sbuffer.append(" " + butVal);
					}
				}
			} else {
				if (butVal.equalsIgnoreCase("AND")
						|| butVal.equalsIgnoreCase("OR")) {
				} else {
					sbuffer.append(butVal);
				}
			}
			txtAreaDesert.setText(sbuffer.toString());
			if (butVal.equalsIgnoreCase("CLEAR")) {
				txtAreaDesert.setText("");
			}
		}
	}

	@Override
	public String getTitle() {
		return "Diet Plan";
	}

}
