
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

public static void main(String[] args) throws IOException {
Socket clientSocket = null;
ServerSocket serverSocket = null;
try{
    serverSocket = new ServerSocket(4444);
    System.out.println("server started....");
    while (true){
    System.out.println("WATING FOR CLIENT ");
    clientSocket = serverSocket.accept();
    System.out.println("CLIENT FOUND");

//BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputS­tream()));
Scanner in1 = new Scanner(clientSocket.getInputStream());
String mes; 
while(in1.hasNext()){

        mes=in1.nextLine();
        System.out.println("Client message :"+mes);

  }
    }
}catch(Exception e){} //read & display the message
}

}
