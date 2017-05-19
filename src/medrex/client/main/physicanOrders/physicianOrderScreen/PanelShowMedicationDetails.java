package medrex.client.main.physicanOrders.physicianOrderScreen;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import medrex.client.clientManagar.MedrexClientManager;
import medrex.client.constants.Global;
import medrex.commons.exception.MedrexException;
import medrex.commons.vo.others.Doctors;
import medrex.commons.vo.others.Users;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderMedication;
import medrex.commons.vo.physicianOrders.physicianOrderScreen.PhysicianOrderRecord;
import medrex.server.dao.physicianOrders.physicianOrderNewScreen.PhysicianOrderMedicationDao;

import com.sX.swing.JxButton;
import com.sX.swing.JxLabel;
import com.sX.swing.JxPanel;
import com.sX.swing.JxTabbedPane;
import com.sX.swing.JxTabbedPane.JxTabStyle;
import com.sX.theme.BlueOverWhiteTheme;


public class PanelShowMedicationDetails extends JxPanel {
	private JxTabbedPane tabbedPane;
	private static final long serialVersionUID = -7968011175488196230L;	
	private List<PhysicianOrderMedication> pom;
	private List<Doctors> doctorList;
	private JxLabel[] showMedicationLabel;
	private JxLabel[] showMedicationLabelInActive;
	private Users  por;
	private int sizeOfMedicationList;
	private BlueOverWhiteTheme bluOverwhite = new BlueOverWhiteTheme();
	public PhysicianOrderMedication list;
	
	public PanelShowMedicationDetails(){
		
		
		
	}

