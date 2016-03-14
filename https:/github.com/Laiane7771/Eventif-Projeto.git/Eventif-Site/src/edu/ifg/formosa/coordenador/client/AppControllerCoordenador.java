package edu.ifg.formosa.coordenador.client;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.presenter.Presenter;

public class AppControllerCoordenador implements Presenter,  ValueChangeHandler<String>{
	
	private final HandlerManager eventBus; 
	private HasWidgets container1;
	private HasWidgets container2;
	private HasWidgets container3;
	
	public AppControllerCoordenador(HandlerManager eventBus){
		this.eventBus = eventBus;
	}

	

	private void bind(){
		
		History.addValueChangeHandler(this);
		
	}

	public void onValueChange(ValueChangeEvent<String>event){
		String token = event.getValue();
		Presenter presenter = null;
		
		
	}
	
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		this.container1 = container;
		this.container2 = containerDois;
		this.container3 = containerTres;
	}
}
