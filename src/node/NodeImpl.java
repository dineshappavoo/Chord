/**
 * 
 */
package node;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dinesh Appavoo
 * @param <E>
 *
 */
public class NodeImpl<E> extends UnicastRemoteObject implements Node<E>{

	//Name of the node/host
	private String name;
	
	//Key for the node
	private String key;
	
	//Predecessor of this node
	private Node<E> predecessor;
	
	//Successor of this node
	private Node<E> successor;
	
	//Routing table of this host
	private Map<String, Node<E>> fingers=new LinkedHashMap<String, Node<E>>();

	/**
	 * 
	 * @throws RemoteException
	 */
	protected NodeImpl() throws RemoteException {
		super();
	}	

	@Override
	public String getKey() throws RemoteException {
		return key;
	}

	@Override
	public Node<E> getSuccessor() throws RemoteException {
		return successor;
	}

	@Override
	public void setSuccessor(Node<E> successor) throws RemoteException {
		this.successor=successor;
		
	}

	@Override
	public void setPredecessor(Node<E> predecessor) throws RemoteException {
		this.predecessor=predecessor;
		
	}
	
	@Override
	public Node<E> getPredecessor() throws RemoteException {
		return predecessor;
	}

	@Override
	public Node<E> lookup(String key) throws RemoteException {
		return null;
	}

	@Override
	public void updateFingers(List<Node<E>> nodes) throws RemoteException {

	}


	public static void main(String[] args) {

	}



}
