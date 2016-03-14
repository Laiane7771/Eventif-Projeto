package edu.ifg.formosa.coordenador.client.view;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CoordenadorCadastrarMonitorView extends Composite{
	
	private HorizontalPanel hpPainelTituloPaginaCadastrarMonitor;
	private HorizontalPanel hpPainelInformacoesMonitor;
	private HorizontalPanel hpPainelNomeMonitor;
	private HorizontalPanel hpPainelMatriculaMonitor;
	private HorizontalPanel hpPainelRgMonitor;
	private HorizontalPanel hpPainelCpfMonitor;
	private HorizontalPanel hpPainelContatoMonitor;
	private HorizontalPanel hpPainelTelefoneMonitor;
	private HorizontalPanel hpPainelEmailMonitor;
	private HorizontalPanel hpPainelEnderecoMonitor;
	private HorizontalPanel hpPainelEnderecodoMonitor;
	private HorizontalPanel hpPainelNumeroBairroMonitor;
	private HorizontalPanel hpPainelCidadeUfMonitor;
	private VerticalPanel vpPainelInformacoesPessoaisMonitor;
	private VerticalPanel vpPainelContatoMonitor;
	private VerticalPanel vpPainelEnderecoMonitor;
	private VerticalPanel vpPainelCadastrarMonitor;
	private Label lbTituloPaginaCadastrarMonitor;
	private Label lbInformacoesMonitor;
	private Label lbNomeMonitor;
	private Label lbMatriculaMonitor;
	private Label lbRgMonitor;
	private Label lbCpfMonitor;
	private Label lbContatoMonitor;
	private Label lbTelefoneMonitor;
	private Label lbEmailMonitor;
	private Label lbEnderecoMonitor;
	private Label lbEnderecodoMonitor;
	private Label lbNumeroMonitor;
	private Label lbBairroMonitor;
	private Label lbCidadeMonitor;
	private Label lbEstadoMonitor;
	private TextBox tbNomeMonitor;
	private TextBox tbMatriculaMonitor;
	private TextBox tbRgMonitor;
	private TextBox tbCpfMonitor;
	private TextBox tbTelefoneMonitor;
	private TextBox tbEmailMonitor;
	private TextBox tbEnderecodoMonitor;
	private TextBox tbNumeroMonitor;
	private TextBox tbCidadeMonitor;
	private ListBox listUfMonitor;
	
	public CoordenadorCadastrarMonitorView(){
		
		hpPainelTituloPaginaCadastrarMonitor = new HorizontalPanel();
		hpPainelTituloPaginaCadastrarMonitor.setStyleName("hpPainelTituloPaginaCadastrarMonitor");
		
		lbTituloPaginaCadastrarMonitor = new Label("Cadastrar Monitor");
		lbTituloPaginaCadastrarMonitor.setStyleName("lbTituloPaginaCadastrarMonitor");
		
		hpPainelTituloPaginaCadastrarMonitor.add(lbTituloPaginaCadastrarMonitor); //add item
		//----------------------------------------------
		hpPainelInformacoesMonitor = new HorizontalPanel();
		hpPainelInformacoesMonitor.setStyleName("hpPainelInformacoesMonitor");
		
		lbInformacoesMonitor = new Label("Informações");
		lbInformacoesMonitor.setStyleName("lbInformacoesMonitor");
		
		hpPainelInformacoesMonitor.add(lbInformacoesMonitor);//add item
		//----------------------------------------------------------
		hpPainelNomeMonitor = new HorizontalPanel();
		hpPainelNomeMonitor.setStyleName("hpPainelNomeMonitor");
		
		lbNomeMonitor = new Label("Nome:");
		lbNomeMonitor.setStyleName("lbNomeMonitor");
		
		tbNomeMonitor = new TextBox();
		tbNomeMonitor.setStyleName("tbNomeMonitor");
		
		hpPainelNomeMonitor.add(lbNomeMonitor);//add item
		hpPainelNomeMonitor.add(tbNomeMonitor);//add item
		//---------------------------------------
		
		hpPainelMatriculaMonitor = new HorizontalPanel();
		hpPainelMatriculaMonitor.setStyleName("hpPainelMatriculaMonitor");
		
		lbMatriculaMonitor = new Label("Matricula:");
		lbMatriculaMonitor.setStyleName("lbMatriculaMonitor");
		
		tbMatriculaMonitor = new TextBox();
		tbMatriculaMonitor.setStyleName("tbMatriculaMonitor");
		
		hpPainelMatriculaMonitor.add(lbMatriculaMonitor);//add item
		hpPainelMatriculaMonitor.setStyleName("hpPainelMatriculaMonitor");//add item
		//-----------------------------------------------
		
		hpPainelRgMonitor = new HorizontalPanel();
		hpPainelRgMonitor.setStyleName("hpPainelRgMonitor");
		
		lbRgMonitor = new Label("RG:");
		lbRgMonitor.setStyleName("lbRgMonitor");
		
		tbRgMonitor = new TextBox();
		tbRgMonitor.setStyleName("tbRgMonitor");
		
		hpPainelRgMonitor.add(lbRgMonitor); //add item
		hpPainelRgMonitor.add(tbRgMonitor);//add item
		//------------------------------------------
		
		hpPainelCpfMonitor = new HorizontalPanel();
		hpPainelCpfMonitor.setStyleName("hpPainelCpfMonitor");
		
		lbCpfMonitor = new Label("CPF:");
		lbCpfMonitor.setStyleName("lbCpfMonitor");
		
		tbCpfMonitor = new TextBox();
		tbCpfMonitor.setStyleName("tbCpfMonitor");
		
		hpPainelCpfMonitor.add(lbCpfMonitor);//add item
		hpPainelCpfMonitor.add(tbCpfMonitor);//add item
		//--------------------------------------------------
		
		hpPainelContatoMonitor = new HorizontalPanel();
		hpPainelContatoMonitor.setStyleName("hpPainelContatoMonitor");
		
		lbContatoMonitor = new Label("Contatos");
		lbContatoMonitor.setStyleName("lbContatoMonitor");
		
		hpPainelContatoMonitor.add(lbContatoMonitor);//add item
		//-------------------------------------------------------
		
		hpPainelTelefoneMonitor = new HorizontalPanel();
		hpPainelTelefoneMonitor.setStyleName("hpPainelTelefoneMonitor");
		
		lbTelefoneMonitor = new Label("Telefone:");
		lbTelefoneMonitor.setStyleName("lbTelefoneMonitor");
		
		tbTelefoneMonitor = new TextBox();
		tbTelefoneMonitor.setStyleName("tbTelefoneMonitor");
		
		hpPainelTelefoneMonitor.add(lbTelefoneMonitor);//add item
		hpPainelTelefoneMonitor.add(tbTelefoneMonitor);//add item
		//-----------------------------------------------------------
		
		hpPainelEmailMonitor = new HorizontalPanel();
		hpPainelEmailMonitor.setStyleName("hpPainelEmailMonitor");
		
		lbEmailMonitor = new Label("Email:");
		lbEmailMonitor.setStyleName("lbEmailMonitor");
		
		tbEmailMonitor = new TextBox();
		tbEmailMonitor.setStyleName("tbEmailMonitor");
		
		hpPainelEmailMonitor.add(lbEmailMonitor);//add item
		hpPainelEmailMonitor.add(tbEmailMonitor);//add item
		//------------------------------------------------------------
		hpPainelEnderecoMonitor = new HorizontalPanel();
		hpPainelEnderecoMonitor.setStyleName("hpPainelEnderecoMonitor");
		
		lbEnderecoMonitor = new Label("Endereço");
		lbEnderecoMonitor.setStyleName("lbEnderecoMonitor");
		
		hpPainelEnderecoMonitor.add(lbEnderecoMonitor); //add item
		//-------------------------------------------------------------
		hpPainelEnderecodoMonitor = new HorizontalPanel();
		hpPainelEnderecodoMonitor.setStyleName("hpPainelEnderecodoMonitor");
		
		lbEnderecodoMonitor = new Label("Endereço:");
		lbEnderecodoMonitor.setStyleName("lbEnderecodoMonitor");
		
		tbEnderecodoMonitor = new TextBox();
		tbEnderecodoMonitor.setStyleName("tbEnderecodoMonitor");
		
		hpPainelEnderecodoMonitor.add(lbEnderecodoMonitor);//add item
		hpPainelEnderecodoMonitor.add(tbEnderecodoMonitor);//add item
		//-----------------------------------------------------------
		
		hpPainelNumeroBairroMonitor = new HorizontalPanel();
		hpPainelNumeroBairroMonitor.setStyleName("hpPainelNumeroBairroMonitor");
		
		lbNumeroMonitor = new Label("Nº:");
		lbNumeroMonitor.setStyleName("lbNumeroMonitor");
		
		tbNumeroMonitor = new TextBox();
		tbNumeroMonitor.setStyleName("tbNumeroMonitor");

		lbBairroMonitor = new Label("Bairro:");
		lbBairroMonitor.setStyleName("lbBairroMonitor");
		
		hpPainelNumeroBairroMonitor.add(lbNumeroMonitor);//add item
		hpPainelNumeroBairroMonitor.add(lbBairroMonitor);//add item
		//---------------------------------------------------------
		hpPainelCidadeUfMonitor = new HorizontalPanel();
		hpPainelCidadeUfMonitor.setStyleName("hpPainelCidadeUfMonitor");
		
		lbCidadeMonitor = new Label("Cidade:");
		lbCidadeMonitor.setStyleName("lbCidadeMonitor");
		
		tbCidadeMonitor = new TextBox();
		tbCidadeMonitor.setStyleName("tbCidadeMonitor");
		
		lbEstadoMonitor = new Label("Estado:");
		lbEstadoMonitor.setStyleName("lbEstadoMonitor");
		
		listUfMonitor = new ListBox();
		listUfMonitor.setStyleName("listUfMonitor");
		
		hpPainelCidadeUfMonitor.add(lbCidadeMonitor); //add item
		hpPainelCidadeUfMonitor.add(tbCidadeMonitor);//add item
		hpPainelCidadeUfMonitor.add(lbEstadoMonitor);//add item
		hpPainelCidadeUfMonitor.add(listUfMonitor);//add item
		//---------------------------------------------------------
		
		vpPainelInformacoesPessoaisMonitor = new VerticalPanel();
		vpPainelInformacoesPessoaisMonitor.setStyleName("vpPainelInformacoesPessoaisMonitor");
		
		vpPainelInformacoesPessoaisMonitor.add(hpPainelInformacoesMonitor);//add item
		vpPainelInformacoesPessoaisMonitor.add(hpPainelNomeMonitor); //add item
		vpPainelInformacoesPessoaisMonitor.add(hpPainelMatriculaMonitor);//add item
		vpPainelInformacoesPessoaisMonitor.add(hpPainelRgMonitor);//add item
		vpPainelInformacoesPessoaisMonitor.add(hpPainelCpfMonitor);//add item
		
		//-------------------------------------------------------
		
		vpPainelContatoMonitor = new VerticalPanel();
		vpPainelContatoMonitor.setStyleName("vpPainelContatoMonitor");
		
		vpPainelContatoMonitor.add(hpPainelContatoMonitor);//add item
		vpPainelContatoMonitor.add(hpPainelTelefoneMonitor);//add item
		vpPainelContatoMonitor.add(hpPainelEmailMonitor);//add item
		
		//-------------------------------------------------------
		
		vpPainelEnderecoMonitor = new VerticalPanel();
		vpPainelEnderecoMonitor.setStyleName("vpPainelEnderecoMonitor");
		
		vpPainelEnderecoMonitor.add(hpPainelEnderecoMonitor);
		vpPainelEnderecoMonitor.add(hpPainelNumeroBairroMonitor);
		vpPainelEnderecoMonitor.add(hpPainelCidadeUfMonitor);
	
		//-------------------------------------------------
		vpPainelCadastrarMonitor = new VerticalPanel();
		vpPainelCadastrarMonitor.setStyleName("vpPainelCadastrarMonitor");
		
		vpPainelCadastrarMonitor.add(vpPainelInformacoesPessoaisMonitor);//add item
		vpPainelCadastrarMonitor.add(vpPainelContatoMonitor);//add item
		vpPainelCadastrarMonitor.add(vpPainelEnderecoMonitor);//add item
		
		initWidget(vpPainelCadastrarMonitor);//add item
	}

	public HorizontalPanel getHpPainelTituloPaginaCadastrarMonitor() {
		return hpPainelTituloPaginaCadastrarMonitor;
	}

	public void setHpPainelTituloPaginaCadastrarMonitor(
			HorizontalPanel hpPainelTituloPaginaCadastrarMonitor) {
		this.hpPainelTituloPaginaCadastrarMonitor = hpPainelTituloPaginaCadastrarMonitor;
	}

	public HorizontalPanel getHpPainelInformacoesMonitor() {
		return hpPainelInformacoesMonitor;
	}

	public void setHpPainelInformacoesMonitor(
			HorizontalPanel hpPainelInformacoesMonitor) {
		this.hpPainelInformacoesMonitor = hpPainelInformacoesMonitor;
	}

	public HorizontalPanel getHpPainelNomeMonitor() {
		return hpPainelNomeMonitor;
	}

	public void setHpPainelNomeMonitor(HorizontalPanel hpPainelNomeMonitor) {
		this.hpPainelNomeMonitor = hpPainelNomeMonitor;
	}

	public HorizontalPanel getHpPainelMatriculaMonitor() {
		return hpPainelMatriculaMonitor;
	}

	public void setHpPainelMatriculaMonitor(HorizontalPanel hpPainelMatriculaMonitor) {
		this.hpPainelMatriculaMonitor = hpPainelMatriculaMonitor;
	}

	public HorizontalPanel getHpPainelRgMonitor() {
		return hpPainelRgMonitor;
	}

	public void setHpPainelRgMonitor(HorizontalPanel hpPainelRgMonitor) {
		this.hpPainelRgMonitor = hpPainelRgMonitor;
	}

	public HorizontalPanel getHpPainelCpfMonitor() {
		return hpPainelCpfMonitor;
	}

	public void setHpPainelCpfMonitor(HorizontalPanel hpPainelCpfMonitor) {
		this.hpPainelCpfMonitor = hpPainelCpfMonitor;
	}

	public HorizontalPanel getHpPainelContatoMonitor() {
		return hpPainelContatoMonitor;
	}

	public void setHpPainelContatoMonitor(HorizontalPanel hpPainelContatoMonitor) {
		this.hpPainelContatoMonitor = hpPainelContatoMonitor;
	}

	public HorizontalPanel getHpPainelTelefoneMonitor() {
		return hpPainelTelefoneMonitor;
	}

	public void setHpPainelTelefoneMonitor(HorizontalPanel hpPainelTelefoneMonitor) {
		this.hpPainelTelefoneMonitor = hpPainelTelefoneMonitor;
	}

	public HorizontalPanel getHpPainelEmailMonitor() {
		return hpPainelEmailMonitor;
	}

	public void setHpPainelEmailMonitor(HorizontalPanel hpPainelEmailMonitor) {
		this.hpPainelEmailMonitor = hpPainelEmailMonitor;
	}

	public HorizontalPanel getHpPainelEnderecoMonitor() {
		return hpPainelEnderecoMonitor;
	}

	public void setHpPainelEnderecoMonitor(HorizontalPanel hpPainelEnderecoMonitor) {
		this.hpPainelEnderecoMonitor = hpPainelEnderecoMonitor;
	}

	public HorizontalPanel getHpPainelEnderecodoMonitor() {
		return hpPainelEnderecodoMonitor;
	}

	public void setHpPainelEnderecodoMonitor(
			HorizontalPanel hpPainelEnderecodoMonitor) {
		this.hpPainelEnderecodoMonitor = hpPainelEnderecodoMonitor;
	}

	public HorizontalPanel getHpPainelNumeroBairroMonitor() {
		return hpPainelNumeroBairroMonitor;
	}

	public void setHpPainelNumeroBairroMonitor(
			HorizontalPanel hpPainelNumeroBairroMonitor) {
		this.hpPainelNumeroBairroMonitor = hpPainelNumeroBairroMonitor;
	}

	public HorizontalPanel getHpPainelCidadeUfMonitor() {
		return hpPainelCidadeUfMonitor;
	}

	public void setHpPainelCidadeUfMonitor(HorizontalPanel hpPainelCidadeUfMonitor) {
		this.hpPainelCidadeUfMonitor = hpPainelCidadeUfMonitor;
	}

	public VerticalPanel getVpPainelInformacoesPessoaisMonitor() {
		return vpPainelInformacoesPessoaisMonitor;
	}

	public void setVpPainelInformacoesPessoaisMonitor(
			VerticalPanel vpPainelInformacoesPessoaisMonitor) {
		this.vpPainelInformacoesPessoaisMonitor = vpPainelInformacoesPessoaisMonitor;
	}

	public VerticalPanel getVpPainelContatoMonitor() {
		return vpPainelContatoMonitor;
	}

	public void setVpPainelContatoMonitor(VerticalPanel vpPainelContatoMonitor) {
		this.vpPainelContatoMonitor = vpPainelContatoMonitor;
	}

	public VerticalPanel getVpPainelEnderecoMonitor() {
		return vpPainelEnderecoMonitor;
	}

	public void setVpPainelEnderecoMonitor(VerticalPanel vpPainelEnderecoMonitor) {
		this.vpPainelEnderecoMonitor = vpPainelEnderecoMonitor;
	}

	public VerticalPanel getVpPainelCadastrarMonitor() {
		return vpPainelCadastrarMonitor;
	}

	public void setVpPainelCadastrarMonitor(VerticalPanel vpPainelCadastrarMonitor) {
		this.vpPainelCadastrarMonitor = vpPainelCadastrarMonitor;
	}

	public Label getLbTituloPaginaCadastrarMonitor() {
		return lbTituloPaginaCadastrarMonitor;
	}

	public void setLbTituloPaginaCadastrarMonitor(
			Label lbTituloPaginaCadastrarMonitor) {
		this.lbTituloPaginaCadastrarMonitor = lbTituloPaginaCadastrarMonitor;
	}

	public Label getLbInformacoesMonitor() {
		return lbInformacoesMonitor;
	}

	public void setLbInformacoesMonitor(Label lbInformacoesMonitor) {
		this.lbInformacoesMonitor = lbInformacoesMonitor;
	}

	public Label getLbNomeMonitor() {
		return lbNomeMonitor;
	}

	public void setLbNomeMonitor(Label lbNomeMonitor) {
		this.lbNomeMonitor = lbNomeMonitor;
	}

	public Label getLbMatriculaMonitor() {
		return lbMatriculaMonitor;
	}

	public void setLbMatriculaMonitor(Label lbMatriculaMonitor) {
		this.lbMatriculaMonitor = lbMatriculaMonitor;
	}

	public Label getLbRgMonitor() {
		return lbRgMonitor;
	}

	public void setLbRgMonitor(Label lbRgMonitor) {
		this.lbRgMonitor = lbRgMonitor;
	}

	public Label getLbCpfMonitor() {
		return lbCpfMonitor;
	}

	public void setLbCpfMonitor(Label lbCpfMonitor) {
		this.lbCpfMonitor = lbCpfMonitor;
	}

	public Label getLbContatoMonitor() {
		return lbContatoMonitor;
	}

	public void setLbContatoMonitor(Label lbContatoMonitor) {
		this.lbContatoMonitor = lbContatoMonitor;
	}

	public Label getLbTelefoneMonitor() {
		return lbTelefoneMonitor;
	}

	public void setLbTelefoneMonitor(Label lbTelefoneMonitor) {
		this.lbTelefoneMonitor = lbTelefoneMonitor;
	}

	public Label getLbEmailMonitor() {
		return lbEmailMonitor;
	}

	public void setLbEmailMonitor(Label lbEmailMonitor) {
		this.lbEmailMonitor = lbEmailMonitor;
	}

	public Label getLbEnderecoMonitor() {
		return lbEnderecoMonitor;
	}

	public void setLbEnderecoMonitor(Label lbEnderecoMonitor) {
		this.lbEnderecoMonitor = lbEnderecoMonitor;
	}

	public Label getLbEnderecodoMonitor() {
		return lbEnderecodoMonitor;
	}

	public void setLbEnderecodoMonitor(Label lbEnderecodoMonitor) {
		this.lbEnderecodoMonitor = lbEnderecodoMonitor;
	}

	public Label getLbNumeroMonitor() {
		return lbNumeroMonitor;
	}

	public void setLbNumeroMonitor(Label lbNumeroMonitor) {
		this.lbNumeroMonitor = lbNumeroMonitor;
	}

	public Label getLbBairroMonitor() {
		return lbBairroMonitor;
	}

	public void setLbBairroMonitor(Label lbBairroMonitor) {
		this.lbBairroMonitor = lbBairroMonitor;
	}

	public Label getLbCidadeMonitor() {
		return lbCidadeMonitor;
	}

	public void setLbCidadeMonitor(Label lbCidadeMonitor) {
		this.lbCidadeMonitor = lbCidadeMonitor;
	}

	public Label getLbEstadoMonitor() {
		return lbEstadoMonitor;
	}

	public void setLbEstadoMonitor(Label lbEstadoMonitor) {
		this.lbEstadoMonitor = lbEstadoMonitor;
	}

	public TextBox getTbNomeMonitor() {
		return tbNomeMonitor;
	}

	public void setTbNomeMonitor(TextBox tbNomeMonitor) {
		this.tbNomeMonitor = tbNomeMonitor;
	}

	public TextBox getTbMatriculaMonitor() {
		return tbMatriculaMonitor;
	}

	public void setTbMatriculaMonitor(TextBox tbMatriculaMonitor) {
		this.tbMatriculaMonitor = tbMatriculaMonitor;
	}

	public TextBox getTbRgMonitor() {
		return tbRgMonitor;
	}

	public void setTbRgMonitor(TextBox tbRgMonitor) {
		this.tbRgMonitor = tbRgMonitor;
	}

	public TextBox getTbCpfMonitor() {
		return tbCpfMonitor;
	}

	public void setTbCpfMonitor(TextBox tbCpfMonitor) {
		this.tbCpfMonitor = tbCpfMonitor;
	}

	public TextBox getTbTelefoneMonitor() {
		return tbTelefoneMonitor;
	}

	public void setTbTelefoneMonitor(TextBox tbTelefoneMonitor) {
		this.tbTelefoneMonitor = tbTelefoneMonitor;
	}

	public TextBox getTbEmailMonitor() {
		return tbEmailMonitor;
	}

	public void setTbEmailMonitor(TextBox tbEmailMonitor) {
		this.tbEmailMonitor = tbEmailMonitor;
	}

	public TextBox getTbEnderecodoMonitor() {
		return tbEnderecodoMonitor;
	}

	public void setTbEnderecodoMonitor(TextBox tbEnderecodoMonitor) {
		this.tbEnderecodoMonitor = tbEnderecodoMonitor;
	}

	public TextBox getTbNumeroMonitor() {
		return tbNumeroMonitor;
	}

	public void setTbNumeroMonitor(TextBox tbNumeroMonitor) {
		this.tbNumeroMonitor = tbNumeroMonitor;
	}

	public TextBox getTbCidadeMonitor() {
		return tbCidadeMonitor;
	}

	public void setTbCidadeMonitor(TextBox tbCidadeMonitor) {
		this.tbCidadeMonitor = tbCidadeMonitor;
	}

	public ListBox getListUfMonitor() {
		return listUfMonitor;
	}

	public void setListUfMonitor(ListBox listUfMonitor) {
		this.listUfMonitor = listUfMonitor;
	}
	
}
