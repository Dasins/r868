
/**
 * Esta clase simula alumnos con tres notas.
 * Es capaz de calcular la nota media del alumno y determinar si tiene alguna asignatura pendiente. 
 *
 * @author D4s1ns
 * @version 2018/02/09
 */
class Alumno {
    String nombreCompleto;
    int notaLengua;
    int notaMates;
    int notaIngles;
    double notaMedia;
    
    public Alumno (String nombreCompleto, int notaLengua, int notaMates, int notaIngles) {
        this.nombreCompleto = nombreCompleto;
        this.notaLengua = notaLengua;
        this.notaMates = notaMates;
        this.notaIngles = notaIngles;
        notaMedia = calcularMedia();
    }
    
    public double calcularMedia() {
        return (notaLengua + notaMates + notaIngles) / 3;
    }
    
    public double getNotaMedia() {
        return notaMedia;
    }
    
    public boolean comprobarTodoAprobado() {
        boolean todoAprobado = false;
        if(notaLengua >= 5 && notaMates >= 5 && notaIngles >= 5) {
            todoAprobado = true;
        }
        return todoAprobado;
    }
}
