package automovel.automovelCassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class App 
{
	public static void main( String[] args )
    {
        Cluster cluster = Cluster.builder().addContactPoints("127.0.0.1").build();
        Session session = cluster.connect();
        String cqlStatement = "CREATE KEYSPACE teste WITH " + 
                              "replication = {'class':'SimpleStrategy','replication_factor':1}";        
        session.execute(cqlStatement);

        String cqlStatement2 = "CREATE TABLE teste.automovel (" + 
                               " nome varchar PRIMARY KEY," + 
                               " velocidade_max varchar " + 
                               " cor varchar " + 
                               ");";
        session.execute(cqlStatement2);
        
        String cqlQuery = "INSERT INTO teste.automovel(nome, velocidade_max, cor) VALUES(?,?,?)";
        

        System.out.println("Done");
        System.exit(0);
    }
}
