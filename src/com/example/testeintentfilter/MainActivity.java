package com.example.testeintentfilter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	//Mettodo que faz uma chamad para tela 
	//Sendo chamada ou a tela 1 ou a tela 2
	public void dispararAcaoTela(View view) {
		Intent intent = new Intent("ACAO_TELA");
		startActivity(intent);
	}
	
	//Metodo que chama uma tela incluindo uma categoria
	//Será retornado apenas a tela 2
	//que possui um filtro chamado CATEGORIA_TELA
	public void dispararAcaoTelaCategoria(View view) {
		Intent intent = new Intent("ACAO_TELA");
		intent.addCategory("CATEGORIA_TELA");
		startActivity(intent);
	}
	
	
	//metodo abre o navegador 
	//a Intent chama o navegador com o parametro ACTION_VIEW e uma url
	public void abrirNavegador(View view) {
		Uri uri = Uri.parse("http://www.tairoroberto.kinghost.net");
		Intent intent = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(intent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
