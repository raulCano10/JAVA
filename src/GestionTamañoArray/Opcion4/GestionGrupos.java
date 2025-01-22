/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionTamañoArray.Opcion4;

public class GestionGrupos {
    public static void main(String[] args) {
        // Crear un grupo
        Grupo grupo = new Grupo("Desarrollo de Software");

        // Crear algunos alumnos
        Alumno alumno1 = new Alumno("Ana", 20);
        Alumno alumno2 = new Alumno("Luis", 22);
        Alumno alumno3 = new Alumno("Clara", 19);
        Alumno alumno4 = new Alumno("Juan", 21);

        System.out.println("1. Tamaño inicial del grupo: " + grupo.getNumeroAlumnos());

        System.out.println("2. Añadiendo alumnos...");
        grupo.addAlumno(alumno1);
        grupo.addAlumno(alumno2);
        grupo.addAlumno(alumno3);
        grupo.addAlumno(alumno4);
        grupo.listarGrupo();

        System.out.println("3. Añadiendo alumno en posición 2...");
        Alumno alumnoExtra = new Alumno("Pedro", 23);
        grupo.addAlumnoEnPosicion(2, alumnoExtra);
        grupo.listarGrupo();

        System.out.println("4. Obtener alumno en posición 2: " + grupo.getAlumnoEnPosicion(2).toCadena());

        System.out.println("5. Eliminando alumno en posición 1...");
        grupo.eliminarAlumnoEnPosicion(1);
        grupo.listarGrupo();

        System.out.println("6. Eliminando alumno específico (Clara)...");
        grupo.eliminarAlumno(alumno3);
        grupo.listarGrupo();

        System.out.println("7. Vaciando el grupo...");
        grupo.vaciarGrupo();
        grupo.listarGrupo();

        System.out.println("8. Reemplazando alumno en posición 1...");
        grupo.addAlumno(alumno1);
        grupo.addAlumno(alumno2);
        Alumno alumnoReemplazo = new Alumno("Sofía", 25);
        grupo.reemplazarAlumnoEnPosicion(1, alumnoReemplazo);
        grupo.listarGrupo();

        System.out.println("9. Verificar si Ana está en el grupo: " + grupo.contieneAlumno(alumno1));

        System.out.println("10. Posición de Sofía en el grupo: " + grupo.obtenerIndiceDeAlumno(alumnoReemplazo));
    }
}
