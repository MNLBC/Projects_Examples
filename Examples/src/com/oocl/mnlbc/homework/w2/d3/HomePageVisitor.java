package com.oocl.mnlbc.homework.w2.d3;


import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  
import java.net.InetAddress;  
import java.net.InetSocketAddress;  
import java.net.Socket;  
import java.net.SocketAddress;  
import java.net.UnknownHostException;  
  
public class HomePageVisitor {  
    private Socket client;  
    private SocketAddress address;  
    public HomePageVisitor(String hostName, int port) throws UnknownHostException, IOException {  
        client = new Socket();  
        address = new InetSocketAddress(hostName, port);  
    }  
    // GET http://localhost:8080/blank/Welcome.do HTTP/1.1\r\n  
    public void printHomePageInfo(String httpString)  
    {  
        try {  
            // Get local host info  
            InetAddress inetAddress = InetAddress.getLocalHost();  
            System.out.println("Host Address = " + inetAddress.getHostAddress());  
            System.out.println("Hostname = " + inetAddress.getHostName());  
              
            // visit the WEBSITE  
            client.connect(address);  
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream(), "UTF8"));  
            bufferedWriter.write(httpString);  
              
            // -- HTTP/1.1 400 Bad Request if not send \r\n  
            bufferedWriter.write("\r\n");  
            bufferedWriter.flush();  
            System.out.println("http request send out");  
              
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));  
            String content = null;  
            while((content = bufferedReader.readLine()) != null) {  
                if(getStatusCde(content) == 400) {  
                    System.err.println("HTTP/1.1 | HTTP/1.0 400 Bad Request");  
                    break;  
                }  
                System.out.println("response contect -->> " + content);  
            }  
        } catch(Exception e) {  
            e.printStackTrace();  
        }  
          
    }  
      
    /** 
     * <p> try to parse the HTTP response content</p> 
     * @param content 
     * @return status of HTTP 
     */  
    private static int getStatusCde(String content) {  
        int status = 200; // default OK response  
        if(content == null || "".equals(content))  
            return status;  
        else if (!content.contains("HTTP/1.1")&& !content.contains("HTTP/1.0"))  
            return status;  
        else if(content.contains("400") && content.contains("HTTP/1.1")  
                || content.contains("HTTP/1.0")) {  
            status = 400;  
        }  
        return status;  
    }  
      
    public static void main(String[] args) {  
        try {  
            HomePageVisitor httpVisitor = new HomePageVisitor("github.com", 80);  
            httpVisitor.printHomePageInfo("GET https://github.com/ HTTP/1.0\r\n");  
        } catch (UnknownHostException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  