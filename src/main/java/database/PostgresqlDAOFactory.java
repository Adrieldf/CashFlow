package database;

import dao.CategoriaDAO;
import dao.ClienteFornecedorDAO;
import dao.ContaDAO;
import dao.DAOFactory;
import dao.ParcelaDAO;
import dao.ProdutoDAO;
import dao.RenegociacaoDAO;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlDAOFactory extends DAOFactory {

    public static DAOFactory getInstancia() {

        if (instancia == null) {
            instancia = new PostgresqlDAOFactory();
        }

        return instancia;
    }

    private PostgresqlDAOFactory() {
        this.openConnection();
    }

    private void openConnection(){
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://motty.db.elephantsql.com:5432/doukhcto";
        String user = "doukhcto";
        String pwd = "tvg0xweZPbBrEO7dl5GvNE0sqHhBQLzI";

        try {

            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pwd);

            //insertProduct(conn, 100, "produto100", "descricao produto100");
            //updateProduct(conn, 100, "produtonovo", "produto massa");
            //getProducts(conn);
        } catch (ClassNotFoundException cnfe) {
            System.out.println("N�o foi poss�vel encontrar o driver JDBC");
        } catch (SQLException se) {
            System.out.println("N�o foi poss�vel conectar ao Banco de Dados");
        }
    }

    @Override
    public void closeConnection() {
        try {
            if (this.conn != null) {
                this.conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }

    }
    
    @Override
    public ProdutoDAO getProdutoDAO() {
        return new PostgresqlProdutoDAO(conn);
    }

    @Override
    public ParcelaDAO getParcelaDAO() {
        return new PostgresqlParcelaDAO(conn);
    }

    @Override
    public ContaDAO getContaDAO() {
        return new PostgresqlContaDAO(conn);
    }

    @Override
    public CategoriaDAO getCategoriaDAO() {
        return new PostgresqlCategoriaDAO(conn);
    }

    @Override
    public ClienteFornecedorDAO getClienteFornecedorDAO() {
        return new PostgresqlClienteFornecedorDAO(conn); 
    }

    @Override
    public UsuarioDAO getUsuarioDAO() {
        return new PostgresqlUsuarioDAO(conn);
    }

    @Override
    public RenegociacaoDAO getRenegociacaoDAO() {
        return new PostgresqlRenegociacaoDAO(conn);
    }

}
