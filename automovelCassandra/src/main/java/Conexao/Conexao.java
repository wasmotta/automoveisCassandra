package Conexao;


import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Conexao {
	Session session = null;
	public void con(){
		Cluster cluster = Cluster.builder().addContactPoints("127.0.0.1").build();
        session = cluster.connect();
	}
	public static void main(String[] args) {
		Conexao con = new Conexao();
		con.con();
		
	}
}
