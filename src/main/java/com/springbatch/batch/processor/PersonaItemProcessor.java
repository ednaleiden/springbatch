package com.springbatch.batch.processor;

import com.springbatch.batch.model.Persona;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.logging.Logger;

public class PersonaItemProcessor implements ItemProcessor<Persona,Persona> {

    private static final Logger LOG = (Logger) LoggerFactory.getLogger(PersonaItemProcessor.class);

    @Override
    public Persona process(Persona item) throws Exception {

        String primer_nombre = item.getPrimer_nombre().toUpperCase();
        String segundo_nombre = item.getSegundo_nombre().toUpperCase();
        String telefono = item.getTelefono().toUpperCase();

        Persona persona = new Persona(primer_nombre,segundo_nombre,telefono);

        LOG.info("Convirtiendo ("+item+") a ("+persona+")");

        return persona;
    }
}
