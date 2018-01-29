package teams;

public class Juventus{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 5;
	public static int number_of_mid = 6;
	public static int number_of_str = 3;
		   
    
    public static void buffon(){			//player1
        
    	team_stat[0][0] = 88;
    	team_stat[0][1] = 86;
    	team_stat[0][2] = 84;
    	team_stat[0][3] = 89;
    	team_stat[0][4] = 48;
    	team_stat[0][5] = 68;
    	team_stat[0][6] = 91;	
    										
    	
    }
    
    public static void barzagli(){			//player2
    	team_stat[1][0] = 85;
        team_stat[1][1] = 72;
        team_stat[1][2] = 63;
        team_stat[1][3] = 37;
        team_stat[1][4] = 87;
        team_stat[1][5] = 57;
        team_stat[1][6] = 79;
    }
    
    public static void bonucci(){			//player3
    	team_stat[2][0] = 88;
        team_stat[2][1] = 70;
        team_stat[2][2] = 70;
        team_stat[2][3] = 53;
        team_stat[2][4] = 88;
        team_stat[2][5] = 69;
        team_stat[2][6] = 83;
        		
    }
    
    public static void chiellini(){			//player4
    	team_stat[3][0] = 88;
        team_stat[3][1] = 73;
        team_stat[3][2] = 59;
        team_stat[3][3] = 47;
        team_stat[3][4] = 90;
        team_stat[3][5] = 53;
        team_stat[3][6] = 85;
    }
    
    public static void benatia(){				//player5
    	team_stat[4][0] = 84;
        team_stat[4][1] = 74;
        team_stat[4][2] = 65;
        team_stat[4][3] = 42;
        team_stat[4][4] = 85;
        team_stat[4][5] = 54;
        team_stat[4][6] = 82;
    }
    
    public static void sandro(){					//player6
    	team_stat[5][0] = 86;
        team_stat[5][1] = 86;
        team_stat[5][2] = 81;
        team_stat[5][3] = 65;
        team_stat[5][4] = 81;
        team_stat[5][5] = 77;
       	team_stat[5][6] = 84;
    }    
    
    public static void pjanic(){					//player7
    	team_stat[6][0] = 86;
        team_stat[6][1] = 75;
        team_stat[6][2] = 85;
        team_stat[6][3] = 76;
        team_stat[6][4] = 64;
        team_stat[6][5] = 87;
        team_stat[6][6] = 68;
    }
    
    public static void khedira(){				//player8
    	team_stat[7][0] = 85;
        team_stat[7][1] = 67;
        team_stat[7][2] = 78;
        team_stat[7][3] = 77;
        team_stat[7][4] = 83;
        team_stat[7][5] = 90;
        team_stat[7][6] = 85;
    }
    
    public static void dybala(){				//player9
    	team_stat[8][0] = 90;
        team_stat[8][1] = 81;
        team_stat[8][2] = 84;
        team_stat[8][3] = 89;
        team_stat[8][4] = 24;
        team_stat[8][5] = 72;
        team_stat[8][6] = 78;
    }
    
    public static void mandzukic(){				//player10
    	team_stat[9][0] = 83;
        team_stat[9][1] = 70;
        team_stat[9][2] = 74;
        team_stat[9][3] = 79;
        team_stat[9][4] = 42;
        team_stat[9][5] = 61;
        team_stat[9][6] = 85;
    }
    
    public static void higuain(){				//player11
    	team_stat[10][0] = 90;
        team_stat[10][1] = 81;
        team_stat[10][2] = 84;
        team_stat[10][3] = 89;
        team_stat[10][4] = 24;
        team_stat[10][5] = 72;
        team_stat[10][6] = 78;
    }
    
    public static void get_number_of_player(){
    	
    	number_of_def = 5;
    	number_of_mid = 6;
    	number_of_str = 3;
    	
    }
    
    
    public static int[][] stat_generator(){
    	
    	
    	
    	return team_stat;
    }
    
    public static double[] stat_giver(){
    	
    	
    	buffon();
    	barzagli();
    	bonucci();
    	chiellini();
    	sandro();
    	khedira();
    	pjanic();
    	benatia();
    	higuain();
    	mandzukic();
    	dybala();
    	//stat_generator();
    	
    	
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0] + team_stat[5][0])/5;
    	avg_stat[2] = (double)(team_stat[4][0] + team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0] + team_stat[9][0])/6;
    	avg_stat[3] = (double)(team_stat[9][0] + team_stat[8][0] + team_stat[9][0])/3;
    	
    	
    	
    	return avg_stat;
    }
}