package teams;

public class PSG{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 4;
	public static int number_of_mid = 5;
	public static int number_of_str = 5;
		   
    
    public static void trapp(){			//player1
        
    	team_stat[0][0] = 83;
    	team_stat[0][1] = 84;
    	team_stat[0][2] = 78;
    	team_stat[0][3] = 45;
    	team_stat[0][4] = 79;
    	team_stat[0][5] = 84;
    	team_stat[0][6] = 82;	
    										
    	
    }
    
    public static void alves(){			//player2
    	team_stat[1][0] = 85;
        team_stat[1][1] = 86;
        team_stat[1][2] = 82;
        team_stat[1][3] = 70;
        team_stat[1][4] = 78;
        team_stat[1][5] = 77;
        team_stat[1][6] = 70;
    }
    
    public static void silva(){			//player3
    	team_stat[2][0] = 88;
        team_stat[2][1] = 69;
        team_stat[2][2] = 88;
        team_stat[2][3] = 73;
        team_stat[2][4] = 40;
        team_stat[2][5] = 80;
        team_stat[2][6] = 63;
        		
    }
    
    public static void meunier(){			//player4
    	team_stat[3][0] = 77;
        team_stat[3][1] = 76;
        team_stat[3][2] = 73;
        team_stat[3][3] = 72;
        team_stat[3][4] = 73;
        team_stat[3][5] = 73;
        team_stat[3][6] = 84;
    }
    
    public static void marquinhos(){				//player5
    	team_stat[4][0] = 82;
        team_stat[4][1] = 73;
        team_stat[4][2] = 69;
        team_stat[4][3] = 38;
        team_stat[4][4] = 84;
        team_stat[4][5] = 67;
        team_stat[4][6] = 74;
    }
    
    public static void rabiot(){					//player6
    	team_stat[5][0] = 76;
        team_stat[5][1] = 63;
        team_stat[5][2] = 74;
        team_stat[5][3] = 63;
        team_stat[5][4] = 68;
        team_stat[5][5] = 75;
       	team_stat[5][6] = 75;
    }    
    
    public static void draxler(){					//player7
    	team_stat[6][0] = 85;
        team_stat[6][1] = 78;
        team_stat[6][2] = 86;
        team_stat[6][3] = 80;
        team_stat[6][4] = 34;
        team_stat[6][5] = 81;
        team_stat[6][6] = 66;
    }
    
    public static void dimaria(){				//player8
    	team_stat[7][0] = 85;
        team_stat[7][1] = 86;
        team_stat[7][2] = 85;
        team_stat[7][3] = 77;
        team_stat[7][4] = 47;
        team_stat[7][5] = 82;
        team_stat[7][6] = 68;
    }
    
    public static void neymar(){				//player9
    	team_stat[8][0] = 92;
        team_stat[8][1] = 92;
        team_stat[8][2] = 94;
        team_stat[8][3] = 84;
        team_stat[8][4] = 30;
        team_stat[8][5] = 79;
        team_stat[8][6] = 60;
    }
    
    public static void cavani(){				//player10
    	team_stat[9][0] = 87;
        team_stat[9][1] = 77;
        team_stat[9][2] = 80;
        team_stat[9][3] = 83;
        team_stat[9][4] = 43;
        team_stat[9][5] = 72;
        team_stat[9][6] = 81;
    }
    
    public static void mbappe(){				//player11
    	team_stat[10][0] = 83;
        team_stat[10][1] = 90;
        team_stat[10][2] = 84;
        team_stat[10][3] = 80;
        team_stat[10][4] = 47;
        team_stat[10][5] = 74;
        team_stat[10][6] = 74;
    }
    
    public static void get_number_of_player(){
    	
    	number_of_def = 4;
    	number_of_mid = 5;
    	number_of_str = 5;
    	
    }
    
   
    public static int[][] stat_generator(){
    	
    	
    	
    	return team_stat;
    }
    
    public static double[] stat_giver(){
    	
    	
    	trapp();
    	alves();
    	meunier();
    	silva();
    	marquinhos();
    	rabiot();
    	draxler();
    	dimaria();
    	neymar();
    	cavani();
    	mbappe();
    	//stat_generator();
    	
    	
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0])/4;
    	avg_stat[2] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0] + team_stat[10][0])/5;
    	avg_stat[3] = (double)(team_stat[9][0] + team_stat[10][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0])/5;
    	
    	
    	
    	return avg_stat;
    }
}