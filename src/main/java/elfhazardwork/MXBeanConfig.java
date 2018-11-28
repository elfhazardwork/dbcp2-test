package elfhazardwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;
import org.springframework.jmx.support.RegistrationPolicy;

@Configuration
public class MXBeanConfig {
    @Bean
    public AnnotationMBeanExporter annotationMBeanExporter() {
        AnnotationMBeanExporter annotationMBeanExporter = new AnnotationMBeanExporter();
        annotationMBeanExporter.setRegistrationPolicy(RegistrationPolicy.REPLACE_EXISTING);
        return annotationMBeanExporter;
    }
}
