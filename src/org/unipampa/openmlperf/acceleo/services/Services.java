package org.unipampa.openmlperf.acceleo.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.emf.ecore.EObject;

import openmlperf.openmlperfPerformanceScenario.Scripting;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.Activity;
import openmlperf.openmlperfPerformanceScenario.openmlperfPerformanceScripting.DataTable;

public class Services{
	
	    
	
	public String retornaTable(DataTable datatable) {

		String frase = "";
		
		System.out.print("Teste de service: "+datatable.getAttachedFile()+"\n");
		
		
		

			
			
			frase = frase.concat("val feeder"+datatable.getAttachedFile().replaceAll("\\.", "")+" (\""+frase.concat(datatable.getAttachedFile())+"\").random\n");
			
	
		return frase;
		
		
		
	}
	
public String retornaDataTable(Scripting scr) {
	
		String frase = "";
		
		int feeder = 0;
		
		List<DataTable> datas;
		
		datas = scr.getDatatables();
		
		for(DataTable table : datas) {
			feeder = feeder+1;
			
			
			
			frase = frase.concat("val feeder"+table.getAttachedFile().replaceAll("\\.", "")+" (\""+frase.concat(table.getAttachedFile())+"\").random\n");
			
		}
		
	
		
		return frase;
		
		
		
	}


public String retornaAtividades(Scripting scr) {
	String frase = "";
	String nome = "";
	List<Activity> act = scr.getActivities();
	System.out.print("act "+act.size());
	for(Activity activity : act) {
		nome = "";
		
		
		nome = activity.getName().replaceAll(" ", "_");
	
		
//		frase = "val "+frase.concat(nome.trim().toLowerCase()+
//				" = scenario(\"RecordedSimulation\")\n");
		
		frase = frase +".exec(http(\"request_0\")\n"
		+activity.getMethod().getLiteral().toLowerCase()+"(\""+activity.getAction()+"\"\n)";
		
		if(activity.getDatatable() != null) {
			
			frase = frase+".feed(feeder"+activity.getDatatable().getAttachedFile().replaceAll("\\.", "")+")\n";
		}
				
		//frase = frase +".headers("+scr.getDatatables().
	}
	
	return frase;
	
}

public String returnTableParam(Activity act) {

String phrase = ""	;
	
if(act.getDatatable() != null) {
	
	phrase = phrase+".feed(feeder"+act.getDatatable().getAttachedFile().replaceAll("\\.", "")+")\n";
}
	
	return phrase;
	
}




}
