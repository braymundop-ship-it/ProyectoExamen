package dao;

import conexion.CreateConnection;
import modelo.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EstudianteDao {

    public boolean guardar(Estudiante est) {

        String sql = "INSERT INTO examen.Estudiante "
                + "(Carnet, FirstName, SecondName, LastName, Direccion, "
                + "Telefono, Carrera, FechaNacimiento, FechaIngreso, CuotaMensual) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            CreateConnection conexion = new CreateConnection();
            Connection con = conexion.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, est.getCarnet());
            ps.setString(2, est.getFirstName());
            ps.setString(3, est.getSecondName());
            ps.setString(4, est.getLastName());
            ps.setString(5, est.getDireccion());
            ps.setInt(6, est.getTelefono());
            ps.setString(7, est.getCarrera());
            ps.setDate(8, est.getFechaNacimiento());
            ps.setDate(9, est.getFechaIngreso());
            ps.setDouble(10, est.getCuotaMensual());

            ps.executeUpdate();

            ps.close();
            con.close();

            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Estudiante consultar(String carnet) {

        Estudiante est = null;

        String sql = "SELECT * FROM examen.Estudiante WHERE Carnet = ?";

        try {
            CreateConnection conexion = new CreateConnection();
            Connection con = conexion.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, carnet);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                est = new Estudiante();

                est.setIdEstudiante(rs.getInt("idEstudiante"));
                est.setCarnet(rs.getString("Carnet"));
                est.setFirstName(rs.getString("FirstName"));
                est.setSecondName(rs.getString("SecondName"));
                est.setLastName(rs.getString("LastName"));
                est.setDireccion(rs.getString("Direccion"));
                est.setTelefono(rs.getInt("Telefono"));
                est.setCarrera(rs.getString("Carrera"));
                est.setFechaNacimiento(rs.getDate("FechaNacimiento"));
                est.setFechaIngreso(rs.getDate("FechaIngreso"));
                est.setCuotaMensual(rs.getDouble("CuotaMensual"));
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return est;
    }


    public boolean actualizar(Estudiante est) {

        String sql = "UPDATE examen.Estudiante SET "
                + "FirstName = ?, SecondName = ?, LastName = ?, "
                + "Direccion = ?, Telefono = ?, Carrera = ?, "
                + "FechaNacimiento = ?, FechaIngreso = ?, CuotaMensual = ? "
                + "WHERE Carnet = ?";

        try {
            CreateConnection conexion = new CreateConnection();
            Connection con = conexion.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, est.getFirstName());
            ps.setString(2, est.getSecondName());
            ps.setString(3, est.getLastName());
            ps.setString(4, est.getDireccion());
            ps.setInt(5, est.getTelefono());
            ps.setString(6, est.getCarrera());
            ps.setDate(7, est.getFechaNacimiento());
            ps.setDate(8, est.getFechaIngreso());
            ps.setDouble(9, est.getCuotaMensual());
            ps.setString(10, est.getCarnet());

            int resultado = ps.executeUpdate();

            ps.close();
            con.close();

            return resultado > 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean eliminar(String carnet) {

        String sql = "DELETE FROM examen.Estudiante WHERE Carnet = ?";

        try {
            CreateConnection conexion = new CreateConnection();
            Connection con = conexion.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, carnet);

            int resultado = ps.executeUpdate();

            ps.close();
            con.close();

            return resultado > 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
