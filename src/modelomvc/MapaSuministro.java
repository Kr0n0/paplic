/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelomvc;

import entidades.EntidadGeo;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.LinkedList;

public class MapaSuministro extends MapaVectorialBase implements IMapaRepresentarAsociacion {

   
    public MapaSuministro() {
        geometrias = new LinkedList();
    }
    // Cambio a boolean para adecuar al interfaz IMapaRepresentarAsociacion
    public boolean representar(EntidadGeo entidad1, EntidadGeo entidad2) {
        // Crear tipo de geometría  y asignar posición (x,y)  
        return true;
    }

    @Override
    public void generarGrafico() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
