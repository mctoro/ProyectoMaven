package com.cice.proyectomaven;

import com.cice.proyectomaven.dto.ContactoDTO;
import com.cice.proyectomaven.dto.DireccionDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FileWriter fr = null;
        try {
            File fichero = new File("agenda.txt");
            fr = new FileWriter(fichero);

            
            ContactoDTO contacto = new ContactoDTO("Miguel", "Corrales", "Toro", "639284103");
            Gson gson = new Gson(); //esta es una forma de hacerlo.
            //Gson gson = new GsonBuilder().setPrettyPrinting().create(); //esta es la recomendable
            
            DireccionDTO direccion = new DireccionDTO("Dulcinea del Toboso", "4", "13200", "Manzanares");
            contacto.setDireccion(direccion);
            ArrayList<String> emails = new ArrayList<>();
            emails.add("miguel@hotmail.com");
            emails.add("jose@hotmail.com");
            emails.add("pedro@hotmail.com");
            contacto.setEmails(emails);
            
            //esto devuelve un string
            String json = gson.toJson(contacto);
            
            //fr.write("Hola"); está con comentario porque ya hemos creado el txt en la raiz
            
            fr.write(json);

            fr.close();
            
            FileReader reader = new FileReader(fichero);
            BufferedReader br = new BufferedReader(reader);
            String lecturaContacto = br.readLine();
            
            ContactoDTO nuevoContacto = gson.fromJson(lecturaContacto, ContactoDTO.class);
            
            System.out.println(nuevoContacto.getEmails());
            
            reader.close();
            br.close();
                  

            
        } catch (IOException ex) {
            System.out.println("Error");
        }

    }
}
