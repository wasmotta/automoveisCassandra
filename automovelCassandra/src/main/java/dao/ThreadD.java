/*package dao;

import bean.Automovel;

public class ThreadD implements Runnable{
	
	long contaInsercao = 0;
	boolean mataT = true;
	*//** teremos que fazer um for contando os milisegundos para saber
	 * quanto tempo o metodo leva para inserir *//*
	@Override
	public void run() {
		//for
		while(mataT){
			Automovel aut = new Automovel();
			aut.setNome("Monza");
			aut.setVelocidadeMax("200");
			aut.setCor("Preto");
			AutomovelDao.inserir(aut);
			mataThread(10);
		}
		//fim for
			
	}
	
	public boolean mataThread(long max){
		this.contaInsercao = contaInsercao + 1;
		if(contaInsercao == max){
			mataT = false;
			System.out.println("atingiu a quantidade de insercao ");
		}
		return mataT;
	}
	
	public void pause(int p){
		try {
			Thread.sleep(p);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Thread th = new Thread(new ThreadD());
		th.start();
	}

}
*/