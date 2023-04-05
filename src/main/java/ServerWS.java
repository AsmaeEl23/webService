import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());  //publish small server
        System.out.println("Web service deployed on http://0.0.0.0:9191/ ");
    }
}
