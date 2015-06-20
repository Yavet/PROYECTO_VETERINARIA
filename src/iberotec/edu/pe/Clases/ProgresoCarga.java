/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iberotec.edu.pe.Clases;

import javax.swing.JProgressBar;

/**
 *
 * @author Yavet
 */
public class ProgresoCarga extends Thread{
        JProgressBar pbProgreso;

    public ProgresoCarga(JProgressBar progreso1)
    {        
        super();
        this.pbProgreso=progreso1;
    }
    public void run()
    {
        int l=0;
        for(l=1;l<=100;l++)
        {
            pbProgreso.setValue(l);
            pausa(20);
        }
   
    }
    public void pausa(int mlSeg)
    {
        try
        {
            // pausa para el splash
            Thread.sleep(mlSeg);
        }catch(Exception e){}
    }
}

