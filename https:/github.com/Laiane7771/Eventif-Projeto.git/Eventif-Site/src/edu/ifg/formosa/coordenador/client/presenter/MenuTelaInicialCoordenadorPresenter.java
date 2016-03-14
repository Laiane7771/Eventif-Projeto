package edu.ifg.formosa.coordenador.client.presenter;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.ui.HasWidgets;

import edu.ifg.formosa.coordenador.client.view.MenuTelaInicialCoordenadorView;

public class MenuTelaInicialCoordenadorPresenter implements Presenter{
	
	private MenuTelaInicialCoordenadorView MenuInicial;
	private final HandlerManager eventBus;

	public MenuTelaInicialCoordenadorPresenter(MenuTelaInicialCoordenadorView MenuInicial, HandlerManager eventBus){
		this.MenuInicial = MenuInicial;
		this.eventBus = eventBus;
	}

	public void bind(){
		
	}
	public void go(HasWidgets container, HasWidgets containerDois,
			HasWidgets containerTres) {
		container.add(MenuInicial.asWidget());
	}
}
