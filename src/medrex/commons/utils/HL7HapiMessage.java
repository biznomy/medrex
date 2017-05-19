package medrex.commons.utils;

public class HL7HapiMessage {

	// public String getV2xMessage(String residentFirstName, String
	// residentLastName, String residentId){
	// try{
	// ADT_A01 adt = new ADT_A01();
	//        
	// // Populate the MSH Segment
	// MSH mshSegment = adt.getMSH();
	// mshSegment.getFieldSeparator().setValue("|");
	// mshSegment.getEncodingCharacters().setValue("^~\\&");
	// mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue("200701011539");
	// mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
	// mshSegment.getSequenceNumber().setValue("123");
	// mshSegment.getMessageType().getMessageType().setValue("ADT");
	// mshSegment.getMessageType().getTriggerEvent().setValue("A01");
	// mshSegment.getMessageType().getMessageStructure().setValue("ADT A01");
	//        
	// // Populate the PID Segment
	// PID pid = adt.getPID();
	// pid.getPatientName(0).getFamilyName().getSurname().setValue(residentLastName);
	// pid.getPatientName(0).getGivenName().setValue(residentFirstName);
	// pid.getPatientIdentifierList(0).getID().setValue("123456");
	//
	// /*
	// * In a real situation, of course, many more segments and fields would be
	// populated
	// */
	//                
	// // Now, let's encode the message and look at the output
	// Parser parser = new PipeParser();
	// String encodedMessage = parser.encode(adt);
	// return encodedMessage;
	// }
	// catch(Exception e){
	// return "Error Encountered";
	// }
	// // System.out.println("Printing ER7 Encoded Message:");
	// // System.out.println(encodedMessage);
	//	
	// }
	//	
	//
	// public String getV2xMessagexml(String residentFirstName, String
	// residentLastName, String residentId){
	// try{
	// ADT_A01 adt = new ADT_A01();
	//        
	// // Populate the MSH Segment
	// MSH mshSegment = adt.getMSH();
	// mshSegment.getFieldSeparator().setValue("|");
	// mshSegment.getEncodingCharacters().setValue("^~\\&");
	// mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue("200701011539");
	// mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
	// mshSegment.getSequenceNumber().setValue("123");
	// mshSegment.getMessageType().getMessageType().setValue("ADT");
	// mshSegment.getMessageType().getTriggerEvent().setValue("A01");
	// mshSegment.getMessageType().getMessageStructure().setValue("ADT A01");
	//        
	// // Populate the PID Segment
	// PID pid = adt.getPID();
	// pid.getPatientName(0).getFamilyName().getSurname().setValue(residentLastName);
	// pid.getPatientName(0).getGivenName().setValue(residentFirstName);
	// pid.getPatientIdentifierList(0).getID().setValue("123456");
	//
	// /*
	// * In a real situation, of course, many more segments and fields would be
	// populated
	// */
	//                
	// // Now, let's encode the message and look at the output
	// Parser parser = new DefaultXMLParser();
	// String encodedMessage = parser.encode(adt);
	// return encodedMessage;
	// }
	// catch(Exception e){
	// return "Error Encountered";
	// }
	// // System.out.println("Printing ER7 Encoded Message:");
	// // System.out.println(encodedMessage);
	//	
	// }
	//
	//	
	//	
	//	
	//	
	//	
	//	
	//	
	//	
	// public static void main(String[] args) throws HL7Exception {
	//		          
	// ADT_A01 adt = new ADT_A01();
	//	          
	// // Populate the MSH Segment
	// MSH mshSegment = adt.getMSH();
	// mshSegment.getFieldSeparator().setValue("|");
	// mshSegment.getEncodingCharacters().setValue("^~\\&");
	// mshSegment.getDateTimeOfMessage().getTimeOfAnEvent().setValue("200701011539");
	// mshSegment.getSendingApplication().getNamespaceID().setValue("TestSendingSystem");
	// mshSegment.getSequenceNumber().setValue("123");
	// mshSegment.getMessageType().getMessageType().setValue("ADT");
	// mshSegment.getMessageType().getTriggerEvent().setValue("A01");
	// mshSegment.getMessageType().getMessageStructure().setValue("ADT A01");
	//		          
	// // Populate the PID Segment
	// PID pid = adt.getPID();
	// pid.getPatientName(0).getFamilyName().getSurname().setValue("Doe");
	// pid.getPatientName(0).getGivenName().setValue("John");
	// pid.getPatientIdentifierList(0).getID().setValue("123456");
	//		  
	// /*
	// * In a real situation, of course, many more segments and fields would be
	// populated
	// */
	//		                  
	// // Now, let's encode the message and look at the output
	// Parser parser = new PipeParser();
	// String encodedMessage = parser.encode(adt);
	// System.out.println("Printing ER7 Encoded Message:");
	// System.out.println(encodedMessage);
	//		          
	//		 
	//	
	//		 
	// // Next, let's use the XML parser to encode as XML
	// parser = new DefaultXMLParser();
	// encodedMessage = parser.encode(adt);
	// System.out.println("Printing XML Encoded Message:");
	// System.out.println(encodedMessage);
	//		          
	//	
	// }

}
