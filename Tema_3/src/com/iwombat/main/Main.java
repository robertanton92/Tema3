package com.iwombat.main;

import com.iwombat.clase.FotbalSala;
import com.iwombat.exception.MyException;


public class Main {
	public static void main(String[] args) {
	try{ 
		FotbalSala meci1=new FotbalSala();
		meci1.start();
		meci1.set_away_team("Steaua");
		meci1.set_home_team("Dinamo");
		meci1.set_score(3, 2);
		meci1.afisare_meci();//
		meci1.afisare_scor();
	}
	catch(MyException m){
		System.out.println(m.getMessage());
	}
}
}
