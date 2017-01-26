/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio2.pkg0;

import java.util.Scanner;

/**
 *
 * @author jlambert
 */
public class Radio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio1 R;
        R = new Radio1();
        R.regarder();
        R.ChangerCanal();
        R.ChangerVolume();
        R.regarder();
        R.ChangerCanal();
        R.ChangerVolume();
        R.regarder();
    }
}
    
    class Radio1
    {
        private double volume;
        private int canal;
        
        Radio1()
        {
            volume=0.0;
            canal=450;
        }
        public void ChangerVolume()
        {
            Scanner V1 = new Scanner(System.in);
            System.out.println("Entrer le nouveaux volume : ");
            double V = V1.nextDouble();
            volume = volume + V;
            if (volume>10.0) volume=0.0;
        }
        public void ChangerCanal()
        {
            Scanner C1 = new Scanner(System.in);
            System.out.println("Enter le nouveaux Canal : ");
            int C = C1.nextInt();
            canal = canal + C;
            if (canal>900) canal=100;
        }
        public void regarder()
        {
            System.out.println("Canal "+canal+" Volume "+volume);
            
        }
              
    }
    
    

