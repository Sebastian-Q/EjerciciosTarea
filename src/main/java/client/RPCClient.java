package client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class RPCClient {
    public static void main(String[] args) throws XmlRpcException, MalformedURLException {

        double v1,v2,v3,v4,v5;
        int opc,opc2=1;
        int va1,va2,va3,va4,va5;


        Scanner leer = new Scanner(System.in);

        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);

         do{
             System.out.println("ingresa el numero de la actividad \n 1.- Actividad 2 Suma,producto,promedio \n 2.-Actividad 3 Suma de numeros \n 3.-Actividad 4 ordenar numeros");
             opc=leer.nextInt();

             switch (opc){
                 case 1:
                     System.out.println("ingresa primer variable");
                     v1=leer.nextDouble();

                     System.out.println("ingresa segunda variable");
                     v2= leer.nextDouble();

                     System.out.println("ingresa tercera variable");
                     v3= leer.nextDouble();

                     System.out.println("ingresa cuarta variable");
                     v4= leer.nextDouble();



                     Object[] data = {v1,v2,v3,v4};
                     String response = (String) client.execute("Methods.calcular",data);
                     System.out.println(response);

                     break;
                 case 2:

                     System.out.println("ingresa primer variable");
                     v1=leer.nextDouble();

                     System.out.println("ingresa segunda variable");
                     v2= leer.nextDouble();




                     Object[] data2 = {v1,v2};
                     String response2 = (String) client.execute("Methods.calcular",data2);
                     System.out.println(response2);

                     break;
                 case 3:

                     System.out.println("ingresa primer variable");
                     va1=leer.nextInt();

                     System.out.println("ingresa segunda variable");
                     va2= leer.nextInt();

                     System.out.println("ingresa tercera variable");
                     va3= leer.nextInt();

                     System.out.println("ingresa cuarta variable");
                     va4= leer.nextInt();

                     System.out.println("ingresa quinta variable");
                     va5= leer.nextInt();


                     Object[] data3 = {va1,va2,va3,va4,va5};
                     String response3 = (String) client.execute("Methods.ordenar",data3);
                     System.out.println(response3);

                     break;

             }

             System.out.println("desea continuar \n 1.-Si \n 2.-no");
             opc2=leer.nextInt();
         }while (opc2==1) ;



    }

}
