import java.net.*;
import java.io.*;

class URLInformation
{
	public static void main(String[]args)throws IOException
	{
	try
	{
	URL U1=new URL("www.kppatilpolytechnic.com");
	System.out.println("Host:"+U1.getHost());
	System.out.println("Protocol:"+U1.getProtocol());
	System.out.println("Port:"+U1.getPort());
	System.out.println("File:"+U1.getFile());
	}
	catch(MalformedURLException e)
	{
	System.out.println("MalformedURLException :"+e.getMessage());
	}
	}
}