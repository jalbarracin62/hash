/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labhash;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jalba
 */
public class separa {
    public static void main(String[] args) throws NoSuchAlgorithmException {
    String string = "Este es un mensaje de prueba de integridad-f77f4a34aabe4e974d441383f2ba78a4e2654cdeba45528d68546d86a9f86a87";
    String[] parts = string.split("-");
    String part1 = parts[0]; 
    String part2 = parts[1]; 
        
        System.out.println("mensaje"+part1);
        System.out.println("hash del mensaje"+part2);
    }
}
