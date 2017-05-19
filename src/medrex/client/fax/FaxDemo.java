package medrex.client.fax;
import cc.interfax.www.*;
import org.apache.commons.codec.binary.*;
import java.io.*;


public class FaxDemo
{
	 private static final String USERNAME = "technolabs3";
	    private static final String PASSWORD = "technolabs";
	    private static final String FAX_NUMBER = "0018453620703";
	    private static final String PDF_FILENAME = "etc/sample.pdf";

    public FaxDemo() {
    }

    public void run(String content) throws Exception {

//       doGetSupportedFileTypes();
       doSendCharFax( content);
       //doSendFax();
    }


    private void doGetSupportedFileTypes() throws Exception {
       cc.interfax.www.InterFaxSoapStub theBinding;

       try {
          theBinding = (cc.interfax.www.InterFaxSoapStub)
                        new cc.interfax.www.InterFaxLocator().getInterFaxSoap();
       }
       catch (javax.xml.rpc.ServiceException jre) {
           if(jre.getLinkedCause()!=null)
               jre.getLinkedCause().printStackTrace();
           throw new RuntimeException("JAX-RPC ServiceException caught: " + jre);
       }

       // Time out after a minute
       theBinding.setTimeout(60000);

       String theSupportedFileTypesStr = theBinding.getSupportedFileTypes();
       System.out.println(theSupportedFileTypesStr);
    }


    private void doSendCharFax(String content) throws Exception {
       cc.interfax.www.InterFaxSoapStub theBinding;
       try {
          theBinding = (cc.interfax.www.InterFaxSoapStub)
                       new cc.interfax.www.InterFaxLocator().getInterFaxSoap();
       }
       catch (javax.xml.rpc.ServiceException jre) {
           if(jre.getLinkedCause()!=null)
               jre.getLinkedCause().printStackTrace();
           throw new RuntimeException("JAX-RPC ServiceException caught: " + jre);
       }

       // Time out after a minute
       theBinding.setTimeout(60000);

       // Send a simple text fax using the InterFax sendCharFax() web service method.
       System.out.println("Sending Fax using sendCharFax()");
       long theReturnCode = theBinding.sendCharFax(USERNAME,PASSWORD,FAX_NUMBER,content,"TXT");
       System.out.println("sendCharFax() call returned with code: " + theReturnCode);
    }


    private void doSendFax() throws Exception {
       cc.interfax.www.InterFaxSoapStub theBinding;
       try {
          theBinding = (cc.interfax.www.InterFaxSoapStub)
                       new cc.interfax.www.InterFaxLocator().getInterFaxSoap();
       }
       catch (javax.xml.rpc.ServiceException jre) {
           if(jre.getLinkedCause()!=null)
               jre.getLinkedCause().printStackTrace();
           throw new RuntimeException("JAX-RPC ServiceException caught: " + jre);
       }

       // Time out after a minute
       theBinding.setTimeout(60000);

       // Encode the File.
       byte[] theFileData = doEncodeAsBase64(PDF_FILENAME);

       // Send a simple text fax using the InterFax sendFax() web service method.
       System.out.println("Sending Fax using sendFax().  Document size: " + theFileData.length);
       long theReturnCode = theBinding.sendfax(USERNAME,PASSWORD,FAX_NUMBER,theFileData,"PDF");
       System.out.println("sendFax() call returned with code: " + theReturnCode);
    }


    private byte[] doEncodeAsBase64(String aFilename)
        throws Exception {
    
        if(null==aFilename) {
            throw new NullPointerException("aFilename is null");
        }
        File theFile = new File(aFilename);
        if(!theFile.isFile()) {
            throw new IllegalArgumentException("Path doesn't represent a file: " + aFilename);
        }
        if(!theFile.exists()) {
            throw new IllegalArgumentException("File not found: " + aFilename);
        }
    
        InputStream theIs = new BufferedInputStream(new FileInputStream(theFile));
        ByteArrayOutputStream theEncodedData = new ByteArrayOutputStream();
    
        byte theBuffer[] = new byte[1024];
        byte theEncodedBuffer[];
        int theBytesRead;
    
        try {
            while((theBytesRead=theIs.read(theBuffer)) != -1) {
                if( theBytesRead < 1024 ) {
                    byte theSlice[] = new byte[theBytesRead];
                    System.arraycopy(theBuffer, 0, theSlice, 0, theBytesRead);
                    theEncodedBuffer = Base64.encodeBase64(theSlice);
                } else {
                    theEncodedBuffer = Base64.encodeBase64(theBuffer);
                }
                theEncodedData.write(theEncodedBuffer);
            }
        } finally {
            theIs.close();
            theEncodedData.close();
        }

        return theEncodedData.toByteArray();
    }


    public static void main(String[] anArgs) {
//       try {
//           new FaxDemo().run("");
//       } catch(Exception theE) {
//          System.out.println("Error encountered while running FaxDemo:");
//          theE.printStackTrace();
//       }
    }
}