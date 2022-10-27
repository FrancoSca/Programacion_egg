/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerador;

import javafx.scene.shape.ArcType;

/**
 *
 * @author FrancoSca
 */
public enum enumeradorClasificacion {
    ATP(0, "Apta para todo publico."), MAYOR13(13, "Apta mayores de 13 años."), MAYOR16(16, "Apta mayores de 16 años."),MAYOR18(18, "Apta mayores de 18 años.");
    private String valor;
    private Integer edad;
    
    private enumeradorClasificacion(Integer edad, String valor) {
        this.valor = valor;
        this.edad = edad;
    }

    public String getValor() {
        return valor;
    }

    public Integer getEdad() {
        return edad;
    }

    
    @Override
    public String toString() {
        return "Clasificacion{" + "valor=" + valor + '}';
    }
    
}
