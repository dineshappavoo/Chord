/**
 * 
 */
package node;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Dinesh Appavoo
 *
 */
public interface Node<V> extends Remote {
	
	/**
	 * Method to get the key for the node/host
	 * @return
	 * @throws RemoteException
	 */
	public String getKey() throws RemoteException;

	/**
	 * Method to get the successor node/host
	 * @return
	 * @throws RemoteException
	 */
	public Node<V> getSuccessor() throws RemoteException;

	/**
	 * Method to set the successor node/host
	 * @throws RemoteException
	 */
	public void setSuccessor() throws RemoteException;
	
	/**
	 * Method to set the predecessor node/host
	 * @throws RemoteException
	 */
	public void setPredecessor() throws RemoteException;

	/**
	 * Method to get the predecessor node/host
	 * @return
	 * @throws RemoteException
	 */
	public Node<V> getPredecessor() throws RemoteException;

}
