package com.iwombat.interfata;

import com.iwombat.exception.MyException;

public interface Sport {

public void set_score(int scor_h,int scor_a) throws  MyException;
public void set_home_team(String nume);
public void set_away_team(String nume);
public void afisare_scor();
}
