import java.util.ArrayList;
import java.util.Iterator;

/**
 * La clase Ejercicio R868 se encarga de realizar diferentes operaciones con colecciones de alumnos.
 *
 * @author D4s1ns
 * @version 2018/02/09
 */
class EjercicioR868{        
    public ArrayList<Alumno> obtenerAlumnosOrdenadorPorNotaMedia(ArrayList<Alumno> alumnosGrupo1, ArrayList<Alumno> alumnosGrupo2){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.addAll(alumnosGrupo1);
        alumnos.addAll(alumnosGrupo2);
        alumnos = eliminarSuspensos(alumnos);
        ArrayList<Alumno> alumnosOrdenados = new ArrayList<>();
        Iterator<Alumno> bucleLento = alumnos.iterator();
        while(bucleLento.hasNext()) {
            Alumno alumnoConMasNota = null;
            Iterator<Alumno> bucleRaudo = alumnos.iterator();
            while(bucleRaudo.hasNext()) {
                Alumno alumnoActual = bucleRaudo.next();        
                if(alumnoConMasNota == null || alumnoActual.getNotaMedia() >= alumnoConMasNota.getNotaMedia()) {
                    alumnoConMasNota = alumnoActual;
                }
            }
            alumnosOrdenados.add(alumnoConMasNota);
            alumnos.remove(alumnoConMasNota);
        }
        return alumnosOrdenados;
    }
    
    public ArrayList<Alumno> eliminarSuspensos(ArrayList<Alumno> alumnos) {
        Iterator<Alumno> it = alumnos.iterator();
        while(it.hasNext()) {
            Alumno alumnoActual = it.next();
            if(!alumnoActual.comprobarTodoAprobado()) { 
                it.remove();
            }
        }
        return alumnos;
    }
    
}
