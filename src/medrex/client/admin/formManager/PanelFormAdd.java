package medrex.client.admin.formManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.enums.ColorConstants;
import medrex.commons.exception.MedrexException;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.formManager.FormPage;

import com.sX.swing.JxButton;

public class PanelFormAdd extends PopUpView {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7767643677359506256L;
	private int formId;
	private FrameFormManager manager;
	private int parentid;
	private JComboBox comboBox;
	private JxButton saveButton;
	private boolean isNew;
	private PanelFormTree panelFormTree;

	public PanelFormAdd(int formId, final boolean isNew) {
		super();
		this.parentid = formId;
		this.isNew = isNew;
		setBackground(Color.WHITE);
		setLayout(null);

		setSize(new Dimension(
				Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit
						.getDefaultToolkit().getScreenSize().height - 50));
		setSize(new Dimension(1024, 768));
		setBounds(100, 100, 733, 155);

		final JLabel formAddLabel = new JLabel();
		formAddLabel.setForeground(ColorConstants.DEF_COLOR);

		formAddLabel.setText("Form Add");
		formAddLabel.setBounds(345, 10, 78, 16);
		add(formAddLabel);

		final JLabel formListLabel = new JLabel();
		formListLabel.setText("Form List");
		formListLabel.setForeground(ColorConstants.DEF_COLOR);
		formListLabel.setBounds(130, 50, 106, 16);
		add(formListLabel);

		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "" }));
		comboBox.setBounds(269, 46, 334, 25);
		add(comboBox);

		try {
			List<FormPage> allFormPage = MedrexClientManager.getInstance()
					.getAllForms();
			new ArrayList<String>();
			for (FormPage formpage : allFormPage) {
				if (formpage != null) {
					comboBox.addItem(formpage.getClassName());

				}
				if (formpage.getSerial() == formId) {
					comboBox.setSelectedIndex(formpage.getSerial());
				}
			}
		} catch (Exception e) {
		}

		saveButton = new JxButton();
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(final ActionEvent arg0) {
				doSave();
				// panelFormTree.getS.reload();

				close();

			}
		});
		saveButton.setForeground(ColorConstants.DEF_COLOR);
		saveButton.setText("Save");
		saveButton.setBounds(345, 90, 106, 26);
		add(saveButton);
	}

	private void doSave() {
		int formId = getFormId();
		formId = comboBox.getSelectedIndex();
		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK"
				+ parentid);
		// FormManagerDao.getInstance().getFormsById(parentid);

		/*
		 * List list = new ArrayList(); try { list
		 * =FormManagerDao.getInstance().checkduplicateform(parentid);
		 * System.out.println("fdsjfldsjfkljdsklfds"); } catch (MedrexException
		 * e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 */

		try {
			MedrexClientManager.getInstance().insertOrUpdateForm_formPage(
					formId, parentid, isNew);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MedrexException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getTitle() {
		return null;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

}
