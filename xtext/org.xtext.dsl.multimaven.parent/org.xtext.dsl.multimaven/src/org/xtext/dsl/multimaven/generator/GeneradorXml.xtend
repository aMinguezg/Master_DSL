package org.xtext.dsl.multimaven.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.dsl.multimaven.multiMaven.Proyecto
import org.xtext.dsl.multimaven.multiMaven.Directorio
import org.xtext.dsl.multimaven.multiMaven.DirectorioPadre

class GeneradorXml {
	
	Resource resource;
	IFileSystemAccess fsa;
	
	new (Resource resource, IFileSystemAccess fsa) {
		this.resource = resource;
		this.fsa = fsa;
	}
	
	def compilar() {
		for(p: resource.allContents.toIterable.filter(typeof(Proyecto))){
			p.compilarTexto;
		}
	}
	
	def compilarTexto(Proyecto p) '''
		«fsa.generateFile(p.padre.path+"/pom.xml", compilarPadre(p.version,p.padre))»
		«FOR d:p.padre.directorios»
			«fsa.generateFile(p.padre.path+"/"+d.name+"/pom.xml", compilarHijos(p.version,d,p.padre))»
		«ENDFOR»
	'''
	
	def compilarPadre(String version, DirectorioPadre p) '''
	<?xml version="1.0" encoding="UTF-8"?>
	<project xmlns="http://maven.apache.org/POM/«version»"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://maven.apache.org/POM/«version» 
			 http://maven.apache.org/xsd/maven-«version».xsd">
	    <modelVersion>«version»</modelVersion>
	
		<!-- parent pom -->
	    <groupId>«p.group»</groupId>
	    <artifactId>«p.artifact»</artifactId>
	    «IF p.packaging !== null »
	    <packaging>«p.packaging»</packaging>
	    «ENDIF» 
		<version>«p.version»</version>
	
	<!-- submodulos -->
	<modules>
	«FOR dir:p.directorios»				
		<module>«dir.artifact»</module>					   
	«ENDFOR»
	</modules>
	    
	    
	    «IF p.dependencias.length > 0 »
	    	<!-- Dependencias -->		    		    
	    	<dependencies>
	    	«FOR dp:p.dependencias»
	    	       <dependency>
	    	           <groupId>«dp.group»</groupId>
	    	           <artifactId>«dp.artifact»</artifactId>
	    	           <version>«dp.version»</version>
	    	           «IF dp.scope !== null »
	    	           <scope>«dp.scope»</scope>
	    	           «ENDIF»
	    	        </dependency>
	    	«ENDFOR»
	    	</dependencies>
	    	«ENDIF»
	    	
	    	«IF p.plugins.length > 0 »
	    	<!-- Plugins -->		    		    
	    	<plugins>
	    	«FOR pl:p.plugins»
	    	<plugin>
	    		      <groupId>«pl.group»</groupId>
	    		      <artifactId>«pl.artifact»</artifactId>
	    		      <version>«pl.version»</version>
	    	 </plugin>
	    	«ENDFOR»
	    	</plugins>
	    	«ENDIF»
		
	</project>
		
	'''
	
	def compilarHijos(String version,Directorio d,DirectorioPadre p) '''
	<?xml version="1.0" encoding="UTF-8"?>
	<project xmlns="http://maven.apache.org/POM/«version»"
	         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	         xsi:schemaLocation="http://maven.apache.org/POM/«version» 
			 http://maven.apache.org/xsd/maven-«version».xsd">
	
		<!-- parent pom -->
		    <parent>
		        <artifactId>«p.artifact»</artifactId>
		        <groupId>«p.group»</groupId>
		        <version>«p.version»</version>
		    </parent>
		    <modelVersion>«version»</modelVersion>
		
			<!-- hijo info -->
		    <groupId>«d.group»</groupId>
		    <artifactId>«d.artifact»</artifactId>
		    <version>«d.version»</version>
		    «IF d.packaging !== null »
		    	<packaging>«d.packaging»</packaging>
		    «ENDIF»
		    
		    
		    «IF d.dependencias.length > 0 »
		    <!-- Dependencias -->		    		    
		    <dependencies>
		    «FOR dp:d.dependencias»
		            <dependency>
		                <groupId>«dp.group»</groupId>
		                <artifactId>«dp.artifact»</artifactId>
		                <version>«dp.version»</version>
		                «IF dp.scope !== null »
		                <scope>«dp.scope»</scope>
		                «ENDIF»
		            </dependency>
		     «ENDFOR»
		    </dependencies>
		    «ENDIF»
		    
		    «IF d.plugins.length > 0 »
		     <!-- Plugins -->		    		    
		    <plugins>
		    «FOR pl:d.plugins»
		    		<plugin>
		    		      <groupId>«pl.group»</groupId>
		    		      <artifactId>«pl.artifact»</artifactId>
		    		      <version>«pl.version»</version>
		    		</plugin>
		    «ENDFOR»
		    </plugins>
		    «ENDIF»
		
	</project>
		
	'''
	
}