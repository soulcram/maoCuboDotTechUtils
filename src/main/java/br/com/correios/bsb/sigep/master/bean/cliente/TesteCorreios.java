package br.com.correios.bsb.sigep.master.bean.cliente;

import java.rmi.RemoteException;

public class TesteCorreios {

	public static void main(String[] args) throws SQLException, SigepClienteException, RemoteException {
		
		EnderecoERP correios = new AtendeClienteProxy().consultaCEP("04842300");


		System.out.println(correios.getEnd());

	}

}
