

import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;

public class WorldTime {


    public static void main(String[] args) {


        System.out.println("São " + getTimeByCountry("Europe/Lisbon"));


    }


    public static String getTimeByCountry(String texto) {

        int hora;
        int minuto;
        String horas;

        DateTimeZone zona = DateTimeZone.forID(texto);

        LocalTime tempo = new LocalTime(zona);
        hora = tempo.getHourOfDay();
        minuto = tempo.getMinuteOfHour();
        horas = hora + ":" + minuto;

        return horas;
    }

}
