/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.proyectomaven2;

import com.cice.proyectomaven2.dto.ContactoDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author cice
 */
public class main {
    
    public static void main(String[] args) {
        
        FileWriter fw = null;
        try {
            File fichero = new File("agenda2.txt");
            fw = new FileWriter(fichero);
            
            ContactoDTO contacto = new ContactoDTO();
            
            ArrayList<String> nombre = new ArrayList<>();
            nombre.add("Miguel");
            nombre.add("Jose");
            contacto.setNombre(nombre);
            
            
            ArrayList<String> primerApellido = new ArrayList<>();
            primerApellido.add("Corrales");
            primerApellido.add("Perez");
            contacto.setPrimerApellido(primerApellido);
            
            
            ArrayList<String> segundoApellido = new ArrayList<>();
            segundoApellido.add("Toro");
            segundoApellido.add("Lopez");
            contacto.setSegundoApellido(segundoApellido);
            
            
            ArrayList<String> telefono = new ArrayList<>();
            telefono.add("Toro");
            telefono.add("Lopez");
            contacto.setTelefono(telefono);

            
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            
            String json = gson.toJson(contacto);
            
            
            fw.write(json);
            fw.close();
            
              FileReader fr = new FileReader(fichero);
              BufferedReader bf = new BufferedReader(fr);
              
              String nuevo = bf.readLine();
              
              List<ContactoDTO> listaJSON = gson.fromJson(json, new TypeToken<ArrayList<ContactoDTO>>(){}.getType());
              
              for (ContactoDTO c : listaJSON) {
                  
                  System.out.println(c.getNombre());
                
            }
              
              
     
            
        } catch (IOException ex) {
            System.out.println("Nuevo error");
        }
        
        
        
        
    }
    
}
