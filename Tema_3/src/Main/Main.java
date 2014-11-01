package Main;

import clase.Fotbal_sala;
import Exception.MyException;

public class Main {
	public static void main(String[] args) {
	try{ 
		Fotbal_sala meci1=new Fotbal_sala();
		meci1.start();
		meci1.set_away_team("Steaua");
		meci1.set_home_team("Dinamo");
		meci1.set_score(3, 2);
		meci1.afisare_meci();
		meci1.afisare_scor();
	}
	catch(MyException m){
		System.out.println(m.getMessage());
	}
}
}
