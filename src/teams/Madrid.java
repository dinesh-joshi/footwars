package teams;

public class Madrid{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 4;
	public static int number_of_mid = 3;
	public static int number_of_str = 5;
		   
    
    public static void navas(){			//player1
        
    	team_stat[0][0] = 85;
    	team_stat[0][1] = 87;
    	team_stat[0][2] = 85;
    	team_stat[0][3] = 82;
    	team_stat[0][4] = 61;
    	team_stat[0][5] = 72;
    	team_stat[0][6] = 82;	
    										
    	
    }
    
    public static void marcelo(){			//player2
    	team_stat[1][0] = 87;
        team_stat[1][1] = 78;
        team_stat[1][2] = 85;
        team_stat[1][3] = 69;
        team_stat[1][4] = 82;
        team_stat[1][5] = 80;
        team_stat[1][6] = 79;
    }
    
    public static void ramos(){			//player3
    	team_stat[2][0] = 90;
        team_stat[2][1] = 78;
        team_stat[2][2] = 70;
        team_stat[2][3] = 66;
        team_stat[2][4] = 87;
        team_stat[2][5] = 73;
        team_stat[2][6] = 84;
        		
    }
    
    public static void carvajal(){			//player4
    	team_stat[3][0] = 84;
        team_stat[3][1] = 82;
        team_stat[3][2] = 79;
        team_stat[3][3] = 45;
        team_stat[3][4] = 82;
        team_stat[3][5] = 73;
        team_stat[3][6] = 78;
    }
    
    public static void varane(){				//player5
    	team_stat[4][0] = 85;
        team_stat[4][1] = 78;
        team_stat[4][2] = 63;
        team_stat[4][3] = 44;
        team_stat[4][4] = 85;
        team_stat[4][5] = 61;
        team_stat[4][6] = 80;
    }
    
    public static void kroos(){					//player6
    	team_stat[5][0] = 89;
        team_stat[5][1] = 55;
        team_stat[5][2] = 80;
        team_stat[5][3] = 80;
        team_stat[5][4] = 70;
        team_stat[5][5] = 89;
       	team_stat[5][6] = 70;
    }    
    
    public static void modric(){					//player7
    	team_stat[6][0] = 89;
        team_stat[6][1] = 73;
        team_stat[6][2] = 89;
        team_stat[6][3] = 75;
        team_stat[6][4] = 72;
        team_stat[6][5] = 86;
        team_stat[6][6] = 65;
    }
    
    public static void casemiro(){				//player8
    	team_stat[7][0] = 85;
        team_stat[7][1] = 63;
        team_stat[7][2] = 73;
        team_stat[7][3] = 69;
        team_stat[7][4] = 84;
        team_stat[7][5] = 74;
        team_stat[7][6] = 85;
    }
    
    public static void bale(){				//player9
    	team_stat[8][0] = 89;
        team_stat[8][1] = 92;
        team_stat[8][2] = 85;
        team_stat[8][3] = 87;
        team_stat[8][4] = 57;
        team_stat[8][5] = 75;
        team_stat[8][6] = 84;
    }
    
    public static void benzema(){				//player10
    	team_stat[9][0] = 86;
        team_stat[9][1] = 78;
        team_stat[9][2] = 82;
        team_stat[9][3] = 84;
        team_stat[9][4] = 22;
        team_stat[9][5] = 74;
        team_stat[9][6] = 77;
    }
    
    public static void ronaldo(){				//player11
    	team_stat[10][0] = 94;
        team_stat[10][1] = 90;
        team_stat[10][2] = 90;
        team_stat[10][3] = 93;
        team_stat[10][4] = 33;
        team_stat[10][5] = 82;
        team_stat[10][6] = 80;
    }
    
    public static void get_number_of_player(){
    	
    	number_of_def = 4;
    	number_of_mid = 3;
    	number_of_str = 5;
    	
    }
    
    
    public static int[][] stat_generator(){
    	
    	
    	
    	return team_stat;
    }
    
    public static double[] stat_giver(){
    	
    	
    	navas();
    	ramos();
    	marcelo();
    	carvajal();
    	varane();
    	kroos();
    	modric();
    	casemiro();
    	bale();
    	benzema();
    	ronaldo();
    	//stat_generator();   	
    	
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0])/4;
    	avg_stat[2] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0])/3;
    	avg_stat[3] = (double)(team_stat[5][0] + team_stat[1][0] + team_stat[9][0] + team_stat[10][0] + team_stat[8][0])/5;
    	
    	return avg_stat;
    		
    	
    }
}