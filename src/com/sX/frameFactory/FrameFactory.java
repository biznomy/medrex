package com.sX.frameFactory;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.util.Stack;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class FrameFactory {
	private static FrameFactory obj;
	private Stack<Window> stackFrame = new Stack<Window>();
	private static int root = 0;
	private static Boolean traverse = false;

	private FrameFactory() {
	}

	public static synchronized FrameFactory getInstance() {
		if (obj == null) {
			obj = new FrameFactory();
		}
		return obj;
	}

	// public static JFrame createFrame(Object newInstance){
	// final JFrame frame = new JFrame();
	// addInStack(frame);
	// frame.addWindowListener(new WindowAdapter(){
	// public void windowClosing(WindowEvent e) {
	// stackFrame.pop();
	// }
	// });
	// frame.addWindowFocusListener(new WindowFocusListener(){
	//				
	// public void windowGainedFocus(WindowEvent e) {
	// // System.out.println("Frame Focus Gained");
	// int pos=stackFrame.search(frame);
	// getFocusHeirarchicallyUp(stackFrame.size() - pos);
	// }
	// public void windowLostFocus(WindowEvent e) {
	// }
	// });
	// return frame;
	// }
	// public static JDialog createDialog(){
	// final JDialog dialog = new JDialog();
	// dialog.setModal(false);
	// addInStack(dialog);
	//		
	// dialog.addWindowListener(new WindowAdapter(){
	// public void windowClosing(WindowEvent e) {
	// stackFrame.pop();
	// }
	// });
	// dialog.addWindowFocusListener(new WindowFocusListener(){
	// public void windowGainedFocus(WindowEvent e) {
	// // System.out.println("Dialog Focus Gained");
	// int pos=stackFrame.search(dialog);
	// getFocusHeirarchicallyUp(stackFrame.size() - pos);
	// }
	// public void windowLostFocus(WindowEvent e) {
	//				
	// }
	//		
	// });
	// return dialog;
	// }
	public synchronized static void addInStack(Object obj) {
		// System.out.println("\nPushing in Stack: sIndex:" +
		// getInstance().stackFrame.search(obj)+" win:"+ obj);
		if (getInstance().stackFrame.search(obj) == -1) {
			getInstance().stackFrame.push((Window) obj);
			// System.out.println("StackFrame size is: " +
			// getInstance().stackFrame.size());
			// for(Window w : getInstance().stackFrame){
			// System.out.println("Win: "+w);
			// }
		}
	}

	public synchronized static void removeFromStack(Object obj) {
		// System.out.println("Poping from Stack: sIndex:" +
		// getInstance().stackFrame.search(obj)+" win:"+ obj);
		if (getInstance().stackFrame.search(obj) > 0) {
			getInstance().stackFrame.remove(obj);
			// System.out.println("StackFrame size is:"+getInstance().stackFrame.size());
			// for(Window w : getInstance().stackFrame){
			// System.out.println("Win: "+w);
			// }
		}
		// System.out.println("-------------------------------------------------------\n");
	}

	public synchronized static void getFocusHeirarchicallyUp(int pos) {
		Object obj = null;

		// System.out.print("stack size"+stackFrame.size());
		// System.out.println("Position"+pos);
		if (pos + 1 == getInstance().stackFrame.size()) {
			traverse = false;
		}
		if (pos + 1 < getInstance().stackFrame.size()) {
			obj = getInstance().stackFrame.get(pos + 1);

			if (obj instanceof JFrame) {
				((JFrame) obj).requestFocusInWindow();
				((JFrame) obj).requestFocus();
			} else if (obj instanceof JDialog) {
				((JDialog) obj).requestFocusInWindow();
				((JDialog) obj).requestFocus();
			}
		}
	}

	// public static void main(String[] a) {
	// // FrameConsultantAdd frame1 = (FrameConsultantAdd)
	// FrameFactory.createWindowOfType(FrameConsultantAdd.class);();
	// // FramePharmacistEvaluationReportFormRowDialog frame2 =
	// (FramePharmacistEvaluationReportFormRowDialog)
	// FrameFactory.createWindowOfType(FramePharmacistEvaluationReportFormRowDialog.class);
	// // FrameActivitysRecordAdd frame3 = new FrameActivitysRecordAdd();
	// FrameActivitysRecordAdd frame3 = (FrameActivitysRecordAdd)
	// FrameFactory.createWindowOfType(FrameActivitysRecordAdd.class);
	// frame3.setVisible(true);
	// frame3.setSize(400,400);
	// // FramePharmacistEvaluationReportFormRowDialog frame4 =
	// FrameFactory.createWindowOfType(FramePharmacistEvaluationReportFormRowDialog.class);
	// }
	public synchronized static Window createWindowOfType(Class cls) {
		try {
			// System.out.println("Creating a new Window");
			Object newInstance = cls.newInstance();
			if (newInstance instanceof Window) {
				final Window window = (Window) newInstance;
				window.addWindowListener(new WindowAdapter() {
					@Override
					public void windowOpened(WindowEvent e) {
						// System.out.println("Window Opened");
						addInStack(window);
					}
				});
				if (window instanceof JDialog) {
					window.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosing(WindowEvent e) {
							// System.out.println("Closing Window");

							int pos = getInstance().stackFrame.search(window);
							int position = (getInstance().stackFrame.size() - pos);
							Window obj = null;
							if (position - 1 < getInstance().stackFrame.size()) {
								obj = getInstance().stackFrame
										.get(position - 1);
								removeFromStack(window);

								if (obj instanceof JFrame) {
									((JFrame) obj).requestFocusInWindow();
									((JFrame) obj).requestFocus();
								} else if (obj instanceof JDialog) {
									((JDialog) obj).requestFocusInWindow();
									((JDialog) obj).requestFocus();
								}
							}
							removeFromStack(window);
						}
					});
				}
				if (window instanceof JFrame) {
					window.addWindowListener(new WindowAdapter() {
						@Override
						public void windowClosed(WindowEvent e) {
							// Terminate when the last window is closed.
							// System.out.println("Window Closed");
							removeFromStack(window);
							// System.exit(0);
						}
					});
				}
				window.addWindowFocusListener(new WindowFocusListener() {
					public void windowGainedFocus(WindowEvent e) {

						int pos = getInstance().stackFrame.search(window);
						// System.out.println("Position is:"+(getInstance().stackFrame.size()
						// - pos));
						int position = (getInstance().stackFrame.size() - pos);
						if (position == 0) {
							traverse = true;
						}
						// System.out.println("Position is:"+position);
						// System.out.println("Sise of stack is:"+getInstance().stackFrame.size());
						// System.out.println("traverse:"+traverse);
						if ((position != root /* && position !=root+1 */)
								&& traverse == false) {
							Window parent = getRootWindow();
							// System.out.println("Getting Parent window:"+parent);
							parent.requestFocusInWindow();
							parent.requestFocus();
						} else {
							/*
							 * commented for the time being because of window
							 * flicker in the system previous build version:
							 * 0.31 next build version: 0.32
							 * 
							 * D S Naruka Date: 2009-11-25 03:48 PM IST
							 */
							// getFocusHeirarchicallyUp(position);
						}

					}

					public void windowLostFocus(WindowEvent e) {
					}
				});
				return window;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public synchronized static Window getRootWindow() {
		for (Window w : getInstance().stackFrame) {
			return w;
		}
		return null;
	}

	// public static Window getRootNextWindow(){
	// Window w=null;
	// w=getInstance().stackFrame.get(root+1);
	// if(w!=null){
	// System.out.println("Window is:"+w);
	// return w;
	// }
	// return null;
	// }
	public synchronized static void closeAll() {
		for (final Window w : getInstance().stackFrame) {
			w.dispose();
		}
	}
}
