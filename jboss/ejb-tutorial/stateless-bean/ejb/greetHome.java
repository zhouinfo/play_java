import javax.ejb.*;
import java.rmi.*;
public interface greetHome extends EJBHome{
        public greetRemote create() throws 
                RemoteException,CreateException;
}
