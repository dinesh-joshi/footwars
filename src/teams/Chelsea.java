package teams;

public class Chelsea{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 6;
	public static int number_of_mid = 6;
	public static int number_of_str = 2;
		   
    
    public static void courtois(){			//player1
        
    	team_stat[0][0] = 90;
    	team_stat[0][1] = 86;
    	team_stat[0][2] = 89;
    	team_stat[0][3] = 92;
    	team_stat[0][4] = 46;
    	team_stat[0][5] = 71;
    	team_stat[0][6] = 88;	
    										
    	
    }
    
    public static void azpi(){			//player2
    	team_stat[1][0] = 86;
        team_stat[1][1] = 79;
        team_stat[1][2] = 74;
        team_stat[1][3] = 55;
        team_stat[1][4] = 86;
        team_stat[1][5] = 74;
        team_stat[1][6] = 78;
    }
    
    public static void cahill(){			//player3
    	team_stat[2][0] = 83;
        team_stat[2][1] = 70;
        team_stat[2][2] = 63;
        team_stat[2][3] = 60;
        team_stat[2][4] = 86;
        team_stat[2][5] = 55;
        team_stat[2][6] = 80;
        		
    }
    
    public static void christensen(){			//player4
    	team_stat[3][0] = 85;
        team_stat[3][1] = 70;
        team_stat[3][2] = 71;
        team_stat[3][3] = 64;
        team_stat[3][4] = 84;
        team_stat[3][5] = 74;
        team_stat[3][6] = 81;
    }
    
    public static void moses(){				//player5
    	team_stat[4][0] = 80;
        team_stat[4][1] = 85;
        team_stat[4][2] = 84;
        team_stat[4][3] = 73;
        team_stat[4][4] = 69;
        team_stat[4][5] = 73;
        team_stat[4][6] = 75;
    }
    
    public static void alonso(){					//player6
    	team_stat[5][0] = 82;
        team_stat[5][1] = 82;
        team_stat[5][2] = 79;
        team_stat[5][3] = 70;
        team_stat[5][4] = 77;
        team_stat[5][5] = 76;
       	team_stat[5][6] = 82;
    }    
    
    public static void fabregas(){					//player7
    	team_stat[6][0] = 86;
        team_stat[6][1] = 63;
        team_stat[6][2] = 81;
        team_stat[6][3] = 77;
        team_stat[6][4] = 60;
        team_stat[6][5] = 88;
        team_stat[6][6] = 64;
    }
    
    public static void kante(){				//player8
    	team_stat[7][0] = 87;
        team_stat[7][1] = 81;
        team_stat[7][2] = 80;
        team_stat[7][3] = 66;
        team_stat[7][4] = 81;
        team_stat[7][5] = 75;
        team_stat[7][6] = 84;
    }
    
    public static void barkeley(){				//player9
    	team_stat[8][0] = 82;
        team_stat[8][1] = 81;
        team_stat[8][2] = 83;
        team_stat[8][3] = 77;
        team_stat[8][4] = 56;
        team_stat[8][5] = 78;
        team_stat[8][6] = 74;
    }
    
    public static void hazard(){				//player10
    	team_stat[9][0] = 90;
        team_stat[9][1] = 90;
        team_stat[9][2] = 93;
        team_stat[9][3] = 84;
        team_stat[9][4] = 33;
        team_stat[9][5] = 84;
        team_stat[9][6] = 67;
    }
    
    public static void morata(){				//player11
    	team_stat[10][0] = 84;
        team_stat[10][1] = 82;
        team_stat[10][2] = 80;
        team_stat[10][3] = 80;
        team_stat[10][4] = 23;
        team_stat[10][5] = 71;
        team_stat[10][6] = 73;
    }
    
    public static void get_number_of_player(){
    	
    	number_of_def = 6;
    	number_of_mid = 6;
    	number_of_str = 2;
    	
    }
    
    
    public static int[][] stat_generator(){
    	
    	
    	
    	return team_stat;
    }
    
    public static double[] stat_giver(){
    	
    	
    	courtois();
    	azpi();
    	cahill();
    	christensen();
    	moses();
    	alonso();
    	kante();
    	fabregas();
    	barkeley();
    	hazard();
    	morata();
    	//stat_generator();
    	
    	
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0] + team_stat[7][0] + team_stat[4][0])/6;
    	avg_stat[2] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0] + team_stat[4][0] + team_stat[9][0])/6;
    	avg_stat[3] = (double)(team_stat[9][0] + team_stat[10][0])/2;
    	
    	
    	
    	return avg_stat;
    }
}