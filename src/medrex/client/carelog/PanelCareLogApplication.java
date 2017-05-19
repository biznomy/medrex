/**
 * 
 */
package medrex.client.carelog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.client.main.PanelResidentInfoHoriz;
import medrex.client.utils.SwingUtils;
import medrex.commons.dataObj.CareLogValue;
import medrex.commons.intf.PopUpView;
import medrex.commons.vo.careLog.CareLogMaster;
import medrex.commons.vo.careLog.CareLogNode;
import medrex.commons.vo.resident.ResidentMain;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.sX.swing.JCheckBoxGroup;
import com.sX.swing.JRadioButtonGroup;
import com.sX.swing.JToggleButtonGroup;
import com.sX.swing.JxButton;

/**
 * @author D S Naruka
 * 
 */
public class PanelCareLogApplication extends PopUpView {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4316254494735374788L;
	private JLabel lblPath;
	private JxButton backButton;
	private JPanel infoPanel;
	private JPanel controlPanel;
	private JPanel hostPanel;

	/* careLog data factory */
	private CareLogFactory factory;
	/* main tree with all values */
	private DefaultMutableTreeNode tree;
	/* if parent exists points to it, otherwise null */
	private DefaultMutableTreeNode parent;
	/* current node */
	private DefaultMutableTreeNode node;
	/*
	 * if any multiChoice node exists from current node to the root, then point
	 * to it otherwise null
	 */
	private DefaultMutableTreeNode lastMultipleChoiceNode;
	/* Keeps the current status of the CareLog Nodes */
	private Map<String, CareLogNode> valueMap;
	/* current resident */
	private ResidentMain resident;

	private PanelResidentInfoHoriz panelResiInfo;
	private JxButton closeButton;
	private JxButton saveButton;
	private CareLogMaster careLogMaster;
	private int currentResidenceKey;
	private Color BORDER = new Color(171, 195, 203);

