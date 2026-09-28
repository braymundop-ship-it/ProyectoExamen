package controlador;

import dao.EstudianteDao;
import modelo.Estudiante;

public class EstudianteController {

    private final EstudianteDao dao = new EstudianteDao();

    public boolean guardarEstudiante(Estudiante est) {
        return dao.guardar(est);
    }

    public Estudiante consultarEstudiante(String carnet) {
        return dao.consultar(carnet);
    }

    public boolean actualizarEstudiante(Estudiante est) {
        return dao.actualizar(est);
    }

    public boolean eliminarEstudiante(String carnet) {
        return dao.eliminar(carnet);
    }
}