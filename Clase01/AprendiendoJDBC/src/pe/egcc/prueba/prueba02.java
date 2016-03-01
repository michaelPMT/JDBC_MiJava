package pe.egcc.prueba;
import java.sql.Connection;
import java.sql.Statement;
public class prueba02 {
    public static void main(String[] args) {
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion ok.");
            
            String sql = "Insert  into parametro(CHR_PARACODEIGO, "+ "VCH_PARA DESCRIPCION,VCH_PARAVALOR"
                    + "VCH_PARAESTADO) VALUES('777','PROFESOR',"
                    + "'gUSTAVO CORONEL','aCTIVO'";
            Statement stm = cn.createStatement();
            stm.executeUpdate("Parametro registrado");
            
            cn.close();
            System.out.println("Conexion cerrada");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
