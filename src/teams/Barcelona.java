package teams;

public class Barcelona{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 4;
	public static int number_of_mid = 6;
	public static int number_of_str = 3;
		   
    
    public static void terstegen(){			//player1
        
    	team_stat[0][0] = 84;
    	team_stat[0][1] = 84;
    	team_stat[0][2] = 86;
    	team_stat[0][3] = 83;
    	team_stat[0][4] = 69;
    	team_stat[0][5] = 84;
    	team_stat[0][6] = 80;	
    										
    	
    }
    
    public static void umtiti(){			//player2
    	team_stat[1][0] = 83;
        team_stat[1][1] = 76;
        team_stat[1][2] = 70;
        team_stat[1][3] = 64;
        team_stat[1][4] = 83;
        team_stat[1][5] = 80;
        team_stat[1][6] = 70;
    }
    
    public static void pique(){			//player3
    	team_stat[2][0] = 85;
        team_stat[2][1] = 93;
        team_stat[2][2] = 82;
        team_stat[2][3] = 69;
        team_stat[2][4] = 80;
        team_stat[2][5] = 74;
        team_stat[2][6] = 75;
        		
    }
    
    public static void alba(){			//player4
    	team_stat[3][0] = 85;
        team_stat[3][1] = 93;
        team_stat[3][2] = 82;
        team_stat[3][3] = 69;
        team_stat[3][4] = 80;
        team_stat[3][5] = 74;
        team_stat[3][6] = 75;
    }
    
    public static void roberto(){				//player5
    	team_stat[4][0] = 81;
        team_stat[4][1] = 79;
        team_stat[4][2] = 78;
        team_stat[4][3] = 67;
        team_stat[4][4] = 71;
        team_stat[4][5] = 75;
        team_stat[4][6] = 82;
    }
    
    public static void dembele(){					//player6
    	team_stat[5][0] = 83;
        team_stat[5][1] = 93;
        team_stat[5][2] = 86;
        team_stat[5][3] = 76;
        team_stat[5][4] = 42;
        team_stat[5][5] = 58;
       	team_stat[5][6] = 78;
    }    
    
    public static void iniesta(){					//player7
    	team_stat[6][0] = 87;
        team_stat[6][1] = 72;
        team_stat[6][2] = 90;
        team_stat[6][3] = 71;
        team_stat[6][4] = 56;
        team_stat[6][5] = 58;
        team_stat[6][6] = 87;
    }
    
    public static void busquets(){				//player8
    	team_stat[7][0] = 87;
        team_stat[7][1] = 42;
        team_stat[7][2] = 73;
        team_stat[7][3] = 60;
        team_stat[7][4] = 83;
        team_stat[7][5] = 81;
        team_stat[7][6] = 79;
    }
    
    public static void messi(){				//player9
    	team_stat[8][0] = 94;
        team_stat[8][1] = 89;
        team_stat[8][2] = 96;
        team_stat[8][3] = 90;
        team_stat[8][4] = 26;
        team_stat[8][5] = 61;
        team_stat[8][6] = 86;
    }
    
    public static void coutinho(){				//player10
    	team_stat[9][0] = 86;
        team_stat[9][1] = 82;
        team_stat[9][2] = 88;
        team_stat[9][3] = 78;
        team_stat[9][4] = 35;
        team_stat[9][5] = 64;
        team_stat[9][6] = 83;
    }
    
    public static void suarez(){				//player11
    	team_stat[10][0] = 93;
        team_stat[10][1] = 82;
        team_stat[10][2] = 87;
        team_stat[10][3] = 90;
        team_stat[10][4] = 42;
        team_stat[10][5] = 79;
        team_stat[10][6] = 79;
    }
    
    public static void get_number_of_player(){
    	
    	number_of_def = 4;
    	number_of_mid = 6;
    	number_of_str = 3;
    	
    }
    
    public static int[][] stat_generator(){
    	
    	
    	
    	return team_stat;
    }
    
    public static double[] stat_giver(){
    	
    	
    	terstegen();
    	roberto();
    	alba();
    	pique();
    	umtiti();
    	busquets();
    	iniesta();
    	dembele();
    	messi();
    	suarez();
    	coutinho();
    	//stat_generator();
    	
    	
    	
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0])/4;
    	avg_stat[2] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0] + team_stat[9][0] + team_stat[10][0])/6;
    	avg_stat[3] = (double)(team_stat[9][0] + team_stat[10][0] + team_stat[8][0])/3;
    	
    	
    	
    	return avg_stat;
    }
}