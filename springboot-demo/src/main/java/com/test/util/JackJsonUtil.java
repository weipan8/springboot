package com.test.util;

import java.text.SimpleDateFormat;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.map.ser.CustomSerializerFactory;  

public class JackJsonUtil {
	
	  public static ObjectMapper getDefaultObjectMapper() {  
	        ObjectMapper mapper = new ObjectMapper();  
	        //设置将对象转换成JSON字符串时候:包含的属性不能为空或"";    
	        //Include.Include.ALWAYS 默认    
	        //Include.NON_DEFAULT 属性为默认值不序列化    
	        //Include.NON_EMPTY 属性为 空（""）  或者为 NULL 都不序列化    
	        //Include.NON_NULL 属性为NULL 不序列化    
	        mapper.setSerializationInclusion(Inclusion.NON_EMPTY);
	      
	        //当找不到对应的序列化器时 忽略此字段  
	        mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);  
	        //使Jackson JSON支持Unicode编码非ASCII字符  
	        CustomSerializerFactory serializerFactory= new CustomSerializerFactory();  
	        serializerFactory.addSpecificMapping(String.class, new StringUnicodeSerializer());  
	        mapper.setSerializerFactory(serializerFactory);
	      
	        
	        /*//使Jackson JSON支持Unicode编码非ASCII字符  
	        SimpleModule module = new SimpleModule();  
	        module.addSerializer(String.class, new StringUnicodeSerializer());  
	        objectMapper.registerModule(module);  
	        //设置null值不参与序列化(字段不被显示)  
	        objectMapper.setSerializationInclusion(Include.NON_NULL);  
	        //支持结束  
*/	        
	        //设置将MAP转换为JSON时候只转换值不等于NULL的  
	        mapper.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES, false);  
	        mapper.configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);  
	        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));  
	        
	        //设置有属性不能映射成PO时不报错  
	        mapper.disable(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES);  
	        return mapper;  
	    }  

}
