/**
 * 
 */
package node;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * @author Dany
 * @param <E>
 *
 */
public class NodeImpl<E> extends UnicastRemoteObject implements Node<E>{


	protected NodeImpl() throws RemoteException {
		super();
	}

	public static void main(String[] args) {

	}

	@Override
	public String getKey() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<E> getSuccessor() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSuccessor() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPredecessor() throws RemoteException {
		// TODO Auto-generated method stub

	}

	@Override
	public Node<E> getPredecessor() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node<E	> lookup(String key) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateFingers(List<Node<E>> nodes) throws RemoteException {
		// TODO Auto-generated method stub

	}



}
