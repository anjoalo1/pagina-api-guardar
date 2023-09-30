package com.example.demo.domain;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "mipagina")
public class Pages {
	
	  	@Id
	    private String id;
	    private String seccion;
	    private List<Object> contenido;
	    
	    
	    
		public Pages() {
		}



		public Pages(String id, String seccion, List<Object> contenido) {
			this.id = id;
			this.seccion = seccion;
			this.contenido = contenido;
		}



		public String getId() {
			return id;
		}



		public void setId(String id) {
			this.id = id;
		}



		public String getSeccion() {
			return seccion;
		}



		public void setSeccion(String seccion) {
			this.seccion = seccion;
		}



		public List<Object> getContenido() {
			return contenido;
		}



		public void setContenido(List<Object> contenido) {
			this.contenido = contenido;
		}
		
		
	    
	    

}
