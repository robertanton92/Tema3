package clase;

import interfata.Sport;

public class Handbal implements Sport {

	int scor_home;
	int scor_away;
	Handbal()
	{
		scor_home=0;
		scor_away=0;
		
	}
	public void afisare_scor() {
		System.out.printf("Scorul este:%d-%d",scor_home,scor_away);
		
	}

	public void set_home_team(String nume) {
		System.out.println("Echipa gazda:");
		System.out.print(nume);
	}
	public void set_score(int score_h,int score_a)
	{
		scor_home=score_h;
		scor_away=score_a;
	
	}

	public void set_away_team(String nume) {
		System.out.println("Echipa oaspete:");
		System.out.print(nume);
		
	}
	
	public void set_timeout(){
		System.out.println("Se cere time_out!");
	}
}

