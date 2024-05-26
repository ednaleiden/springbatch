package com.springbatch.batch;

import com.springbatch.batch.model.Persona;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableBatchProcessing
@Deprecated
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    // batch se componen de muchos step y cada step puede componese de un tem processo, item reader

    @Bean
    public FlatFileItemReader<Persona> reader(){
        return new FlatFileItemReaderBuilder<Persona>()
                .name("personaItemReader")
                .resource(new ClassPathResource("sample-data.csv"))
                .delimited()
                .names(new String[]{"primer_nombre","segundo_nombre","telefono"})
                .fieldSetMapper(new BeanWrapperFieldSetMapper<Persona>() {{
                    setTargetType(Persona.class);
                }})
                .build();

    }
}
