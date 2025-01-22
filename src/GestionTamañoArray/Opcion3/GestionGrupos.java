/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionTama�oArray.Opcion3;

public class GestionGrupos {
    public static void main(String[] args) {
        // Crear un grupo
        Grupo grupo = new Grupo("Desarrollo de Software");

        // Crear algunos alumnos
        Alumno alumno1 = new Alumno("Ana", 20);
        Alumno alumno2 = new Alumno("Luis", 22);
        Alumno alumno3 = new Alumno("Clara", 19);
        Alumno alumno4 = new Alumno("Juan", 21);

        // 1. size(): Consultar el n�mero de alumnos en el grupo
        System.out.println("N�mero inicial de alumnos: " + grupo.lista.size()); // 0

        // 2. add(X): A�adir alumnos al grupo
        grupo.addAlumno(alumno1);
        grupo.addAlumno(alumno2);
        grupo.addAlumno(alumno3);
        grupo.addAlumno(alumno4);

        // Mostrar el n�mero de alumnos despu�s de a�adir
        System.out.println("N�mero de alumnos tras a�adir: " + grupo.lista.size()); // 4

        // 3. add(posici�n, X): A�adir un alumno en una posici�n espec�fica
        Alumno alumnoExtra = new Alumno("Pedro", 23);
        if (grupo.lista.size() < grupo.MAX_ALUMNOS) {
            grupo.lista.add(2, alumnoExtra);
            System.out.println("Alumno \"Pedro\" a�adido en posici�n 2.");
        }

        // 4. get(posici�n): Obtener un alumno por su posici�n
        Alumno alumnoPosicion = grupo.lista.get(2);
        System.out.println("Alumno en la posici�n 2: " + alumnoPosicion.toCadena());

        // 5. remove(posici�n): Eliminar un alumno por posici�n
        Alumno eliminado = grupo.lista.remove(1);
        System.out.println("Alumno eliminado: " + eliminado.toCadena());

        // 6. remove(X): Eliminar un alumno espec�fico
        boolean eliminadoPorObjeto = grupo.lista.remove(alumno3);
        System.out.println("Eliminado alumno Clara: " + eliminadoPorObjeto);

        // 7. clear(): Vaciar el grupo
        grupo.lista.clear();
        System.out.println("Grupo vaciado. Alumnos actuales: " + grupo.lista.size()); // 0

        // 8. set(posici�n, X): Reemplazar un alumno en una posici�n espec�fica
        grupo.addAlumno(alumno1);
        grupo.addAlumno(alumno2);
        grupo.addAlumno(alumno3);
        Alumno alumnoReemplazo = new Alumno("Sof�a", 25);
        grupo.lista.set(1, alumnoReemplazo);
        System.out.println("Alumno en posici�n 1 reemplazado: ");
        grupo.listarGrupo();

        // 9. contains(X): Verificar si un alumno est� en el grupo
        boolean contiene = grupo.lista.contains(alumno1);
        System.out.println("El grupo contiene a Ana: " + contiene);

        // 10. indexOf(X): Obtener la posici�n de un alumno
        int indice = grupo.lista.indexOf(alumnoReemplazo);
        System.out.println("Posici�n de Sof�a en el grupo: " + indice);

        // Listar el grupo final
        System.out.println("Listado final del grupo:");
        grupo.listarGrupo();
    }
}
