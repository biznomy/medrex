package com.sX.beaneditor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;

public final class BeanEditor {
	private Object bean;
	private Class classOfBean;
	private Map<Field, EditorField> fieldMap;

	private BeanEditor(Object bean) throws SecurityException,
			NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		fieldMap = new HashMap<Field, EditorField>();
		setBean(bean);
	}

	public static BeanEditor getInstance(Object bean) throws SecurityException,
			NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		return new BeanEditor(bean);
	}

	private void parseBean() {
		classOfBean = bean.getClass();
		Field[] declaredFields = classOfBean.getDeclaredFields();

		fieldMap.clear();
		try {
			for (int i = 0; i < declaredFields.length; i++) {
				Field curField = declaredFields[i];
				if (!curField.getName().contains("serialVersionUID")) {
					Method accessor;
					accessor = getAccessor(curField);
					Method mutator = getMutator(curField);
					EditorField editField = new EditorField(curField, accessor,
							mutator);
					fieldMap.put(curField, editField);
				}
			}
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	private Method getAccessor(Field field) throws SecurityException,
			NoSuchMethodException {
		return classOfBean.getMethod(EditorUtils.getFieldName(field,
				EditorUtils.FIELD_ACCESSORNAME));
	}

	private Method getMutator(Field field) throws SecurityException,
			NoSuchMethodException {
		return classOfBean.getMethod(EditorUtils.getFieldName(field,
				EditorUtils.FIELD_MUTATORNAME), field.getType());
	}

	public void setFieldLabel(String name, String label) {
		try {
			Field f = classOfBean.getDeclaredField(name);
			if (f != null) {
				EditorField editField = fieldMap.get(f);
				editField.setLabel(label);
			}
		} catch (SecurityException e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (NoSuchFieldException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void setFieldComponent(String name, JComponent component) {
		try {
			Field f = classOfBean.getDeclaredField(name);
			if (f != null) {
				EditorField editField = fieldMap.get(f);
				editField.setComponent(component);
				// editField.set
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void setFieldComponent(String name, JComponent component,
			String componentAccesor, String componentMutator,
			Class componentCommunicationDataType) {
		try {
			Field f = classOfBean.getDeclaredField(name);
			if (f != null) {
				EditorField editField = fieldMap.get(f);
				Method accessor = component.getClass().getMethod(
						componentAccesor);
				Method mutator = component.getClass().getMethod(
						componentMutator, componentCommunicationDataType);
				editField.setComponent(component, accessor, mutator,
						componentCommunicationDataType);
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public void setFieldVisible(String name, boolean visible) {
		try {
			Field f = classOfBean.getDeclaredField(name);
			if (f != null) {
				EditorField editField = fieldMap.get(f);
				editField.setVisible(visible);
			}
		} catch (Exception e) {
			// throw new IllegalArgumentException(e.getMessage());
			e.printStackTrace();
		}
	}

	public void setBean(Object bean) {
		this.bean = bean;
		parseBean();
		try {
			setValues();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (InvocationTargetException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
	}

	public Object getBean() {
		try {
			getValues();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (InvocationTargetException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		return this.bean;
	}

	public Object getValue(String name) throws SecurityException,
			NoSuchFieldException {
		Field field = classOfBean.getDeclaredField(name);
		EditorField editField = fieldMap.get(field);
		return editField.getValue();
	}

	public void setValue(String name, Object sValue) throws SecurityException,
			NoSuchFieldException {
		Field field = classOfBean.getDeclaredField(name);
		EditorField editField = fieldMap.get(field);
		editField.setValue(sValue);
	}

	void setValues() throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		EditorField[] fields = new EditorField[] {};
		fields = fieldMap.values().toArray(fields);

		for (int i = 0; i < fields.length; i++) {
			Object sValue = fields[i].getAccessor().invoke(this.bean);
			fields[i].setValue(sValue);
		}
	}

	void getValues() throws IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		EditorField[] fields = new EditorField[] {};
		fields = fieldMap.values().toArray(fields);

		for (int i = 0; i < fields.length; i++) {
			Object sValue = fields[i].getValue();
			// if(fields[i].getField().getType() == long.class) {
			// fields[i].getMutator().invoke(this.bean,
			// Long.parseLong(sValue.toString()));
			// } else if(fields[i].getField().getType() == int.class) {
			// fields[i].getMutator().invoke(this.bean,
			// Integer.parseInt(sValue.toString()));
			// } else if(fields[i].getField().getType() == short.class) {
			// fields[i].getMutator().invoke(this.bean,
			// Short.parseShort(sValue.toString()));
			// } else if(fields[i].getField().getType() == byte.class) {
			// fields[i].getMutator().invoke(this.bean,
			// Byte.parseByte(sValue.toString()));
			// } else if(fields[i].getField().getType() == double.class) {
			// fields[i].getMutator().invoke(this.bean,
			// Double.parseDouble(sValue.toString()));
			// } else if(fields[i].getField().getType() == float.class) {
			// fields[i].getMutator().invoke(this.bean,
			// Float.parseFloat(sValue.toString()));
			// } else if(fields[i].getField().getType() == boolean.class) {
			// fields[i].getMutator().invoke(this.bean,
			// Boolean.parseBoolean(sValue.toString()));
			// } else{
			fields[i].getMutator().invoke(this.bean, sValue);
			// }
		}
	}

	public JPanel getPanel() {
		EditorField[] fields = new EditorField[] {};
		fields = fieldMap.values().toArray(fields);
		return EditorUtils.getPanel(fields);
	}

	public JFrame getFrame() {
		EditorField[] fields = new EditorField[] {};
		fields = fieldMap.values().toArray(fields);
		return EditorUtils.getFrame(this, fields);
	}

	public JDialog getDialog() {
		EditorField[] fields = new EditorField[] {};
		fields = fieldMap.values().toArray(fields);
		return EditorUtils.getDialog(this, fields);
	}

	public static void main(String[] args) {
		System.out.println(EditorUtils.getDefaultLabel("serial"));
		System.out.println(EditorUtils.getDefaultLabel("partyName"));
		System.out.println(EditorUtils.getDefaultLabel("partyRelationship"));
		System.out.println(EditorUtils.getDefaultLabel("getMeAFormOfMDS"));
		System.out.println(EditorUtils.getDefaultLabel("whatCanIDoForYou"));
		System.out.println(EditorUtils
				.getDefaultLabel("isThisCorrectToWriteLikeThis"));
	}
}

class EditorField {
	private String label;
	private Class classOfField;
	private JComponent component;
	private final Field field;
	private Method getter;
	private Method setter;
	private Method comGetter;
	private Method comSetter;
	private Class comDealType;
	private boolean visible;

	public EditorField(Field field, Method accessor, Method mutator)
			throws SecurityException, NoSuchMethodException {
		if (field != null) {
			this.field = field;
			this.getter = accessor;
			this.setter = mutator;
			this.visible = true;
			reset();
		} else {
			throw new IllegalArgumentException(
					"Argument field must not be null.");
		}
	}

	private void reset() throws SecurityException, NoSuchMethodException {
		classOfField = field.getType();
		setComponent(getComponent(classOfField));
		label = getLabel(field);
	}

	public Field getField() {
		return field;
	}

	public Method getAccessor() {
		return this.getter;
	}

	public Method getMutator() {
		return this.setter;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setComponent(JComponent component) throws SecurityException,
			NoSuchMethodException {
		this.component = component;
		this.comGetter = getComponentAccessor(component.getClass());
		this.comSetter = getComponentMutator(component.getClass());
		this.comDealType = getComponentDealingType(component.getClass());
	}

	public void setComponent(JComponent component, Method componentAccessor,
			Method componentMutator, Class componentCommunicationDataType) {
		this.component = component;
		this.comGetter = componentAccessor;
		this.comSetter = componentMutator;
		this.comDealType = componentCommunicationDataType;
	}

	public JComponent getComponent() {
		return component;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isVisible() {
		return visible;
	}

	public Object getValue() throws IllegalArgumentException {
		Object retObj = null;
		try {
			retObj = comGetter.invoke(component);
			retObj = getCastedObject(classOfField, retObj);
		} catch (IllegalArgumentException e) {
			throw e;
		} catch (IllegalAccessException e) {
			throw new IllegalArgumentException(e.getMessage());
		} catch (InvocationTargetException e) {
			throw new IllegalArgumentException(e.getMessage());
		}
		return retObj;
	}

	public Object setValue(Object sValue) throws IllegalArgumentException {
		Object retObj = null;
		if (sValue != null) {
			try {
				retObj = comSetter.invoke(component, getCastedObject(
						comDealType, sValue));
			} catch (IllegalArgumentException e) {
				throw e;
			} catch (IllegalAccessException e) {
				throw new IllegalArgumentException(e.getMessage());
			} catch (InvocationTargetException e) {
				throw new IllegalArgumentException(e.getMessage());
			}
		}
		return retObj;
	}

	private static Object getCastedObject(Class castTo, Object obj) {
		System.out.println(obj.getClass() + " to " + castTo);
		if (castTo == String.class) {
			return obj.toString();
		} else if (castTo == Long.class || castTo == long.class) {
			return Long.parseLong(obj.toString());
		} else if (castTo == Integer.class || castTo == int.class) {
			return Integer.parseInt(obj.toString());
		} else if (castTo == Short.class || castTo == short.class) {
			return Short.parseShort(obj.toString());
		} else if (castTo == Byte.class || castTo == byte.class) {
			return Byte.parseByte(obj.toString());
		} else if (castTo == Double.class || castTo == double.class) {
			return Double.parseDouble(obj.toString());
		} else if (castTo == Float.class || castTo == float.class) {
			return Float.parseFloat(obj.toString());
		} else if (castTo == Boolean.class || castTo == boolean.class) {
			return Boolean.parseBoolean(obj.toString());
		} else {
			return castTo.cast(obj);
		}
	}

	static String getLabel(Field field) {
		return EditorUtils.getFieldName(field, EditorUtils.FIELD_DEFAULTLABEL);
	}

	static JComponent getComponent(Class clss) {
		// System.out.println("Class: " + clss);
		if (clss == java.util.Date.class) {
			return new JDateChooser();
		} else if (clss == java.lang.Long.class
				|| clss == java.lang.Integer.class
				|| clss == java.lang.Short.class
				|| clss == java.lang.Byte.class || clss == long.class
				|| clss == int.class || clss == short.class
				|| clss == byte.class) {
			return new JTextField();
		} else if (clss == java.lang.Double.class
				|| clss == java.lang.Float.class || clss == double.class
				|| clss == float.class) {
			return new JTextField();
		} else if (clss == java.lang.String.class
				|| clss == java.lang.Character.class || clss == char.class) {
			return new JTextField();
		} else if (clss == java.lang.Boolean.class || clss == boolean.class) {
			return new JCheckBox();
		}
		return null;
	}

	static Class getComponentDealingType(Class clss) {
		// System.out.println("Class: " + clss);
		if (clss == JDateChooser.class) {
			return java.util.Date.class;
		} else if (clss == JTextField.class
				|| clss == JFormattedTextField.class
				|| clss == java.awt.TextField.class
				|| clss == java.awt.TextComponent.class
				|| clss == javax.swing.text.JTextComponent.class) {
			return String.class;
		} else if (clss == javax.swing.JCheckBox.class
				|| clss == java.awt.Checkbox.class
				|| clss == javax.swing.JRadioButton.class) {
			return boolean.class;
		}
		return null;
	}

	static Method getComponentAccessor(Class clss) throws SecurityException,
			NoSuchMethodException {
		// System.out.println("Class: " + clss);
		if (clss == JDateChooser.class) {
			return clss.getMethod("getDate");
		} else if (clss == JTextField.class
				|| clss == JFormattedTextField.class
				|| clss == java.awt.TextField.class
				|| clss == java.awt.TextComponent.class
				|| clss == javax.swing.text.JTextComponent.class) {
			return clss.getMethod("getText");
		} else if (clss == javax.swing.JCheckBox.class
				|| clss == java.awt.Checkbox.class
				|| clss == javax.swing.JRadioButton.class) {
			return clss.getMethod("isSelected");
		}
		return null;
	}

	static Method getComponentMutator(Class clss) throws SecurityException,
			NoSuchMethodException {
		// System.out.println("Class: " + clss);
		if (clss == JDateChooser.class) {
			return clss.getMethod("setDate", Date.class);
		} else if (clss == JTextField.class
				|| clss == JFormattedTextField.class
				|| clss == java.awt.TextField.class
				|| clss == java.awt.TextComponent.class
				|| clss == javax.swing.text.JTextComponent.class) {
			return clss.getMethod("setText", String.class);
		} else if (clss == javax.swing.JCheckBox.class
				|| clss == java.awt.Checkbox.class
				|| clss == javax.swing.JRadioButton.class) {
			return clss.getMethod("setSelected", boolean.class);
		}
		return null;
	}
}

class EditorUtils {
	public final static int FIELD_SIMPLENAME = 0;
	public final static int FIELD_LONGNAME = 1;
	public final static int FIELD_ACCESSORNAME = 4;
	public final static int FIELD_MUTATORNAME = 5;
	public final static int FIELD_DEFAULTLABEL = 8;

	public static JPanel getPanel(EditorField[] fields) {
		JPanel panel = new JPanel();

		GridLayout layout = new GridLayout(0, 2);
		layout.setHgap(2);
		layout.setVgap(2);
		panel.setLayout(layout);

		int i = 0;
		for (i = 0; i < fields.length; i++) {
			if (fields[i].getComponent() != null && fields[i].isVisible()) {
				panel.add(new JLabel(fields[i].getLabel()));
				panel.add(fields[i].getComponent());
			}
		}
		panel.setPreferredSize(new Dimension(302, (i) * 22));
		return panel;
	}

	public static JFrame getFrame(final BeanEditor editor, EditorField[] fields) {
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(2, 2));

		JPanel panel = getPanel(fields);
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		Dimension size = panel.getPreferredSize();
		frame.setSize(size.width + 20, size.height + 80);
		((JPanel) frame.getContentPane()).setBorder(new EmptyBorder(10, 10, 10,
				10));

		JPanel btnPanel = new JPanel();
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		btnPanel.setLayout(layout);
		frame.getContentPane().add(btnPanel, BorderLayout.SOUTH);

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					editor.getValues();
				} catch (IllegalArgumentException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					e1.printStackTrace();
				}
				frame.dispose();
			}
		});
		btnPanel.add(btnOk);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnPanel.add(btnCancel);

		return frame;
	}

	public static JDialog getDialog(final BeanEditor editor,
			EditorField[] fields) {
		final JDialog dialog = new JDialog();
		dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		dialog.setModal(true);
		dialog.getContentPane().setLayout(new BorderLayout(2, 2));

		JPanel panel = getPanel(fields);
		dialog.getContentPane().add(panel, BorderLayout.CENTER);

		Dimension size = panel.getPreferredSize();
		dialog.setSize(size.width + 20, size.height + 80);
		((JPanel) dialog.getContentPane()).setBorder(new EmptyBorder(10, 10,
				10, 10));

		JPanel btnPanel = new JPanel();
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT);
		btnPanel.setLayout(layout);
		dialog.getContentPane().add(btnPanel, BorderLayout.SOUTH);

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					editor.getValues();
				} catch (IllegalArgumentException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					e1.printStackTrace();
				}
				dialog.dispose();
			}
		});
		btnPanel.add(btnOk);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
			}
		});
		btnPanel.add(btnCancel);

		return dialog;
	}

	public static String getFieldName(Field field, int type) {
		String name = field.getName();
		switch (type) {
		case FIELD_SIMPLENAME:
			return name;
		case FIELD_LONGNAME:
			return field.getDeclaringClass().getName() + "." + name;
		case FIELD_ACCESSORNAME:
			return "get" + (name.charAt(0) + "").toUpperCase()
					+ name.substring(1);
		case FIELD_MUTATORNAME:
			return "set" + (name.charAt(0) + "").toUpperCase()
					+ name.substring(1);
		case FIELD_DEFAULTLABEL:
			return getDefaultLabel(name);
		default:
			return null;
		}
	}

	public static String getDefaultLabel(String lbl) {
		String retStr = null;
		if (lbl != null || lbl.length() > 0) {
			String[] strParts = lbl.split("[A-Z]");
			if (strParts.length > 0) {
				for (int i = 0, ctr = 0; i < strParts.length; i++) {
					if (i == 0) {
						retStr = (strParts[i].charAt(0) + "").toUpperCase()
								+ strParts[i].substring(1);
						ctr += strParts[i].length();
					} else {
						if (strParts[i].length() > 0) {
							retStr += strParts[i];
							ctr += strParts[i].length();
						}
					}
					if (retStr.length() > 0 && ctr < lbl.length()) {
						retStr += " " + lbl.charAt(ctr);
						ctr++;
					}
				}
				// } else {
				// retStr = (strParts[0].charAt(0) + "").toUpperCase() +
				// strParts[0].substring(1);
			}
		}
		return retStr;
	}
}