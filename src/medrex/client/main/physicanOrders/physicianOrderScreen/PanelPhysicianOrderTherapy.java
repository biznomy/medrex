package medrex.client.main.physicanOrders.physicianOrderScreen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import medrex.client.constants.Global;
import medrex.commons.enums.ColorConstants;

import com.sX.swing.JxButton;
import com.sX.swing.JxPanel;

public class PanelPhysicianOrderTherapy extends JxPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2696230410567361988L;
	private JxButton btnDelete;
	private JxButton btnSave;
	private JxButton btnAddNew;
	private JTextField txtDuration;
	private JTextField txtRequiredLabs;
	private JTextField txtLineType;
	private JTextField txtCareOfLine;
	private JTextField txtDsg;
	private JTextField txtInsertionSite;
	private JTextField txtOrders;
	private JTextField txtTpn;
	private JTextField txtIvf;
	private JTextField txtIncludeMeds;

	public PanelPhysicianOrderTherapy() {
		super();
		setBorder(new LineBorder(Color.black, 1, false));
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(600, 430));
		setBackground(Color.WHITE);
		setArc(1.0f);

		final JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(0, 0));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		add(panel, BorderLayout.CENTER);

		final JLabel includeIvMedsLabel = new JLabel();
		includeIvMedsLabel.setForeground(ColorConstants.DEF_COLOR);
		includeIvMedsLabel.setFont(new Font("", Font.BOLD, 12));
		includeIvMedsLabel.setText("INCLUDE IV MEDS");
		includeIvMedsLabel.setBounds(100, 50, 120, 16);
		panel.add(includeIvMedsLabel);

		final JLabel ivfLabel = new JLabel();
		ivfLabel.setForeground(ColorConstants.DEF_COLOR);
		ivfLabel.setFont(new Font("", Font.BOLD, 12));
		ivfLabel.setText("IVF");
		ivfLabel.setBounds(100, 80, 120, 16);
		panel.add(ivfLabel);

		final JLabel tpnLabel = new JLabel();
		tpnLabel.setForeground(ColorConstants.DEF_COLOR);
		tpnLabel.setFont(new Font("", Font.BOLD, 12));
		tpnLabel.setText("TPN");
		tpnLabel.setBounds(100, 110, 120, 16);
		panel.add(tpnLabel);

		final JLabel ordersLabel = new JLabel();
		ordersLabel.setForeground(ColorConstants.DEF_COLOR);
		ordersLabel.setFont(new Font("", Font.BOLD, 12));
		ordersLabel.setText("ORDERS");
		ordersLabel.setBounds(100, 140, 120, 16);
		panel.add(ordersLabel);

		final JLabel durationLabel = new JLabel();
		durationLabel.setForeground(ColorConstants.DEF_COLOR);
		durationLabel.setFont(new Font("", Font.BOLD, 12));
		durationLabel.setText("DURATION");
		durationLabel.setBounds(100, 170, 120, 16);
		panel.add(durationLabel);

		final JLabel requiredLabsLabel = new JLabel();
		requiredLabsLabel.setForeground(ColorConstants.DEF_COLOR);
		requiredLabsLabel.setFont(new Font("", Font.BOLD, 12));
		requiredLabsLabel.setText("REQUIRED LABS");
		requiredLabsLabel.setBounds(100, 200, 120, 16);
		panel.add(requiredLabsLabel);

		final JLabel lineTypeLabel = new JLabel();
		lineTypeLabel.setForeground(ColorConstants.DEF_COLOR);
		lineTypeLabel.setFont(new Font("", Font.BOLD, 12));
		lineTypeLabel.setText("LINE TYPE");
		lineTypeLabel.setBounds(100, 230, 120, 16);
		panel.add(lineTypeLabel);

		final JLabel careOfLineLabel = new JLabel();
		careOfLineLabel.setForeground(ColorConstants.DEF_COLOR);
		careOfLineLabel.setFont(new Font("", Font.BOLD, 12));
		careOfLineLabel.setText("CARE OF LINE");
		careOfLineLabel.setBounds(100, 260, 120, 16);
		panel.add(careOfLineLabel);

		final JLabel dsgLabel = new JLabel();
		dsgLabel.setForeground(ColorConstants.DEF_COLOR);
		dsgLabel.setFont(new Font("", Font.BOLD, 12));
		dsgLabel.setText("DSG");
		dsgLabel.setBounds(100, 290, 120, 16);
		panel.add(dsgLabel);

		final JLabel insertionSiteLabel = new JLabel();
		insertionSiteLabel.setForeground(ColorConstants.DEF_COLOR);
		insertionSiteLabel.setFont(new Font("", Font.BOLD, 12));
		insertionSiteLabel.setText("INSERTION SITE");
		insertionSiteLabel.setBounds(100, 320, 120, 16);
		panel.add(insertionSiteLabel);

		txtIncludeMeds = new JTextField();
		txtIncludeMeds.setForeground(ColorConstants.DEF_COLOR);
		txtIncludeMeds.setBounds(250, 50, 120, 16);
		panel.add(txtIncludeMeds);

		txtIvf = new JTextField();
		txtIvf.setForeground(ColorConstants.DEF_COLOR);
		txtIvf.setBorder(new LineBorder(Color.black, 1, false));
		txtIvf.setBounds(250, 80, 120, 16);
		panel.add(txtIvf);

		txtTpn = new JTextField();
		txtTpn.setForeground(ColorConstants.DEF_COLOR);
		txtTpn.setBorder(new LineBorder(Color.black, 1, false));
		txtTpn.setBounds(250, 110, 120, 16);
		panel.add(txtTpn);

		txtOrders = new JTextField();
		txtOrders.setForeground(ColorConstants.DEF_COLOR);
		txtOrders.setBorder(new LineBorder(Color.black, 1, false));
		txtOrders.setBounds(250, 140, 120, 16);
		panel.add(txtOrders);

		txtDuration = new JTextField();
		txtDuration.setForeground(ColorConstants.DEF_COLOR);
		txtDuration.setBorder(new LineBorder(Color.black, 1, false));
		txtDuration.setBounds(250, 170, 120, 16);
		panel.add(txtDuration);

		txtRequiredLabs = new JTextField();
		txtRequiredLabs.setForeground(ColorConstants.DEF_COLOR);
		txtRequiredLabs.setBorder(new LineBorder(Color.black, 1, false));
		txtRequiredLabs.setBounds(250, 200, 120, 16);
		panel.add(txtRequiredLabs);

		txtLineType = new JTextField();
		txtLineType.setForeground(ColorConstants.DEF_COLOR);
		txtLineType.setBorder(new LineBorder(Color.black, 1, false));
		txtLineType.setBounds(250, 230, 120, 16);
		panel.add(txtLineType);

		txtCareOfLine = new JTextField();
		txtCareOfLine.setForeground(ColorConstants.DEF_COLOR);
		txtCareOfLine.setBorder(new LineBorder(Color.black, 1, false));
		txtCareOfLine.setBounds(250, 260, 120, 16);
		panel.add(txtCareOfLine);

		txtDsg = new JTextField();
		txtDsg.setForeground(ColorConstants.DEF_COLOR);
		txtDsg.setBorder(new LineBorder(Color.black, 1, false));
		txtDsg.setBounds(250, 290, 120, 16);
		panel.add(txtDsg);

		txtInsertionSite = new JTextField();
		txtInsertionSite.setForeground(ColorConstants.DEF_COLOR);
		txtInsertionSite.setBorder(new LineBorder(Color.black, 1, false));
		txtInsertionSite.setBounds(250, 320, 120, 16);
		panel.add(txtInsertionSite);

		btnAddNew = new JxButton();
		btnAddNew.setArc(0.4f);
		btnAddNew.setFont(new Font("", Font.BOLD, 12));
		btnAddNew.setForeground(ColorConstants.DEF_COLOR);
		btnAddNew.setBackground(Color.WHITE);
		btnAddNew.setText("Add New");
		btnAddNew.setBounds(170, 360, 100, 26);
		panel.add(btnAddNew);

		btnSave = new JxButton();
		btnSave.setFont(new Font("", Font.BOLD, 12));
		btnSave.setForeground(ColorConstants.DEF_COLOR);
		btnSave.setArc(0.4f);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				Global.framePhysicianOrder.dispose();
			}
		});
		btnSave.setBackground(Color.WHITE);
		btnSave.setText("Save");
		btnSave.setBounds(310, 360, 100, 26);
		panel.add(btnSave);

		btnDelete = new JxButton();
		btnDelete.setFont(new Font("", Font.BOLD, 12));
		btnDelete.setForeground(ColorConstants.DEF_COLOR);
		btnDelete.setArc(0.4f);
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setText("Delete");
		btnDelete.setBounds(460, 360, 100, 26);
		panel.add(btnDelete);

		final JLabel physicianOrderTherapyLabel = new JLabel();
		physicianOrderTherapyLabel.setForeground(ColorConstants.DEF_COLOR);
		physicianOrderTherapyLabel.setFont(new Font("", Font.BOLD, 16));
		physicianOrderTherapyLabel.setBackground(Color.WHITE);
		physicianOrderTherapyLabel
				.setHorizontalAlignment(SwingConstants.CENTER);
		physicianOrderTherapyLabel.setText("INTRAVENOUS THERAPY");
		add(physicianOrderTherapyLabel, BorderLayout.NORTH);
	}

	private void doSave() {

	}
}
