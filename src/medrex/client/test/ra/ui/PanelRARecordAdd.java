package medrex.client.test.ra.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JScrollPane;

import medrex.client.constants.Global;
import medrex.client.mds.ui.PanelMDSPage;
import medrex.client.utils.events.ViewEvent;
import medrex.commons.enums.GuiModes;
import medrex.commons.intf.Form;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.ra.RARecord;

import com.sX.swing.JxButton;

public class PanelRARecordAdd extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = 841792602136484737L;
	private Form[] forms;
	private JScrollPane scrollPane;
	private PanelMDSPage panelPager;
	private int pageNum;

	private Color DEF_BACK_COL = new Color(24, 86, 110);

	public PanelRARecordAdd() {
		super();

		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));

		setPreferredSize(getSize());

		setBackground(DEF_BACK_COL);
		setLayout(null);

		forms = new Form[2];
		panelPager = new PanelMDSPage();
		panelPager.setPageCount(forms.length);
		panelPager.setBounds(29, 46, 863, 35);
		panelPager.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if (evt.getPropertyName().equals(
						PanelMDSPage.PAGE_BUTTON_CLICKED)) {
					pageNum = (Integer) evt.getNewValue();
					showForm((Integer) evt.getNewValue());

				}
			}
		});
		add(panelPager);

		final JxButton saveButton = new JxButton();
		saveButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		saveButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				if (getForm(1).doValidate()) {
					fireViewEvent(ViewEvent.SAVE);
					getForm(1).doSave();
					close();
				}
			}
		});
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setText("Save");
		saveButton.setBounds(28, 9, 106, 26);
		add(saveButton);

		final JxButton cancelButton = new JxButton();
		cancelButton.setBackground(GuiModes.DESIGNER_SCREEN
				.getControlBackgroundColor());
		cancelButton.setForeground(GuiModes.DESIGNER_SCREEN
				.getControlForegroundColor());
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent e) {
				close();
			}
		});
		cancelButton.setFont(new Font("", Font.BOLD, 12));
		cancelButton.setText("Cancel");
		cancelButton.setBounds(140, 9, 106, 26);
		add(cancelButton);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 81, 975, this.getSize().height - 81 - 50);
		add(scrollPane);

		showForm(1);
		// updateData();
	}

	// private void doSave(){
	// // controllerRAAdd.save();
	// fireViewEvent(ViewEvent.SAVE);
	// }

	private void updateData() {
		RARecord raRecord = null;
		if (Global.currentRAFKey != 0) {
			try {
				// raRecord =
				// MedrexClientManager.getInstance().getRARecord(Global.currentRAFKey);
			} catch (Exception ex) {

			}
			raRecord.getRafp1Id();

			if (forms[0] == null) {
				forms[0] = getForm(0);
			}
			scrollPane.getViewport().setViewPosition(new Point(0, 0));
			scrollPane.setViewportView((Component) forms[0]);
			scrollPane.updateUI();
		}
	}

	/*
	 * private void doSave() { RARecord raRecord = new RARecord();
	 * raRecord.setSerial(Global.currentRAFKey); // controllerRAFPg1.doSave();
	 * // controllerRAFPg2.doSave(); // Global.currentRAFKey =
	 * Global.panelRAFPg1.doSave(); // Global.currentRAF2Key =
	 * Global.panelRAFPg2.doSave(); //
	 * raRecord.setRafp1Id(controllerRAFPg1.getCurrentSerial()); //
	 * raRecord.setRafp2Id(controllerRAFPg2.getCurrentSerial());
	 * raRecord.setFormName("RAF");
	 * raRecord.setResidentId(Global.currentResidenceKey); try{
	 * Global.currentRAFKey =
	 * MedrexClientManager.getInstance().insertOrUpdateRARecord(raRecord);
	 * }catch(Exception ex){
	 * 
	 * } }
	 */

	@Override
	public void showForm(int pageNum) {
		Form form = forms[pageNum - 1];
		if (form == null) {
			form = getForm(pageNum);
			forms[pageNum - 1] = form;
			// form.doUpdate();
		}
		panelPager.resetButtons(pageNum - 1);
		scrollPane.getViewport().setViewPosition(new Point(0, 0));
		scrollPane.setViewportView((Component) form);
		scrollPane.updateUI();
	}

	/*
	 * public Form getForm(int index) { switch (index) { case 0:
	 * ControllerRAFPg1 controllerRAFPg1 = (ControllerRAFPg1)
	 * controllerRAAdd.getController(ControllerRAFPg1.class); return
	 * (Form)controllerRAFPg1.getView(); case 1: ControllerRAFPg2
	 * controllerRAFPg2 = (ControllerRAFPg2)
	 * controllerRAAdd.getController(ControllerRAFPg2.class); return (Form)
	 * controllerRAFPg2.getView(); default: return null; } }
	 */

	@Override
	public String getTitle() {
		return "RA Forms";
	}
}
