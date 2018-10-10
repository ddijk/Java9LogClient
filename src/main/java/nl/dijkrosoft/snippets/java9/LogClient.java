package nl.dijkrosoft.snippets.java9;

import nl.dijkrosoft.snippets.Log;

import java.util.ServiceLoader;

public class LogClient {


    public static void main(String[] args) {
        Iterable<Log> serviceLoader = ServiceLoader.load(Log.class);

        for ( Log log : serviceLoader) {

            log.log("Hallo daar!  from:"+log.toString());
        }
    }
}
