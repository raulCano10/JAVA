/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionTamañoArray.Opcion3;

public class GestionGrupos {
    public static void main(String[] args) {
        // Crear un grupo
        Grupo grupo = new Grupo("Desarrollo de Software");

        // Crear algunos alumnos
        Alumno alumno1 = new Alumno("Ana", 20);
        Alumno alumno2 = new Alumno("Luis", 22);
        Alumno alumno3 = new Alumno("Clara", 19);
        Alumno alumno4 = new Alumno("Juan", 21);

        // 1. size(): Consultar el número de alumnos en el grupo
        System.out.println("Número inicial de alumnos: " + grupo.lista.size()); // 0

        // 2. add(X): Añadir alumnos al grupo
        grupo.addAlumno(alumno1);
        grupo.addAlumno(alumno2);
        grupo.addAlumno(alumno3);
        grupo.addAlumno(alumno4);

        // Mostrar el número de alumnos después de añadir
        System.out.println("Número de alumnos tras añadir: " + grupo.lista.size()); // 4

        // 3. add(posición, X): Añadir un alumno en una posición específica
        Alumno alumnoExtra = new Alumno("Pedro", 23);
        if (grupo.lista.size() < grupo.MAX_ALUMNOS) {
            grupo.lista.add(2, alumnoExtra);
            System.out.println("Alumno \"Pedro\" añadido en posición 2.");
        }

        // 4. get(posición): Obtener un alumno por su posición
        Alumno alumnoPosicion = grupo.lista.get(2);
        System.out.println("Alumno en la posición 2: " + alumnoPosicion.toCadena());

        // 5. remove(posición): Eliminar un alumno por posición
        Alumno eliminado = grupo.lista.remove(1);
        System.out.println("Alumno eliminado: " + eliminado.toCadena());

        // 6. remove(X): Eliminar un alumno específico
        boolean eliminadoPorObjeto = grupo.lista.remove(alumno3);
        System.out.println("Eliminado alumno Clara: " + eliminadoPorObjeto);

        // 7. clear(): Vaciar el grupo
        grupo.lista.clear();
        System.out.println("Grupo vaciado. Alumnos actuales: " + grupo.lista.size()); // 0

        // 8. set(posición, X): Reemplazar un alumno en una posición específica
        grupo.addAlumno(alumno1);
        grupo.addAlumno(alumno2);
        grupo.addAlumno(alumno3);
        Alumno alumnoReemplazo = new Alumno("Sofía", 25);
        grupo.lista.set(1, alumnoReemplazo);
        System.out.println("Alumno en posición 1 reemplazado: ");
        grupo.listarGrupo();

        // 9. contains(X): Verificar si un alumno está en el grupo
        boolean contiene = grupo.lista.contains(alumno1);
        System.out.println("El grupo contiene a Ana: " + contiene);

        // 10. indexOf(X): Obtener la posición de un alumno
        int indice = grupo.lista.indexOf(alumnoReemplazo);
        System.out.println("Posición de Sofía en el grupo: " + indice);

        // Listar el grupo final
        System.out.println("Listado final del grupo:");
        grupo.listarGrupo();
    }
}
