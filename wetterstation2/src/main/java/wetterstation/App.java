/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wetterstation;

public class App {
   
    public static void main(String[] args) {
        
        final WetterStation station = new WetterStation();
        station.addTag(8, Wetter.HEITER);
        station.addTag(10, Wetter.REGEN);
        station.addTag(4, Wetter.SCHNEE);
        station.addTag(8, Wetter.SONNENSCHEIN);
        station.addTag(12, Wetter.WOLKIG);
        station.addTag(14, Wetter.SONNENSCHEIN);
        station.addTag(14, Wetter.SONNENSCHEIN);
        station.addTag(16, Wetter.SONNENSCHEIN);
        station.addTag(17, Wetter.SONNENSCHEIN);
        station.addTag(7, Wetter.REGEN);
        System.out.println(station);

    }
}