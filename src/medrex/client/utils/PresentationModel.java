package medrex.client.utils;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.CompoundBorderUIResource;
import javax.swing.plaf.basic.BasicBorders;

import medrex.client.utils.controls.PhoneField;
import medrex.client.utils.controls.SsnField;
import medrex.commons.intf.Controller;

import com.sX.theme.BlueOverWhiteTheme;
import com.sX.theme.Theme;
import com.toedter.calendar.JDateChooser;

public class PresentationModel {
	Map<String, JComponent> presentationMap;
	String errorMessageList;

	private Controller controller;

	private Class beanClass;

	private JLabel errorLabel;

	private static final Color DEF_COLOR = new Color(49, 104, 127);

	Object obj;

	public PresentationModel(Map<String, JComponent> map, Class beanclass,
			Controller myController, JLabel errorComponent) {
		this.beanClass = beanclass;
		controller = myController;
		presentationMap = map;
		errorLabel = errorComponent;
		registerEvents(presentationMap);
	}

	public void setErrorComponent(JLabel errorComponent) {
		errorLabel = errorComponent;
	}

	public void registerEvents() {
		registerEvents(presentationMap);
	}

	protected void registerEvents(Map map) {

		Iterator itr = map.entrySet().iterator();
		for (int i = 0; i < map.size(); i++) {
			Map.Entry entry = (Map.Entry) itr.next();
			JComponent component = (JComponent) entry.getValue();
			if (component instanceof JTextField) {
				final String str = (String) entry.getKey();
				component.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(final FocusEvent e) {
						validate(str, String.class);
					}
				});
				component.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(final KeyEvent e) {
						validate(str, String.class);
					}
				});
			}
			if (component instanceof JComboBox) {
				final String str = (String) entry.getKey();
				component.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(final FocusEvent e) {
						validate(str, String.class);

					}
				});
				((JComboBox) component).addItemListener(new ItemListener() {
					public void itemStateChanged(final ItemEvent e) {
						validate(str, String.class);

					}
				});
			}
			if (component instanceof JFormattedTextField) {
				final String str = (String) entry.getKey();
				component.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(final FocusEvent e) {
						validate(str, String.class);
					}
				});
				component.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(final KeyEvent e) {
						validate(str, String.class);
					}
				});
			}
			if (component instanceof JDateChooser) {
				final String str = (String) entry.getKey();
				JDateChooser jdc = (JDateChooser) component;
				jdc.getDateEditor().addPropertyChangeListener(
						new PropertyChangeListener() {
							public void propertyChange(PropertyChangeEvent evt) {
								validate(str, Date.class);
							}
						});
				jdc.getDateEditor().getUiComponent().addFocusListener(
						new FocusAdapter() {
							@Override
							public void focusGained(final FocusEvent e) {
								validate(str, Date.class);
							}
						});

			}
			if (component instanceof PhoneField) {
				final String str = (String) entry.getKey();
				component.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(final FocusEvent e) {
						validate(str, String.class);
					}
				});
				component.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(final KeyEvent e) {
						validate(str, String.class);
					}
				});
			}
			if (component instanceof SsnField) {
				final String str = (String) entry.getKey();
				component.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(final FocusEvent e) {
						validate(str, String.class);
					}
				});
				component.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(final KeyEvent e) {
						validate(str, String.class);
					}
				});
			}
			if (component instanceof JTextArea) {
				final String str = (String) entry.getKey();
				component.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(final FocusEvent e) {
						validate(str, String.class);
					}
				});
				component.addKeyListener(new KeyAdapter() {
					@Override
					public void keyReleased(final KeyEvent e) {
						validate(str, String.class);
					}
				});
			}
		}
	}

	public void validate(String field, Class className) {
		if (presentationMap != null) {
			JComponent component = presentationMap.get(field);
			Object bean = null;
			Method a;

			try {

				// Class cls = Class.forName(beanClassName);
				bean = beanClass.newInstance();
				if (component != null) {
					String methodName = "set"
							+ field.substring(0, 1).toUpperCase()
							+ field.substring(1);
					Class tempClassName = beanClass.getDeclaredField(field)
							.getType();
					a = beanClass.getDeclaredMethod(methodName, tempClassName);

					if (component instanceof JFormattedTextField) {

						String text = ((JFormattedTextField) component)
								.getText();
						a.invoke(bean, text);
					}
					if (component instanceof JTextField) {
						String text = ((JTextField) component).getText();
						a.invoke(bean, text);
					}
					if (component instanceof JComboBox) {
						Object text = ((JComboBox) component).getSelectedItem();
						a.invoke(bean, text);
					}
					if (component instanceof PhoneField) {
						String text = ((PhoneField) component).getNumber();
						a.invoke(bean, text);
					}
					if (component instanceof SsnField) {
						String text = ((SsnField) component).getNumber();
						a.invoke(bean, text);
					}
					if (component instanceof JDateChooser) {
						Date text = ((JDateChooser) component).getDate();
						if (text != null) {
							a.invoke(bean, text);
						}

					}
					if (component instanceof JTextArea) {
						String text = ((JTextArea) component).getText();
						a.invoke(bean, text);
					}
				}

				List<String> errorList = controller.doValidate(bean, field);

				if (component instanceof JTextField) {
					((JTextField) component).setMargin(new Insets(0, 4, 0, 0));
				}

				Theme theme = new BlueOverWhiteTheme();
				if (errorList == null || errorList.size() == 0) {
					setErrorText("");
					Border border = new CompoundBorderUIResource(
							new LineBorder(theme.getForegroundColor(component),
									1, false), new BasicBorders.MarginBorder());
					component.setBorder(border);

				} else {
					Iterator itr = errorList.iterator();
					while (itr.hasNext()) {
						String str = (String) itr.next();
						setErrorText(str);
					}
					Border border = new CompoundBorderUIResource(
							new LineBorder(Color.red, 1, false),
							new BasicBorders.MarginBorder());
					component.setBorder(border);

				}
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

	}

	public void setErrorText(String error) {
		errorLabel.setText(error);
	}

	public void validateAll() {
		for (Entry<String, JComponent> entry : presentationMap.entrySet()) {
			JComponent component = entry.getValue();
			if (component instanceof JDateChooser) {
				validate(entry.getKey(), Date.class);
			} else {

				validate(entry.getKey(), String.class);
			}

		}
	}

}
