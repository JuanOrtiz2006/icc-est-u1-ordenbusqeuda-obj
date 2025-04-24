import models.Persona;
import models.Direccion;
import views.ViewConsole;
import controllers.PersonaController;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona[] personas = new Persona[5];
    
            // Crear direcciones y personas
            personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
            
            personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
            personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
            personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
            personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));
    
            
            ViewConsole view = new ViewConsole();
            PersonaController personaControlles = new PersonaController();
    
            view.printArray(personas);
            personaControlles.sortByDireccionCodigo(personas);
            view.printArray(personas);
            
            personaControlles.findByCodigo(personas, 34);   
         }
}

