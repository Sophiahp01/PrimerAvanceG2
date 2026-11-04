/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeravance.g2;

/**
 *
 * @author fapis
 */
public class Parqueo {
    
// Matrices para los niveles 4x5
    private char[][] nivelS1 = {
        {'D', 'P', '0', '0', 'P'},
        {'0', '0', '0', '0', '0'},
        {'0', 'P', '0', '0', '0'},
        {'E', 'E', 'E', '0', 'D'}
    };
    
// 5x5
    private char[][] nivelS2 = {
        {'P', 'P', '0', '0', 'P'},
        {'0', 'D', '0', '0', '0'},
        {'0', 'P', '0', '0', '0'},
        {'0', '0', '0', '0', 'P'},
        {'E', 'E', 'E', 'P', 'P'}
    }; 

    //6x5
    private char[][] nivelS3 = {
        {'P', 'P', '0', '0', 'P'},
        {'0', '0', '0', '0', '0'},
        {'0', 'P', '0', '0', '0'},
        {'0', '0', '0', '0', 'P'},
        {'E', 'D', 'P', 'P', 'P'},
        {'E', 'E', 'E', '0', 'D'}
    };

    public String obtenerMatrizTexto(int nivel) {
        char[][] matrizSeleccionada;
        String nombreNivel = "";
        
        if (nivel == 1) {
            matrizSeleccionada = nivelS1;
            nombreNivel = "Nivel S1 (4x5)\n 1|2|3|4|5|\n";
        } else if (nivel == 2) {
            matrizSeleccionada = nivelS2;
            nombreNivel = "Nivel S2 (5x5)\n 1|2|3|4|5|\n";
        } else {
            matrizSeleccionada = nivelS3;
            nombreNivel = "Nivel S3 (6x5)\n 1|2|3|4|5|\n";
        }

        char letraFila = 'A';
        
        for (int i = 0; i < matrizSeleccionada.length; i++) {
            nombreNivel = nombreNivel + letraFila + "";
            for (int j = 0; j < matrizSeleccionada[i].length; j++) {
                nombreNivel = nombreNivel + matrizSeleccionada[i][j] + " ";
            }
            nombreNivel = nombreNivel + "\n";
            letraFila++;
        }
        return nombreNivel;
    }
    
    
}
