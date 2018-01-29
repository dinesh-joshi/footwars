package teams;

public class Bayern{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 4;
	public static int number_of_mid = 5;
	public static int number_of_str = 5;
		   
    
    public static void neuer(){			//player1
        
    	team_stat[0][0] = 92;
    	team_stat[0][1] = 88;
    	team_stat[0][2] = 89;
    	team_stat[0][3] = 91;
    	team_stat[0][4] = 58;
    	team_stat[0][5] = 95;
    	team_stat[0][6] = 91;	
    										
    	
    }
    
    public static void kimmich(){			//player2
    	team_stat[1][0] = 84;
        team_stat[1][1] = 74;
        team_stat[1][2] = 84;
        team_stat[1][3] = 71;
        team_stat[1][4] = 82;
        team_stat[1][5] = 87;
        team_stat[1][6] = 78;
    }
    
    public static void sule(){			//player3
    	team_stat[2][0] = 81;
        team_stat[2][1] = 67;
        team_stat[2][2] = 54;
        team_stat[2][3] = 49;
        team_stat[2][4] = 86;
        team_stat[2][5] = 60;
        team_stat[2][6] = 85;
        		
    }
    
    public static void alaba(){			//player4
    	team_stat[3][0] = 87;
        team_stat[3][1] = 86;
        team_stat[3][2] = 83;
        team_stat[3][3] = 74;
        team_stat[3][4] = 83;
        team_stat[3][5] = 82;
        team_stat[3][6] = 73;
    }
    
    public static void hummels(){				//player5
    	team_stat[4][0] = 88;
        team_stat[4][1] = 65;
        team_stat[4][2] = 72;
        team_stat[4][3] = 58;
        team_stat[4][4] = 88;
        team_stat[4][5] = 75;
        team_stat[4][6] = 80;
    }
    
    public static void ribery(){					//player6
    	team_stat[5][0] = 86;
        team_stat[5][1] = 81;
        team_stat[5][2] = 89;
        team_stat[5][3] = 77;
        team_stat[5][4] = 24;
        team_stat[5][5] = 84;
       	team_stat[5][6] = 58;
    }    
    
    public static void robben(){					//player7
    	team_stat[6][0] = 88;
        team_stat[6][1] = 86;
        team_stat[6][2] = 91;
        team_stat[6][3] = 86;
        team_stat[6][4] = 32;
        team_stat[6][5] = 82;
        team_stat[6][6] = 63;
    }
    
    public static void rodriguez(){				//player8
    	team_stat[7][0] = 87;
        team_stat[7][1] = 76;
        team_stat[7][2] = 83;
        team_stat[7][3] = 85;
        team_stat[7][4] = 40;
        team_stat[7][5] = 85;
        team_stat[7][6] = 68;
    }
    
    public static void muller(){				//player9
    	team_stat[8][0] = 87;
        team_stat[8][1] = 77;
        team_stat[8][2] = 79;
        team_stat[8][3] = 81;
        team_stat[8][4] = 84;
        team_stat[8][5] = 80;
        team_stat[8][6] = 84;
    }
    
    public static void vidal(){				//player10
    	team_stat[9][0] = 87;
        team_stat[9][1] = 77;
        team_stat[9][2] = 79;
        team_stat[9][3] = 81;
        team_stat[9][4] = 84;
        team_stat[9][5] = 80;
        team_stat[9][6] = 84;
    }
    
    public static void lewandowski(){				//player11
    	team_stat[10][0] = 91;
        team_stat[10][1] = 81;
        team_stat[10][2] = 86;
        team_stat[10][3] = 89;
        team_stat[10][4] = 37;
        team_stat[10][5] = 75;
        team_stat[10][6] = 83;
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
    	
    	
    	neuer();
    	kimmich();
    	sule();
    	hummels();
    	alaba();
    	robben();
    	ribery();
    	muller();
    	vidal();
    	rodriguez();
    	lewandowski();
    	//stat_generator();
    	
    	
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0])/4;
    	avg_stat[2] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0] + team_stat[9][0])/5;
    	avg_stat[3] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0] + team_stat[10][0])/5;
    	
    	
    	
    	return avg_stat;
    }
}