package com.iwombat.clase;
import com.iwombat.exception.MyException;
public class FotbalSala extends Fotbal{
	
	
	public void set_nr_jucatori(int nr_juc) {
		this.nr_jucatori=nr_juc;
	}

	public void start() {
		System.out.println("Start meci:");
		ok=1;
	}
	public void afisare_meci() throws MyException 
	{
		if(ok==1)
		{
			System.out.printf("Meciul dintre:%s-%s\n",this.echipa_gazda,this.echipa_oaspete);
		}
		else
			throw new MyException("nu exista echipe!");//exceptie in cazul in care nu va incepe meciul 
		
	}

}
