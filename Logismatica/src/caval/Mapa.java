/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caval;

import com.teamdev.jxmaps.swing.MapView;
import javax.swing.JFrame;
import com.teamdev.jxmaps.*;
import java.awt.BorderLayout;


/**
 *
 * @author ricar
 */
public class Mapa extends MapView{
    
    private Map map;
    public Mapa(String nName)
    {
        JFrame frame = new JFrame(nName);
        
        setOnMapReadyHandler((MapStatus status) -> {
            if(status == MapStatus.MAP_STATUS_OK)
            {
                map= getMap();
                MapOptions mapOptions = new MapOptions();
                MapTypeControlOptions controlOptions = new MapTypeControlOptions();
                mapOptions.setMapTypeControlOptions(controlOptions);
                map.setOptions(mapOptions);
                map.setCenter(new LatLng(19.19661515674742, -99.51694563985596));
                map.setZoom(16.0);
                
            }
        });
        
        frame.add(this, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        Mapa temp = new Mapa("Ventana de prueba");
    }
    
}
