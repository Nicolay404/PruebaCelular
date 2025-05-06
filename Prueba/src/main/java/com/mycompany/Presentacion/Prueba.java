/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Presentacion;

import com.mycompany.Persistencia.CelularJpaController;
import com.mycompany.Persistencia.ClienteJpaController;
import com.mycompany.Persistencia.RecargasJpaController;

/**
 *
 * @author Nicolay
 */
public class Prueba {

    public static void main(String[] args) {
        try {
            
            CelularJpaController jpaCelular = new CelularJpaController();
            ClienteJpaController jpaCliente = new ClienteJpaController();
            RecargasJpaController jpaRecargas = new RecargasJpaController();

            System.out.println("Tablas creadas correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
