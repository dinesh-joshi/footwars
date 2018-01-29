package teams;

public class Atletico{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 4;
	public static int number_of_mid = 4;
	public static int number_of_str = 4;
    
    public static void oblak(){			//player1
        
    	team_stat[0][0] = 88;
    	team_stat[0][1] = 84;
    	team_stat[0][2] = 84;
    	team_stat[0][3] = 90;
    	team_stat[0][4] = 44;
    	team_stat[0][5] = 78;
    	team_stat[0][6] = 88;	
    										
    	
    }
    
    public static void savic(){			//player2
    	team_stat[1][0] = 81;
        team_stat[1][1] = 67;
        team_stat[1][2] = 56;
        team_stat[1][3] = 35;
        team_stat[1][4] = 84;
        team_stat[1][5] = 52;
        team_stat[1][6] = 76;
    }
    
    public static void godin(){			//player3
    	team_stat[2][0] = 88;
        team_stat[2][1] = 65;
        team_stat[2][2] = 64;
        team_stat[2][3] = 48;
        team_stat[2][4] = 88;
        team_stat[2][5] = 65;
        team_stat[2][6] = 80;
        		
    }
    
    public static void juanfran(){			//player4
    	team_stat[3][0] = 83;
        team_stat[3][1] = 82;
        team_stat[3][2] = 77;
        team_stat[3][3] = 58;
        team_stat[3][4] = 80;
        team_stat[3][5] = 75;
        team_stat[3][6] = 77;
    }
    
    public static void luis(){				//player5
    	team_stat[4][0] = 85;
        team_stat[4][1] = 79;
        team_stat[4][2] = 78;
        team_stat[4][3] = 62;
        team_stat[4][4] = 82;
        team_stat[4][5] = 77;
        team_stat[4][6] = 79;
    }
    
    public static void koke(){					//player6
    	team_stat[5][0] = 84;
        team_stat[5][1] = 70;
        team_stat[5][2] = 81;
        team_stat[5][3] = 75;
        team_stat[5][4] = 63;
        team_stat[5][5] = 86;
       	team_stat[5][6] = 75;
    }    
    
    public static void saul(){					//player7
    	team_stat[6][0] = 82;
        team_stat[6][1] = 73;
        team_stat[6][2] = 81;
        team_stat[6][3] = 69;
        team_stat[6][4] = 77;
        team_stat[6][5] = 78;
        team_stat[6][6] = 75;
    }
    
    public static void carrasco(){				//player8
    	team_stat[7][0] = 85;
        team_stat[7][1] = 88;
        team_stat[7][2] = 87;
        team_stat[7][3] = 79;
        team_stat[7][4] = 29;
        team_stat[7][5] = 78;
        team_stat[7][6] = 63;
    }
    
    public static void gabi(){				//player9
    	team_stat[8][0] = 81;
        team_stat[8][1] = 64;
        team_stat[8][2] = 76;
        team_stat[8][3] = 73;
        team_stat[8][4] = 75;
        team_stat[8][5] = 79;
        team_stat[8][6] = 73;
    }
    
    public static void costa(){				//player10
    	team_stat[9][0] = 87;
        team_stat[9][1] = 80;
        team_stat[9][2] = 82;
        team_stat[9][3] = 86;
        team_stat[9][4] = 40;
        team_stat[9][5] = 64;
        team_stat[9][6] = 90;
    }
    
    public static void griezmann(){				//player11
    	team_stat[10][0] = 88;
        team_stat[10][1] = 86;
        team_stat[10][2] = 87;
        team_stat[10][3] = 85;
        team_stat[10][4] = 30;
        team_stat[10][5] = 78;
        team_stat[10][6] = 68;
    }
    
    public static void get_number_of_player(){
    	
    	number_of_def = 4;
    	number_of_mid = 4;
    	number_of_str = 4;
    	
    }
    
    public static int[][] stat_generator(){  	
    	
    	
    	return team_stat;
    }
    
    public static double[] stat_giver(){
    	
    	oblak();
    	luis();
    	juanfran();
    	godin();
    	savic();
    	gabi();
    	koke();
    	carrasco();
    	saul();
    	costa();
    	griezmann();
    	//stat_generator();
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0])/4;
    	avg_stat[2] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0])/4;
    	avg_stat[3] = (double)(team_stat[9][0] + team_stat[10][0] + team_stat[6][0] + team_stat[7][0])/4;
    	
    	return avg_stat;
    }
    
    
}
    
    
   