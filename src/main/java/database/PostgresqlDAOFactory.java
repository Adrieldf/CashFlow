package database;

import dao.CategoriaDAO;
import dao.ContaDAO;
import dao.DAOFactory;
import dao.ParcelaDAO;
import dao.ProdutoDAO;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ContaDAO getContaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoriaDAO getCategoriaDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
	public static void main(String[] args) {
		
		Connection conn = null;
		
		
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://motty.db.elephantsql.com:5432/doukhcto";
		String user = "doukhcto";
		String pwd = "tvg0xweZPbBrEO7dl5GvNE0sqHhBQLzI";
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pwd);
			
			//insertProduct(conn, 100, "produto100", "descricao produto100");
			//updateProduct(conn, 100, "produtonovo", "produto massa");
			getProducts(conn);
		
		
		} catch (ClassNotFoundException cnfe) {
			System.out.println("N�o foi poss�vel encontrar o driver JDBC");
		} catch (SQLException se) {
			System.out.println("N�o foi poss�vel conectar ao Banco de Dados");
		} finally {
			try {
				
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void getProducts(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select codigo, nome, descricao from produto order by codigo");
			
			while (rs.next()) {
				System.out.print(rs.getInt("codigo"));
				System.out.print(" ");
				System.out.print(rs.getString("nome"));
				System.out.print(" ");
				System.out.println(rs.getString("descricao"));
			}
			
		}catch(SQLException ex) {
			System.out.println("Error while getting Products");
			ex.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void insertProduct(Connection conn, int id, String name, String description) {
	
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = conn.prepareStatement("insert into produto(codigo, nome, descricao) values ( ? , ? , ? )");
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, description);
			pstmt.executeUpdate();
		}
		catch(SQLException ex) {
			System.out.println("Error while inserting Product");
			ex.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	}
	
	public static void updateProduct(Connection conn, int id, String name, String description) {
		
		PreparedStatement pstmt = null;
		
		try {
			
			pstmt = conn.prepareStatement("update produto set nome = ?, descricao = ? where codigo = ?");
			pstmt.setString(1, name);
			pstmt.setString(2, description);	
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
			
		}
		catch(SQLException ex) {
			System.out.println("Error while updating Product");
			ex.printStackTrace();
		}
		finally {
			
			try {
				pstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}*/

}
