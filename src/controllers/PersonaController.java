package controllers;
import models.Persona;
public class PersonaController {

    public void sortByDireccionCodigo(Persona [] personas){
        Persona aux;
        int index = 0;
        for (int i = 0; i<personas.length-1; i++){
            index = i;
            for (int j=i+1; j<personas.length;j++){
                if(personas[index].CompareToPersonaCodigoDireccion(personas[j]) == true){
                    index = j;
                }
            }
            if (index != i ){
                aux = personas[index];
                personas[index] = personas[i];
                personas[i] = aux;
            }
            
        }

        }

    public Persona findByCodigo(Persona [] personas, int codigo){
        int inicio = 0;
        int fin = personas.length-1;
        while (inicio <= fin){
            int mid = (inicio + fin)/2;
            int valorCentral =  personas[mid].getCodigoDireccion();
            if ( personas[mid].CompareToPersonaCodigoDireccion(codigo)){
                return personas[mid];
            }
            if ( valorCentral < codigo){
                inicio = mid + 1;
            }
            if (valorCentral > codigo){
                fin = mid-1;
            }

        }
        return null ;

    }
   
    }
    