	public PanelCareLogApplication(final int currentResidenceKey,
			final int careLogSerial) {
		setLayout(new BorderLayout());
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setPreferredSize(this.getSize());
		setBackground(new Color(231, 239, 242));

		infoPanel = new JPanel();
		infoPanel.setLayout(new BorderLayout());
		infoPanel.setOpaque(false);
		infoPanel.setPreferredSize(new Dimension(0, 175));
		add(infoPanel, BorderLayout.NORTH);

		controlPanel = new JPanel();
		controlPanel.setLayout(null);
		infoPanel.add(controlPanel, BorderLayout.SOUTH);
		controlPanel.setOpaque(false);
		controlPanel.setPreferredSize(new Dimension(0, 40));

		backButton = new JxButton(0.6f);
		backButton.setBounds(820, 5, 75, 35);
		backButton.setText("BACK");
		backButton.setPreferredSize(new Dimension(75, 35));
		backButton.setBorderPainted(false);
		backButton.setGlassyPainted(true);
		backButton.setBorder(new LineBorder(BORDER, 1));
		backButton.setBackground(new Color(115, 155, 168));
		backButton.setFont(new Font("", Font.BOLD, 12));
		backButton.setForeground(Color.WHITE);
		backButton.setRolloverEnabled(true);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateView(getParentNode());
			}
		});
		controlPanel.add(backButton);

		saveButton = new JxButton(0.6f);
		saveButton.setBounds(905, 5, 75, 35);
		saveButton.setText("SAVE");
		saveButton.setPreferredSize(new Dimension(75, 35));
		saveButton.setBorderPainted(false);
		saveButton.setGlassyPainted(true);
		saveButton.setBorder(new LineBorder(BORDER, 1));
		saveButton.setBackground(new Color(115, 155, 168));
		saveButton.setFont(new Font("", Font.BOLD, 12));
		saveButton.setForeground(Color.WHITE);
		saveButton.setRolloverEnabled(true);
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (doSave()) {
					// JOptionPane.showMessageDialog(null,
					// "CARE LOG ENTRY SAVED");
					close();
				}
			}
		});
		controlPanel.add(saveButton);

		closeButton = new JxButton(0.6f);
		closeButton.setBounds(990, 5, 75, 35);
		closeButton.setText("CLOSE");
		closeButton.setPreferredSize(new Dimension(75, 35));
		closeButton.setBorderPainted(false);
		closeButton.setGlassyPainted(true);
		closeButton.setBorder(new LineBorder(BORDER, 1));
		closeButton.setBackground(new Color(115, 155, 168));
		closeButton.setFont(new Font("", Font.BOLD, 12));
		closeButton.setForeground(Color.WHITE);
		closeButton.setRolloverEnabled(true);
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container ancestor = PanelCareLogApplication.this
						.getTopLevelAncestor();
				if (ancestor != null) {
					((JDialog) ancestor).dispose();
				}
			}
		});
		controlPanel.add(closeButton);

		final JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setOpaque(false);
		panel_2.setPreferredSize(new Dimension(388, 140));
		infoPanel.add(panel_2);

		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 40, 646, 85);
		panel_1.setPreferredSize(new Dimension(600, 50));
		panel_2.add(panel_1);
		panel_1.setOpaque(false);

		lblPath = new JLabel();
		lblPath.setBounds(10, 10, 626, 26);
		lblPath.setFont(new Font("", Font.BOLD, 12));
		lblPath.setBorder(new EmptyBorder(5, 20, 5, 5));
		lblPath.setText("CARE LOG CATEGORIES");
		panel_1.add(lblPath);

		panelResiInfo = new PanelResidentInfoHoriz();
		panelResiInfo.setBounds(700, 5, 377, 120);
		panelResiInfo.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelResiInfo.setPreferredSize(new Dimension(388, 120));
		panel_2.add(panelResiInfo);

		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setOpaque(false);
		add(panel);

		hostPanel = new JPanel();
		hostPanel.setOpaque(false);
		panel.add(hostPanel);
		final FlowLayout hostFlowLayout = new FlowLayout();
		hostFlowLayout.setAlignment(FlowLayout.LEFT);
		hostFlowLayout.setVgap(10);
		hostFlowLayout.setHgap(10);
		hostPanel.setLayout(hostFlowLayout);

		/* initializing data */
		factory = new CareLogFactory();
		tree = factory.getValues();
		parent = null;
		valueMap = new HashMap<String, CareLogNode>();

		System.out.println("careLog Key is" + careLogSerial);

		this.careLogMaster = null;
		this.careLogMaster = getInstanceOfCareLog(careLogSerial);
		this.currentResidenceKey = currentResidenceKey;
		updateResident();
		updateData();
		updateView(tree);
	}

	private void updateData() {
		if (careLogMaster != null) {
			List<CareLogNode> nodes = careLogMaster.getCareLogNodes();
			valueMap.clear();
			for (CareLogNode node : nodes) {
				valueMap.put(node.getTitle(), node);
			}
		} else {
			careLogMaster = new CareLogMaster();
			careLogMaster.setUserId(Global.currentLoggedInUserKey);
			careLogMaster.setDate(MedrexClientManager.getServerTime());
			careLogMaster.setResidentId(resident.getSerial());
		}
	}

	private CareLogMaster getInstanceOfCareLog(int careLogSerial) {
		CareLogMaster careLog = null;
		try {
			careLog = MedrexClientManager.getInstance().getCareLogMaster(
					careLogSerial);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// if careLog is not null store the reference into careLogMaster Object
		// otherwise store null in it
		if (careLog != null) {
			careLogMaster = careLog;
		}
		return careLogMaster;
	}

	protected boolean doSave() {
		/* careLogMaster will never be null here */
		careLogMaster.getCareLogNodes().clear();

		/* filling new List */
		List<CareLogNode> careLogs = new ArrayList<CareLogNode>();
		Collection<CareLogNode> careLogInMap = valueMap.values();
		for (CareLogNode node : careLogInMap) {
			careLogs.add(node);
		}
		careLogMaster.setCareLogNodes(careLogs);

		try {
			int serial = MedrexClientManager.getInstance()
					.insertOrUpdateCareLog(careLogMaster);
			careLogMaster = getInstanceOfCareLog(serial);
			updateData();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	private void updateResident() {
		try {
			resident = MedrexClientManager.getInstance().getResident(
					currentResidenceKey);
			// resident = new ResidentMainService().getResident(12);
			panelResiInfo.setResident(resident);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * updates the view for the current node
	 */
	@SuppressWarnings("unchecked")
	private void updateView(DefaultMutableTreeNode currentNode) {
		if (currentNode == null) {
			throw new IllegalArgumentException("currentNode can't be null");
		}

		/* update current node, as the whole view is supposed to change */
		this.node = currentNode;
		/* we have tree which is conceptually the root node */
		final DefaultMutableTreeNode root = this.tree;

		Object obj = currentNode.getUserObject();
		CareLogValue nodeVal = null;
		boolean multiAllowed = false;
		if (obj != null && obj instanceof CareLogValue) {
			nodeVal = (CareLogValue) obj;
			multiAllowed = nodeVal.isMultipleAllowed();

			/* if current node is multi-choice the update the reference */
			this.lastMultipleChoiceNode = nodeVal.isMultipleAllowed() ? currentNode
					: lastMultipleChoiceNode;
			this.lastMultipleChoiceNode = (currentNode.getParent() == null || currentNode
					.getParent() == root)
					&& !nodeVal.isMultipleAllowed() ? null
					: lastMultipleChoiceNode;
		}

		if (!currentNode.isLeaf()) {
			Enumeration<DefaultMutableTreeNode> children = currentNode
					.children();

			hostPanel.removeAll();

			final JToggleButtonGroup<? extends JToggleButton> buttonGroup = multiAllowed ? new JCheckBoxGroup()
					: new JRadioButtonGroup();

			while (children.hasMoreElements()) {
				final DefaultMutableTreeNode child = children.nextElement();
				final CareLogValue value = (CareLogValue) child.getUserObject();
				/*
				 * NEXT NODE TO MOVE:
				 * --------------------------------------------
				 * ---------------------- It can only be the child of the
				 * current. But if current node is leaf node then move to root
				 * node (or can move to the last multiple choices node)
				 */
				// final DefaultMutableTreeNode gotoNode = (child.isLeaf() ?
				// root : child);
				final DefaultMutableTreeNode gotoNode = (child.isLeaf() ? (lastMultipleChoiceNode != null ? lastMultipleChoiceNode
						: root)
						: child);

				if (value != null) {
					final JToggleButton button = multiAllowed ? new JCheckBox()
							: new JRadioButton();

					final CareLogToggleButton<? extends JToggleButton> buttonCareLog = multiAllowed ? new CareLogToggleButton<JCheckBox>(
							(JCheckBox) button)
							: new CareLogToggleButton<JRadioButton>(
									(JRadioButton) button);

					if (multiAllowed) {
						((JCheckBoxGroup) buttonGroup).add((JCheckBox) button);
					} else {
						((JRadioButtonGroup) buttonGroup)
								.add((JRadioButton) button);
					}

					buttonCareLog.setPreferredSize(new Dimension(195, 170));
					buttonCareLog.setText(value.getTitle());
					buttonCareLog.setIcon(value.getIcon());
					buttonCareLog.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if (child.getParent() != root) {
								updateValueMap(child, buttonGroup.getValue());
							}
							updateView(gotoNode);
						}
					});
					hostPanel.add(buttonCareLog);
				}
			}
			/* TODO: Update current node for the values from valueMap */
			if (currentNode == this.tree) {
				updateRootValues(buttonGroup);
			} else {
				updateSubTreeValues(buttonGroup, currentNode);
			}
		}

		/* back button can only be visible only if there exists a parent node */
		backButton.setVisible(currentNode.getParent() != null);
		closeButton.setVisible(!backButton.isVisible());
		saveButton.setVisible(!backButton.isVisible());
		updateTreePath(currentNode);

		this.updateUI();
	}

	/* update the visible path from root to the current node */
	private void updateTreePath(DefaultMutableTreeNode currentNode) {
		String sep = " >> ";
		String strPath = "CARE LOG CATEGORIES";
		if (currentNode != this.tree) {
			TreeNode[] path = currentNode.getPath();
			for (int i = 0; i < path.length; i++) {
				TreeNode node = path[i];
				if (node instanceof DefaultMutableTreeNode) {
					DefaultMutableTreeNode curNode = (DefaultMutableTreeNode) node;
					Object obj = curNode.getUserObject();
					if (obj != null && obj instanceof CareLogValue) {
						CareLogValue value = (CareLogValue) obj;
						if (!"ROOT".equalsIgnoreCase(value.getTitle())) {
							strPath += sep + value.getTitle();
						}
					}
				}
			}
		}
		lblPath.setText(strPath);
	}

	/*
	 * returns the parent of the current visible node and udpates the parent
	 * reference
	 */
	private DefaultMutableTreeNode getParentNode() {
		if (node != null && node.getParent() != null) {
			this.parent = (DefaultMutableTreeNode) node.getParent();
			return this.parent;
		}
		return null;
	}

	/* returns the 1st sub-parent of the given node */
	private DefaultMutableTreeNode getSubRootNode(DefaultMutableTreeNode node) {
		if (node != null && node.getParent() != null) {
			TreeNode[] path = node.getPath();
			if (path.length >= 2) {
				return (DefaultMutableTreeNode) path[1];
			}
		}
		return null;
	}

	/* update the root node with values from valueMap */
	private void updateRootValues(
			JToggleButtonGroup<? extends JToggleButton> btnGroup) {
		Enumeration<DefaultMutableTreeNode> children = this.tree.children();

		int i = 0;
		while (children.hasMoreElements()) {
			final DefaultMutableTreeNode child = children.nextElement();
			final CareLogValue value = (CareLogValue) child.getUserObject();
			final JToggleButton btn = btnGroup.get(i);

			/* TODO the decision of enabling a button can be more intelligent */
			if (valueMap.containsKey(value.getTitle())) {
				btn.setSelected(true);
			} else {
				btn.setSelected(false);
			}

			i++;
		}
	}

	/* udpate the subTrees with values from valueMap */
	private void updateSubTreeValues(
			JToggleButtonGroup<? extends JToggleButton> btnGroup,
			DefaultMutableTreeNode node) {
		int value = getValueForNode(node);

		// DefaultMutableTreeNode parent = (DefaultMutableTreeNode)
		// node.getParent();
		// DefaultMutableTreeNode subRoot = getSubRootNode(node);

		btnGroup.setValue(value);
	}

	/* updates the value in the valueMap */
	private void updateValueMap(DefaultMutableTreeNode node, int value) {
		DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node
				.getParent();
		DefaultMutableTreeNode subRoot = getSubRootNode(node);

		if (parent != null && subRoot != null) {
			Object obj = subRoot.getUserObject();
			CareLogValue subRootVal = null;
			if (obj != null && obj instanceof CareLogValue) {
				subRootVal = (CareLogValue) obj;
			}

			if (subRootVal != null) {
				String key = subRootVal.getTitle();
				CareLogNode nodeValues = valueMap.get(key);
				if (nodeValues == null) {
					nodeValues = new CareLogNode();
					nodeValues.setTitle(key);
					valueMap.put(key, nodeValues);
					nodeValues = valueMap.get(key);
				}
				updateNodeValue(nodeValues, node, value);
			}
		}
	}

	/* updates the value in nodeValues with level */
	private void updateNodeValue(CareLogNode nodeValues,
			DefaultMutableTreeNode node, int value) {
		Object obj = node.getUserObject();
		CareLogValue nodeLvlVal = null;
		if (obj != null && obj instanceof CareLogValue) {
			nodeLvlVal = (CareLogValue) obj;
		}
		if (nodeLvlVal != null) {
			switch (nodeLvlVal.getLevel()) {
			case 1:
				nodeValues.setLevel1Value(value);
				break;
			case 2:
				nodeValues.setLevel2Value(value);
				break;
			case 3:
				nodeValues.setLevel3Value(value);
				break;
			case 4:
				nodeValues.setLevel4Value(value);
				break;
			case 5:
				nodeValues.setLevel5Value(value);
				break;
			case 6:
				nodeValues.setLevel6Value(value);
				break;
			case 7:
				nodeValues.setLevel7Value(value);
				break;
			case 8:
				nodeValues.setLevel8Value(value);
				break;
			}
		}
	}

	private int getValueForNode(DefaultMutableTreeNode node) {
		if (node == null) {
			return 0;
		}

		DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node
				.getParent();
		DefaultMutableTreeNode subRoot = getSubRootNode(node);

		if (parent != null && subRoot != null) {
			Object obj = subRoot.getUserObject();
			CareLogValue subRootVal = null;
			if (obj != null && obj instanceof CareLogValue) {
				subRootVal = (CareLogValue) obj;
			}

			if (subRootVal != null) {
				String key = subRootVal.getTitle();
				CareLogNode nodeValues = valueMap.get(key);
				if (nodeValues == null) {
					nodeValues = new CareLogNode();
					nodeValues.setTitle(key);
					valueMap.put(key, nodeValues);
					nodeValues = valueMap.get(key);
				}
				return getNodeValue(nodeValues, node);
			}
		}

		return 0;
	}

	/* retrieves the value from nodeValues with level */
	private int getNodeValue(CareLogNode nodeValues, DefaultMutableTreeNode node) {
		Object obj = node.getUserObject();
		CareLogValue nodeLvlVal = null;
		if (obj != null && obj instanceof CareLogValue) {
			nodeLvlVal = (CareLogValue) obj;
		}
		if (nodeLvlVal != null) {
			switch (nodeLvlVal.getLevel() + 1) {
			// case 1:
			// return nodeValues.getLevel1Value();
			case 2:
				return nodeValues.getLevel2Value();
			case 3:
				return nodeValues.getLevel3Value();
			case 4:
				return nodeValues.getLevel4Value();
			case 5:
				return nodeValues.getLevel5Value();
			case 6:
				return nodeValues.getLevel6Value();
			case 7:
				return nodeValues.getLevel7Value();
			case 8:
				return nodeValues.getLevel8Value();
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFrame window = SwingUtils.wrapInFrame(new PanelCareLogApplication(12,
				0));
		window.setSize(1024, 738);
		// window.setUndecorated(true);
		window.setVisible(true);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
