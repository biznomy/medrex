/**
 * 
 */
package com.sX.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.LayoutManager;
import java.awt.image.BufferedImageOp;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import org.jdesktop.jxlayer.JXLayer;
import org.jdesktop.jxlayer.plaf.effect.BufferedImageOpEffect;
import org.jdesktop.jxlayer.plaf.ext.LockableUI;

import com.jhlabs.image.BlurFilter;
import com.jhlabs.image.GrayFilter;
import com.jhlabs.image.OpacityFilter;
import com.sX.utils.SwingUtils;

/**
 * @author D S Naruka
 * 
 */
public class JxLayeredPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6870238229024334279L;

	private JRootPane rootPane;
	protected JComponent contentPane;
	private JXLayer<JComponent> layerContent;
	private LockableUI layerUI;
	private boolean locked;
	private BufferedImageOp[] filters;

	public JxLayeredPanel() {
		super.setLayout(new BorderLayout());

		rootPane = new JRootPane();
		super.add(rootPane);

		rootPane.setOpaque(false);
		rootPane.setVisible(true);

		contentPane = new JPanel();

		initUI(contentPane);

		rootPane.setContentPane(layerContent);
		rootPane.getContentPane().setVisible(true);

		setFilter(new OpacityFilter());
	}

	protected void initUI(JComponent com) {
		layerContent = new JXLayer<JComponent>(contentPane);
		layerUI = new LockableUI();
		layerUI.setLockedCursor(Cursor.getDefaultCursor());
		layerContent.setUI(layerUI);
		if (filters != null) {
			layerUI.setLockedEffects(new BufferedImageOpEffect(filters));
		}
	}

	@Override
	public JRootPane getRootPane() {
		return rootPane;
	}

	public JComponent getContentPane() {
		return contentPane;
	}

	public Component getGlassPane() {
		return rootPane.getGlassPane();
	}

	protected JLayeredPane getLayeredPane() {
		return rootPane.getLayeredPane();
	}

	public void setContentPane(JComponent comp) {
		contentPane = comp;
		initUI(comp);
	}

	public void setGlassPane(Component component) {
		rootPane.setGlassPane(component);
	}

	public void setLayeredPane(JLayeredPane layeredPane) {
		rootPane.setLayeredPane(layeredPane);
	}

	@Override
	protected void addImpl(Component comp, Object constraints, int index) {
		if (comp == rootPane) {
			super.addImpl(comp, constraints, index);
		} else {
			contentPane.add(comp, constraints, index);
		}
	}

	@Override
	public Component add(Component comp, int index) {
		return contentPane.add(comp, index);
	}

	@Override
	public void add(Component comp, Object constraints, int index) {
		contentPane.add(comp, constraints, index);
	}

	@Override
	public void add(Component comp, Object constraints) {
		contentPane.add(comp, constraints);
	}

	@Override
	public Component add(Component comp) {
		return contentPane.add(comp);
	}

	@Override
	public Component add(String name, Component comp) {
		return contentPane.add(name, comp);
	}

	@Override
	public void removeAll() {
		contentPane.removeAll();
	}

	@Override
	public void remove(Component comp) {
		contentPane.remove(comp);
	}

	@Override
	public void remove(int index) {
		contentPane.remove(index);
	}

	@Override
	public void setLayout(LayoutManager manager) {
		if (contentPane != null) {
			contentPane.setLayout(manager);
		}
	}

	public boolean isLocked() {
		return layerUI.isLocked();
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
		layerUI.setLocked(locked);
	}

	public void setFilter(BufferedImageOp... filter) {
		filters = filter;
		layerUI.setLockedEffects(new BufferedImageOpEffect(filters));
	}

	@Override
	public void setOpaque(boolean isOpaque) {
		super.setOpaque(isOpaque);
		if (rootPane != null) {
			rootPane.setOpaque(false);
		}
		if (contentPane != null && contentPane instanceof JComponent) {
			(contentPane).setOpaque(false);
		}
	}

	public static void main(String[] args) {
		JxLayeredPanel panel = new JxLayeredPanel();
		panel.setSize(600, 400);
		panel.setPreferredSize(panel.getSize());
		panel.setLayout(null);

		JButton button = new JButton("Test Button");
		button.setBounds(25, 25, 150, 150);
		panel.add(button);

		panel.setFilter(new BlurFilter(), new GrayFilter());

		panel.setLocked(true);

		SwingUtils.wrapInFrame(panel).setVisible(true);
	}
}