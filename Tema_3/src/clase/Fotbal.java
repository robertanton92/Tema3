package clase;

import interfata.Sport;
import Exception.MyException;
public abstract class Fotbal implements Sport{
	
	int nr_jucatori;
	int nr_schimbari;
	int scor_home;
	int scor_away;
	int ok;
	String echipa_gazda;
	String echipa_oaspete;
	Fotbal()
	{
		nr_jucatori=0;
		nr_schimbari=0;
		ok=0;
	}
	public void set_score(int score_h,int score_a) throws  MyException
	{
		if(ok==1)
		{
			scor_home=score_h;
			scor_away=score_a;
		//daca oke nu va fi egal cu unul nu putem seta scorul, deci va rezulta o exceptie!!!
		}
		else
			throw new MyException("nu se poate seta scorul pentru ca nu a inceput meciul!!");//nu se poate schimba scorul, pentru ca nu a inceput meciul
	
	}
	public void afisare_scor() {
		System.out.printf("Scorul este:%d-%d",scor_home,scor_away);
		
	}

	public void set_home_team(String nume) {
		//System.out.printf("Echipa gazda:%s\n",nume);
		echipa_gazda=nume;
	}

	public void set_away_team(String nume) {
		//System.out.printf("Echipa oaspete:%s\n",nume);
		echipa_oaspete=nume;
	
		
	}
	public abstract void set_nr_jucatori(int nr_juc);
	public abstract void start();
	public abstract void afisare_meci() throws  MyException ;

}
