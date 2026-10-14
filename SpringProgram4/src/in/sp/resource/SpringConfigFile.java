package in.sp.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // is used for java based configuration
@ComponentScan("in.sp.beans")//it will scan the package and create it object automatically
//@ComponentScan({"in.sp.beans"})//other way to write this
//@ComponentScan(basePackages = {"in.sp.beans"})//this is array in which we are adding the value
public class SpringConfigFile { //in java based annotation we don't need to write the bean or anything in here that we use to do in java based configuration

	
}
