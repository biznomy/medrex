package com.sX.swing;

/**
 * @author Davinder S Naruka
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.CaretListener;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.JTextComponent;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.richTextField.RichTextField;

import com.sX.utils.KeyEventUtils;
import com.sX.utils.ShapeUtils;

public class JxRichTextField extends JxComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8377895554360042455L;
	private float arc;
	private float scale;
	private Shape shape;
	private boolean shapeChanged;
	private Border $__border;
	private Shape i_shape;
	private JxPopupMenu popupMenu;
	private JTextComponent document;
	private JxListModel model;
	private JList popupItemList;
	private JxButton btnOptions;
	private JxPopupMenu btnOptionsMenu;
	private String RichTextFieldType = "";

	private RichTextField rtf;
	private String tempStr = "";

	public String getRichTextFieldType() {
		return RichTextFieldType;
	}

	public void setRichTextFieldType(String richTextFieldType) {
		RichTextFieldType = richTextFieldType;
	}

	public static final String ITEM_CHANGED = "ItemChanged";

	public JxRichTextField() {
		super();
		rtf = new RichTextField();
		arc = 1f;
		setLayout(null);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resize();
			}
		});

		document = new JTextField();
		document.setBounds(0, 0, getWidth() - getHeight(), getHeight());
		document.setBorder(new EmptyBorder(0, 0, 0, 0));
		document.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (isBindable()) {
					if (KeyEventUtils.isPrintable(e)
							|| e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
						String aStr = document.getText();
						tempStr = aStr;
						// System.out.println("String is :" + aStr);
						if (aStr.length() > 0 && !aStr.equalsIgnoreCase("")) {
							loadPopup(aStr);
						} else {
							// System.out.println("hide it");
							hidePopup();
						}
						/*
						 * } else if(KeyEvent.VK_ENTER == e.getKeyCode()) {
						 * System
						 * .out.println(KeyEvent.getKeyText(e.getKeyCode()));
						 * Object obj = getSelectedItem(); if(obj != null) {
						 * setText(model.toString(selectedItem)); } hidePopup();
						 * // if(obj != null) { // setText(obj.toString()); // }
						 */} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
						// if(isBindable()) {
						if (popupItemList.getModel().getSize() > 0) {
							// popupMenu.requestFocus();
							// popupMenu.getComponent(0).requestFocus();
							popupItemList.requestFocus();
							popupItemList.setSelectedIndex(0);
						}

						// }
					}
				}
			}
		});
		document.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (isBindable()) {
					String aStr = document.getText();
					loadPopup(aStr);
				}
			}
		});

		// document.addFocusListener(new FocusAdapter() {
		// public void focusLost(FocusEvent e) {
		// if(popupItemList.getModel().getSize() > 0) {
		// firePopupMenuCanceled();
		// hidePopup();
		// } else {
		// Object
		// System.out.println("Lost Focs:");
		// model.addElement(document.getText());
		// }
		// }
		// });
		// document.addAncestorListener(new AncestorListener(){
		// public void ancestorAdded(AncestorEvent event){ hidePopup();}
		// public void ancestorRemoved(AncestorEvent event){ hidePopup();}
		// public void ancestorMoved(AncestorEvent event){
		// if (event.getSource() != JxTextField.this)
		// hidePopup();
		// }});

		this.add(document, BorderLayout.CENTER);
		doBind();

		setBackground(getBackground());
		setForeground(getForeground());
		setBorder($__border);
		setFont(getFont());
	}

	/**
	 * @return the arc
	 */
	@Override
	public float getArc() {
		return arc;
	}

	/**
	 * @param arc
	 *            the arc to set
	 */
	@Override
	public void setArc(float arc) {
		this.arc = arc;
		if (btnOptions != null) {
			btnOptions.setArc(arc);
		}
	}

	protected void showPopup() {
		// if(popupMenu.getComponentCount() > 0) {
		// popupMenu.setPopupSize(new Dimension(getWidth(),40 +
		// getComponentCount() * 30));
		// popupMenu.setPreferredSize(new Dimension(getWidth(), (16 *
		// popupMenu.getComponentCount()) + 20));
		int h = (int) (popupItemList.getModel().getSize()
				* document.getPreferredSize().height + (2 * scale * arc / 3) + 10);
		if (h > 150) {
			h = 150;
		}

		popupMenu.setPreferredSize(new Dimension(getWidth(), h));
		popupMenu.setBackground(Color.WHITE);
		firePopupMenuWillBecomeVisible();
		popupMenu.setVisible(true);
		popupMenu.show(this, 0, getHeight());
		// }
		document.requestFocus();
	}

	protected void hidePopup() {
		firePopupMenuWillBecomeInvisible();
		if (popupMenu.isShowing()) {
			popupMenu.setVisible(false);
		}
	}

	protected void loadPopup(String str) {
		if (getRichTextFieldType() != null) {
			List items = model.getValues(getRichTextFieldType(), str);
			hidePopup();
			if (items != null && items.size() > 0) {
				popupItemList.setListData(new Object[] {});
				List listElemets = new ArrayList();
				// popupMenu.removeAll();
				Iterator itr = items.iterator();
				while (itr.hasNext()) {
					final Object obj = itr.next();
					/*
					 * try { final String mLbl = model.toString(obj); final
					 * JMenuItem mItem = new JMenuItem(mLbl);
					 * mItem.addActionListener(new ActionListener(){ public void
					 * actionPerformed(ActionEvent e) { setText(mLbl); } }); //
					 * mItem.addFocusListener(new FocusAdapter(){ // public void
					 * focusGained(FocusEvent e) { // mItem.setSelected(true);
					 * // System.out.println("Focus:" + mLbl); // } // }); //
					 * mItem.addItemListener(new ItemListener() { // public void
					 * itemStateChanged(ItemEvent e) { // if(e.getStateChange()
					 * == ItemEvent.SELECTED) { // setSelectedItem(obj); //
					 * System.out.println(mLbl); // } // } // }); //
					 * mItem.addKeyListener(new KeyAdapter(){ // public void
					 * keyTyped(KeyEvent e) { // if(e.getKeyCode() ==
					 * KeyEvent.VK_ENTER) { // setText(mLbl); // } // } // });
					 * popupMenu.add(mItem); } catch(Exception e) {
					 * e.printStackTrace(); continue; }
					 */
					listElemets.add(obj);
				}
				popupItemList.setListData(listElemets.toArray());
				showPopup();
			}
		}
	}

	private Object getSelectedItem() {
		Object obj = null;
		// for(int i = 0; i < popupMenu.getComponentCount(); i++) {
		// Object com = popupMenu.getComponent(i);
		// if(com instanceof JMenuItem) {
		// JMenuItem mItem = (JMenuItem) com;
		// if(mItem.isSelected()) {
		// return mItem.getText();
		// }
		// }
		// }
		obj = popupItemList.getSelectedValue();
		return obj;
	}

	@Override
	public void paint(Graphics g) {
		super.setOpaque(false);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		shape = getShape();
		i_shape = getInnerShape();

		g2.setColor(this.getBackground());
		g2.fill(i_shape);

		// super paint
		// g2.clip(shape);
		int margin = (int) Math.ceil((30f / 50f) * getFont().getSize2D() * arc
				/ 3);
		// System.out.println(margin);
		super.setBorder(new EmptyBorder(margin, margin, margin, margin));
		super.paint(g2);

		// draw line border
		if (this.getBorderColor() != null) {
			g2.setColor(this.getBorderColor());
			g2.draw(i_shape);
		}
	}

	private Shape getInnerShape() {
		if (i_shape == null || shapeChanged) {
			i_shape = ShapeUtils.getRoundedRectangle2D(0, 0, getWidth() - 1,
					getHeight() - 1, arc * scale, arc * scale);
		}
		return i_shape;
	}

	@Override
	public Shape getShape() {
		if (shape == null || shapeChanged) {
			shape = ShapeUtils.getRoundedRectangle2D(0, 0, getWidth(),
					getHeight(), arc * scale, arc * scale);
			shapeChanged = false;
		}
		return shape;
	}

	@Override
	public Border getBorder() {
		return null;
	}

	@Override
	public void setBorder(Border border) {
		super.setBorder(null);
		$__border = border;
		if (btnOptions != null) {
			btnOptions.setBorder($__border);
		}
		if (popupMenu != null) {
			popupMenu.setBorder($__border);
		}
		if (btnOptionsMenu != null) {
			btnOptionsMenu.setBorder($__border);
		}
	}

	protected Color getBorderColor() {
		Border border = $__border;
		if (border instanceof LineBorder) {
			return ((LineBorder) border).getLineColor();
		}
		return null;
	}

	@Override
	public void setFont(Font f) {
		super.setFont(f);
		scale = (50f / 30f) * f.getSize2D();
		if (document != null) {
			document.setFont(f);
		}
		if (popupMenu != null) {
			popupMenu.setFont(f);
		}
		if (btnOptions != null) {
			btnOptions.setFont(f);
		}
		if (btnOptionsMenu != null) {
			btnOptionsMenu.setFont(f);
		}
		if (popupItemList != null) {
			popupItemList.setFont(f);
		}
	}

	@Override
	public void setBackground(Color bg) {
		super.setBackground(bg);
		if (document != null) {
			document.setBackground(bg);
		}
		if (popupMenu != null) {
			popupMenu.setBackground(bg);
		}
		if (btnOptions != null) {
			btnOptions.setBackground(bg);
		}
		if (btnOptionsMenu != null) {
			btnOptionsMenu.setBackground(bg);
		}
		if (popupItemList != null) {
			popupItemList.setBackground(bg);
		}
	}

	@Override
	public void setForeground(Color fg) {
		super.setForeground(fg);
		if (document != null) {
			document.setForeground(fg);
		}
		if (popupMenu != null) {
			popupMenu.setForeground(fg);
		}
		if (btnOptions != null) {
			btnOptions.setForeground(fg);
		}
		if (btnOptionsMenu != null) {
			btnOptionsMenu.setForeground(fg);
		}
		if (popupItemList != null) {
			popupItemList.setForeground(fg);
		}
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		super.setBounds(x, y, width, height);
		resize();
	}

	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		resize();
	}

	@Override
	public void setEnabled(boolean enabled) {
		super.setEnabled(enabled);

		if (document != null) {
			document.setFocusable(enabled);
		}
		if (btnOptions != null) {
			btnOptions.setFocusable(enabled);
			btnOptions.setEnabled(enabled);
			btnOptions.setBackground(this.getBackground());
			btnOptions.setForeground(this.getForeground());
		}
	}

	private void resize() {
		if (btnOptions != null) {
			// System.out.println("Height: " + height);
			// btnOptions.setSize(new Dimension(height, height + 4));
			// btnOptions.setPreferredSize(new Dimension(height, height + 4));
			document.setBounds(1, 1, getWidth() - getHeight(), getHeight());
			btnOptions.setBounds(getWidth() - getHeight() + 1, 0, getHeight(),
					getHeight() + 2);
		}
	}

	protected boolean isBindable() {
		if (model instanceof BindableListModelNew) {
			return true;
		}
		return false;
	}

	protected void doBind() {
		if (isBindable()) {
			btnOptionsMenu = new JxPopupMenu();
			btnOptionsMenu.setArc(arc);
			btnOptionsMenu.setBackground(this.getBackground());
			btnOptionsMenu.setForeground(this.getForeground());
			btnOptionsMenu.setBorder($__border);
			btnOptionsMenu.setFont(this.getFont());

			btnOptions = new JxButton();
			btnOptions.setArc(arc);
			btnOptions.setText("O");
			btnOptions.setBounds(getWidth() - getHeight() + 1, 0, getHeight(),
					getHeight() + 2);
			btnOptions.setHorizontalAlignment(SwingConstants.CENTER);
			btnOptions.setBorder($__border);
			btnOptions.setBackground(this.getBackground());
			btnOptions.setForeground(this.getForeground());
			btnOptions.setFont(this.getFont());
			btnOptions.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (btnOptionsMenu.isShowing()
							|| btnOptionsMenu.isVisible()) {
						hideOptions();
					} else {
						showOptions();
					}
				}
			});
			this.add(btnOptions, BorderLayout.EAST);

			popupMenu = new JxPopupMenu();
			popupMenu.setArc(arc);
			popupMenu.setBackground(this.getBackground());
			popupMenu.setForeground(this.getForeground());
			popupMenu.setBorder($__border);
			popupMenu.setFont(this.getFont());

			// popupMenu.addPopupMenuListener(new PopupMenuListener() {
			// public void popupMenuCanceled(PopupMenuEvent e) {
			//					
			// }
			// public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
			//					
			// }
			// public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			//					
			// }
			// });

			popupItemList = new JList();
			popupItemList.setCellRenderer(new DefaultListCellRenderer() {
				@Override
				public Component getListCellRendererComponent(JList list,
						Object value, int index, boolean isSelected,
						boolean cellHasFocus) {
					JLabel com = (JLabel) super.getListCellRendererComponent(
							list, value, index, isSelected, cellHasFocus);
					com.setText(model.toString(value));
					return com;
				}
			});
			popupItemList.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					// JxTextField.this.requestFocus();
					if (e.getKeyCode() == MenuKeyEvent.VK_ENTER) {
						// System.out.println(KeyEvent.getKeyText(e.getKeyCode())
						// + " :: Enter key on Jlist");
						Object obj = getSelectedItem();
						if (obj != null) {
							JxRichTextField.this.document.setText(model
									.toString(obj));
							fireObjectChanged();
							hidePopup();
						}
					}
				}
			});
			popupItemList.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Object obj = getSelectedItem();
					if (obj != null) {
						JxRichTextField.this.document.setText(model
								.toString(obj));
						fireObjectChanged();
						hidePopup();
					}
				}
			});
			popupItemList.setAutoscrolls(true);
			popupItemList.setBackground(this.getBackground());
			popupItemList.setForeground(this.getForeground());
			popupItemList.setFont(this.getFont());

			final JScrollPane scroll = new JScrollPane();
			scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
			scroll.setViewportBorder(new EmptyBorder(0, 0, 0, 0));
			scroll
					.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scroll.setViewportView(popupItemList);

			// setComponentPopupMenu(popupMenu);
			popupMenu.setLayout(new BorderLayout());
			popupMenu.add(scroll);

			resize();
		}
	}

	private void fireObjectChanged() {
		firePropertyChange(ITEM_CHANGED, null, getSelectedItem());
	}

	public void fireObjectChanged(Object obj) {
		firePropertyChange(ITEM_CHANGED, null, obj);
	}

	protected void showOptions() {
		if (btnOptionsMenu != null) {
			btnOptionsMenu.removeAll();
			btnOptionsMenu.setBackground(this.getBackground());
			btnOptionsMenu.setForeground(this.getForeground());
			btnOptionsMenu.setBorder($__border);

			final BindableListModelNew bindableModel = (BindableListModelNew) model;
			JMenuItem mItem = null;
			if (bindableModel.isViewAllowable()) {
				mItem = new JMenuItem("View", null);
				mItem.setFont(this.getFont());
				mItem.setForeground(this.getForeground());
				mItem.setBackground(this.getBackground());
				btnOptionsMenu.add(mItem);
			}
			if (bindableModel.isAddAllowable()) {
				mItem = new JMenuItem("Add", null);
				mItem.setFont(this.getFont());
				mItem.setForeground(this.getForeground());
				mItem.setBackground(this.getBackground());
				mItem.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (document.getText() != null
								&& !document.getText().equalsIgnoreCase("")) {
							bindableModel.addElement(document.getText());
						}
					}
				});
				if (document.getText() != null
						&& !document.getText().equalsIgnoreCase("")) {
					mItem.setEnabled(true);
				} else {
					mItem.setEnabled(false);
				}
				btnOptionsMenu.add(mItem);
			}
			if (bindableModel.isEditAllowable()) {
				mItem = new JMenuItem("Edit", null);
				mItem.setFont(this.getFont());
				mItem.setForeground(this.getForeground());
				mItem.setBackground(this.getBackground());
				btnOptionsMenu.add(mItem);
			}
			if (bindableModel.isDeleteAllowable()) {
				mItem = new JMenuItem("Delete", null);
				mItem.setFont(this.getFont());
				mItem.setForeground(this.getForeground());
				mItem.setBackground(this.getBackground());
				btnOptionsMenu.add(mItem);
			}
		}
		int h = (int) (btnOptionsMenu.getComponentCount()
				* document.getPreferredSize().height + (2 * scale * arc / 3) + 10);
		if (h > 150) {
			h = 150;
		}
		btnOptionsMenu.setPreferredSize(new Dimension(btnOptionsMenu
				.getPreferredSize().width, h));

		btnOptionsMenu.setAlignmentX(JxPopupMenu.RIGHT_ALIGNMENT);
		btnOptionsMenu.show(btnOptions, 0, getHeight());
	}

	protected void hideOptions() {
		if (btnOptionsMenu.isShowing()) {
			btnOptionsMenu.setVisible(false);
		}
	}

	public JxListModel getModel() {
		return model;
	}

	public void setModel(JxListModel model) {
		this.model = model;
		doBind();
	}

	public void firePopupMenuCanceled() {
		PopupMenuEvent e = new PopupMenuEvent(popupMenu);
		PopupMenuListener[] l = popupMenu.getPopupMenuListeners();
		for (int i = 0; i < l.length; i++) {
			l[i].popupMenuCanceled(e);
		}
	}

	public void firePopupMenuWillBecomeInvisible() {
		PopupMenuEvent e = new PopupMenuEvent(popupMenu);
		PopupMenuListener[] l = popupMenu.getPopupMenuListeners();
		for (int i = 0; i < l.length; i++) {
			l[i].popupMenuWillBecomeInvisible(e);
		}
	}

	public void firePopupMenuWillBecomeVisible() {
		PopupMenuEvent e = new PopupMenuEvent(popupMenu);
		PopupMenuListener[] l = popupMenu.getPopupMenuListeners();
		for (int i = 0; i < l.length; i++) {
			l[i].popupMenuWillBecomeVisible(e);
		}
	}

	@Override
	public synchronized void addInputMethodListener(InputMethodListener l) {
		document.addInputMethodListener(l);
	}

	@Override
	public synchronized void addKeyListener(KeyListener l) {
		document.addKeyListener(l);
	}

	public synchronized void addCaretListener(CaretListener l) {
		document.addCaretListener(l);
	}

	public String getText() {
		return document.getText();
	}

	public void setText(String txt) {
		document.setText(txt);
	}

	public RichTextField getField() {
		return rtf;
	}

	public void setField(RichTextField rtf) {
		this.rtf = rtf;
		if (this.rtf != null) {
			document.setText(this.rtf.getRtfName());
		} else {
			setField(new RichTextField());
		}
	}

	public void setRichTextFieldModel(final JxRichTextField txtRichTextField,
			final String string) {
		rtf = new RichTextField();
		String rtfType = string;
		rtf.setRtfName(txtRichTextField.getText());
		rtf.setRtfType(rtfType);
		txtRichTextField.setRichTextFieldType(string);
		txtRichTextField
				.setModel(new AbstractBindableListModelNew<String, RichTextField>() {
					@Override
					public void addElement(String key) {
						rtf.setRtfName(key);
						rtf.setRtfType(string);
						try {
							if (!(key.equalsIgnoreCase("")) && key != null) {
								MedrexClientManager.getInstance()
										.insertOrUpdateRichTextFieldValue(rtf);
							}
						} catch (MedrexException me) {
							JOptionPane
									.showMessageDialog(null, me.getMessage());
							// e.printStackTrace();
						} catch (RemoteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						txtRichTextField.setField(rtf);
					}

					@Override
					public List<RichTextField> getValues(String rtfType,
							String key) {
						this.records = null;
						try {
							this.records = MedrexClientManager.getInstance()
									.getRichTextFieldValues(rtfType, key);
						} catch (Exception e) {
							e.printStackTrace();
						}
						return this.records;
					}

					@Override
					public String toString(RichTextField val) {
						return val.getRtfName();
					}

				});
	}

	public void setRichTextFieldData(final String string) {
		rtf = new RichTextField();
		rtf.setRtfName(document.getText());
		rtf.setRtfType(string);
		System.out.println("not Blank" + rtf.getRtfName());
		try {
			if (!(document.getText().equalsIgnoreCase(""))
					&& document.getText() != null) {
				MedrexClientManager.getInstance()
						.insertOrUpdateRichTextFieldValue(rtf);
			}
		} catch (MedrexException me) {
			// JOptionPane.showMessageDialog(null, string + " " +
			// me.getMessage());
			// e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// txtRichTextField.setField(rtf);
	}

	// public int getId() {
	// int id =
	// MedrexClientManager.getInstance().getRichTextFieldId(document.getText());
	// return id;
	// }
	/*
	 * public static void main(String[] args) { try {
	 * UIManager.setLookAndFeel(new Plastic3DLookAndFeel()); } catch
	 * (UnsupportedLookAndFeelException e) { e.printStackTrace(); } final JFrame
	 * frame = new JFrame("Testing JxTextField");
	 * frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	 * frame.setBounds(0,0,240, 305); Dimension sSize =
	 * Toolkit.getDefaultToolkit().getScreenSize(); Rectangle sBounds = new
	 * Rectangle(0,0,sSize.width, sSize.height);
	 * 
	 * frame.setBounds(SwingUtils.centerRectangle(sBounds, frame.getBounds()));
	 * 
	 * AdmissionFromHeadListModel bindModel = new AdmissionFromHeadListModel();
	 * 
	 * JxTextField txtCom = new JxTextField(); txtCom.setBorder(new
	 * LineBorder(Color.BLUE, 1, false)); txtCom.setBounds(20, 20, 200, 21);
	 * txtCom.setArc(0.4f); // txtCom.setText("Dummy Text");
	 * txtCom.setModel(bindModel);
	 * 
	 * final JPanel panel = new JPanel(); panel.setLayout(null);
	 * panel.setBackground(new Color(200,88,55)); panel.addMouseListener(new
	 * MouseAdapter(){ public void mouseClicked(MouseEvent e) {
	 * panel.requestFocus(); } }); panel.add(txtCom);
	 * 
	 * // frame.getContentPane().setLayout(null); //
	 * frame.getContentPane().addMouseListener(new MouseAdapter(){ // public
	 * void mouseClicked(MouseEvent e) { //
	 * frame.getContentPane().requestFocus(); // } // }); //
	 * frame.getContentPane().add(txtCom); frame.getContentPane().add(panel);
	 * frame.setVisible(true); }
	 */
}

/*
 * class AdmissionFromHeadListModel extends BindableListModel<String,
 * AdmissionFromHead> { List<AdmissionFromHead> records;
 * 
 * public AdmissionFromHeadListModel() { records = new
 * ArrayList<AdmissionFromHead>(); try {
 * AdmissionFromHeadDAO.getInstance().getAdmissionFromHeads(""); } catch
 * (MedrexException e) { // e.printStackTrace(); } }
 * 
 * public AdmissionFromHead getElementAt(int index) { if(records == null) return
 * null; else { if(index >= 0 && index < records.size()) { return
 * records.get(index); } else { throw new
 * IllegalArgumentException("Invalid index: " + index); } } }
 * 
 * public int getSize() { if(records == null) return 0; else return
 * records.size(); }
 * 
 * public List<AdmissionFromHead> getValues(String key) { records = null; try {
 * records = AdmissionFromHeadDAO.getInstance().getAdmissionFromHeads(key +
 * "%"); } catch (MedrexException e) { e.printStackTrace(); } return records; }
 * 
 * public String toString(AdmissionFromHead val) { return val.getName(); }
 * 
 * public void addElement(String key) { AdmissionFromHead ref = new
 * AdmissionFromHead(); ref.setName(key); try { List tmpList =
 * AdmissionFromHeadDAO.getInstance().getAdmissionFromHeads(key); if(tmpList ==
 * null || tmpList.size() == 0) {
 * AdmissionFromHeadDAO.getInstance().insertOrUpdateAdmissionFromHead(ref); } }
 * catch (Exception e) { e.printStackTrace(); } }
 * 
 * public void addListDataListener(ListDataListener l) { } public void
 * removeListDataListener(ListDataListener l) { }
 * 
 * public boolean isAddAllowable() { return true; }
 * 
 * public boolean isDeleteAllowable() { return false; }
 * 
 * public boolean isEditAllowable() { return false; }
 * 
 * public boolean isViewAllowable() { return false; } }
 */