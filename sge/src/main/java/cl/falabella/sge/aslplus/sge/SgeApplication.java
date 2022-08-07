package cl.falabella.sge.aslplus.sge;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = { "cl.falabella.sge.aslplus.sge.dao" }, annotationClass = Mapper.class)
public class SgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgeApplication.class, args);
	}

}