		public PanelShowMedicationDetails(List<PhysicianOrderMedication> pom,Users  por) {
			super();
			
			this.pom=pom;
			this.doctorList=doctorList;
			
			this.por= por;
			 SimpleDateFormat dateFormater = new SimpleDateFormat("MM/dd/yyyy");
			ToolTipManager toolTipManager =  ToolTipManager.sharedInstance();
			setLayout(new BorderLayout());
			final JxPanel panel = new JxPanel();
			panel.setBackground(Color.WHITE);
			panel.setLayout(new BorderLayout());
			panel.setLocation(0, 0);
			add(panel);
		   
			tabbedPane = new JxTabbedPane();
			tabbedPane.setPreferredSize(new Dimension(0, 0));
			//tabbedPane.setBounds(28, 61, 696, 434);
			tabbedPane.setBounds(0, 0, 696, 434);
			tabbedPane.setTabSize(new Dimension(80, 30));
			tabbedPane.setTabStyle(JxTabStyle.WIN2);
			tabbedPane.setForeground(JxTabStyle.WIN2.getBorder().getLineColor());
			tabbedPane.setFont(new Font("Dialog", Font.BOLD, 12));
			panel.add(tabbedPane, BorderLayout.CENTER);

			final JxPanel panel_1 = new JxPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setOpaque(false);
			panel_1.setName("");
			panel_1.setLayout(null);
			panel_1.setBounds(21, 10, 194, 400);

			final JxPanel panel_2 = new JxPanel();
			panel_2.setBackground(Color.WHITE);
			panel_2.setLayout(null);
			panel_2.setBackground(Color.WHITE);
			panel_2.setBounds(386, 10, 194, 400);

			tabbedPane.addTab("Active", null, panel_1);
			tabbedPane.addTab("InActive", null, panel_2);
			 
			sizeOfMedicationList=pom.size();
			showMedicationLabel=new JxLabel[sizeOfMedicationList];
			int count=0;
			for(int i=0;i<showMedicationLabel.length;i++){
				
				String medication=pom.get(i).getMedication();
				String doseAmount=""+pom.get(i).getDoseAmount();
				String dose=pom.get(i).getDose();
				String Frequency=""+pom.get(i).getFrequency1();
				String Route = " "+ pom.get(i).getRoute();
				 
				if(pom.get(i).getPrnIndicationComments().isEmpty()||pom.get(i).getPrnIndicationComments()==null){
				String PRNCommets = "Not Applicable";
				}
				else
				{
					String PRNCommets =	pom.get(i).getPrnIndicationComments();
				}
				String medicationDetail="<html><body><b>"+medication+"  "+ doseAmount +" "+ dose+ Route +"<br>"+Frequency+" "+"times daily</body></html>";
				
				showMedicationLabel[i] = new JxLabel();
				showMedicationLabel[i].setTheme(bluOverwhite);
				showMedicationLabel[i].setOpaque(true);
				toolTipManager.registerComponent(showMedicationLabel[i]);
				toolTipManager.setDismissDelay(1000000000);
				toolTipManager.setInitialDelay(0);
				 
				
				
				
				showMedicationLabel[i].setText(medicationDetail);
				showMedicationLabel[i].setBounds(0, i*50, 194, 50);
				showMedicationLabel[i].setVerticalTextPosition(JxLabel.BOTTOM);
				showMedicationLabel[i].setHorizontalTextPosition(JxLabel.CENTER);
				/*showMedicationLabel[i].setToolTipText("<HTML> Route Name: "+pom.get(i).getRoute()+
						                               "<BR> From Date:"+pom.get(i).getDurationFrom()+
						                               "<BR> To Date:"+pom.get(i).getDurationTo()+
						                               "<BR> Instructions:"+pom.get(i).getInstructions()+
						                               "<BR> PrnIndication:"+pom.get(i).getPrnIndication()+
						                               "<BR> PrnIndicationComments:"+pom.get(i).getPrnIndicationComments()+
						                               "<BR> Doctor Name:"+ por.getUserName());*/
				
				
				showMedicationLabel[i].setToolTipText("<HTML>Date Ordered: "+  dateFormater.format(pom.get(i).getDurationFrom())+
                        "<BR>" +pom.get(i).getMedication()+
                        " "+pom.get(i).getDoseAmount()+" "
                        +pom.get(i).getDose()+
                        " "+pom.get(i).getRoute()+
                        " "+pom.get(i).getFrequency1()+ " <BR>Duration: From " +pom.get(i).getDurationFrom()+"To "+ pom.get(i).getDurationTo()+  "<BR> PRN Indication for use: " +pom.get(i).getPrnIndicationComments() +
                        "<BR> Doctor Name:"+ por.getUserName());
				
				
				 final int index = i;
				 
			 
				 showMedicationLabel[index].addMouseListener(new MouseAdapter() {
					 
					 public void mouseEntered(final MouseEvent arg0) {
						 
						 showMedicationLabel[index].setBackground(new Color(49, 104, 127));// light blue 
						 showMedicationLabel[index].setForeground(new Color(255, 255, 255));//white
						 
						 
					 }
					 
					 
				 });
				 
				 showMedicationLabel[index].addMouseListener(new MouseAdapter() {
					 
					 public void mouseExited(final MouseEvent arg0) {
						 
						 showMedicationLabel[index].setBackground(Color.white);
						 showMedicationLabel[index].setForeground(new Color(49, 104, 127));
						 
						 
						 
					 }
					 
					 
				 });
				
	PanelPhysicanOrderMedication psom=null;
				
				showMedicationLabel[index].addMouseListener(new MouseAdapter() {
				public void mouseClicked(final MouseEvent arg0) {
					System.out.println("index===:"+index);
					System.out.println("I am in checking..........");
					  list = null;
						try {
							list = PhysicianOrderMedicationDao.getInstance()
									.getPhysicianOrderMedicationBySerial(index + 1);
							setPhyordeActice(list);
							System.out.println("medication:"+ list.getMedication());
							
						} catch (Exception e) {
							list = new PhysicianOrderMedication();
							e.printStackTrace();
							
						}
						if (list != null) {
							Global.panelPhysicianOrdersMedication
							.setValueObject(list);
							//psom.passValues(list1);
							
						}
					}
				});
				/*	}*/				
				panel_1.add(showMedicationLabel[i]);
				count++;
			}
			setPreferredSize(new Dimension(180, (count*50)+200));
		}

		public static void main(String[] args) {
			JFrame frm = new JFrame();
//			JScrollPane scroll = new JScrollPane();
			PanelShowMedicationDetails t = new PanelShowMedicationDetails(null,null);
//			scroll.setViewportView(t);
			frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frm.getContentPane().add(scroll);
			frm.getContentPane().add(t);
			frm.setSize(180, 500);
			frm.setVisible(true);

		}
		
		
	/*	public PhysicianOrderMedication getPhysorderActiveList( ){
			
			 return list;
			
			
		}*/
		public void setPhyordeActice(PhysicianOrderMedication pomActive){
			
			this.list = pomActive;
			
		}

	
}
