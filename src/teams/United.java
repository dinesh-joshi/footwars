package teams;

public class United{
	
	
	public static int team_stat[][] = new int[11][7];
	public static double avg_stat[] = new double[4];
	
	public static int number_of_def = 4;
	public static int number_of_mid = 4;
	public static int number_of_str = 3;
		   
    
    public static void degea(){			//player1
        
    	team_stat[0][0] = 90;
    	team_stat[0][1] = 90;
    	team_stat[0][2] = 90;
    	team_stat[0][3] = 85;
    	team_stat[0][4] = 57;
    	team_stat[0][5] = 87;
    	team_stat[0][6] = 86;	
    										
    	
    }
    
    public static void bailly(){			//player2
    	team_stat[1][0] = 84;
        team_stat[1][1] = 82;
        team_stat[1][2] = 61;
        team_stat[1][3] = 42;
        team_stat[1][4] = 85;
        team_stat[1][5] = 57;
        team_stat[1][6] = 86;
    }
    
    public static void jones(){			//player3
    	team_stat[2][0] = 79;
        team_stat[2][1] = 58;
        team_stat[2][2] = 62;
        team_stat[2][3] = 56;
        team_stat[2][4] = 79;
        team_stat[2][5] = 64;
        team_stat[2][6] = 80;
        		
    }
    
    public static void valencia(){			//player4
    	team_stat[3][0] = 83;
        team_stat[3][1] = 87;
        team_stat[3][2] = 81;
        team_stat[3][3] = 65;
        team_stat[3][4] = 78;
        team_stat[3][5] = 75;
        team_stat[3][6] = 85;
    }
    
    public static void blind(){				//player5
    	team_stat[4][0] = 81;
        team_stat[4][1] = 64;
        team_stat[4][2] = 77;
        team_stat[4][3] = 58;
        team_stat[4][4] = 80;
        team_stat[4][5] = 78;
        team_stat[4][6] = 78;
    }
    
    public static void rashford(){					//player6
    	team_stat[5][0] = 77;
        team_stat[5][1] = 90;
        team_stat[5][2] = 80;
        team_stat[5][3] = 73;
        team_stat[5][4] = 32;
        team_stat[5][5] = 69;
       	team_stat[5][6] = 68;
    }    
    
    public static void mata(){					//player7
    	team_stat[6][0] = 84;
        team_stat[6][1] = 68;
        team_stat[6][2] = 85;
        team_stat[6][3] = 76;
        team_stat[6][4] = 33;
        team_stat[6][5] = 84;
        team_stat[6][6] = 55;
    }
    
    public static void mkhitaryan(){				//player8
    	team_stat[7][0] = 85;
        team_stat[7][1] = 86;
        team_stat[7][2] = 86;
        team_stat[7][3] = 79;
        team_stat[7][4] = 54;
        team_stat[7][5] = 80;
        team_stat[7][6] = 70;
    }
    
    public static void pogba(){				//player9
    	team_stat[8][0] = 87;
        team_stat[8][1] = 74;
        team_stat[8][2] = 84;
        team_stat[8][3] = 79;
        team_stat[8][4] = 68;
        team_stat[8][5] = 84;
        team_stat[8][6] = 88;
    }
    
    public static void lukaku(){				//player10
    	team_stat[9][0] = 86;
        team_stat[9][1] = 83;
        team_stat[9][2] = 74;
        team_stat[9][3] = 85;
        team_stat[9][4] = 34;
        team_stat[9][5] = 70;
        team_stat[9][6] = 84;
    }
    
    public static void martial(){				//player11
    	team_stat[10][0] = 82;
        team_stat[10][1] = 91;
        team_stat[10][2] = 85;
        team_stat[10][3] = 79;
        team_stat[10][4] = 41;
        team_stat[10][5] = 70;
        team_stat[10][6] = 74;
    }
    
    public static void get_number_of_player(){
    	
    	number_of_def = 4;
    	number_of_mid = 4;
    	number_of_str = 3;
    	
    }
    
    
    public static int[][] stat_generator(){
    	
    	
    	
    	return team_stat;
    }
    
    public static double[] stat_giver(){
    	
    	
    	degea();
    	blind();
    	bailly();
    	jones();
    	valencia();
    	pogba();
    	mata();
    	mkhitaryan();
    	rashford();
    	lukaku();
    	martial();
    	//stat_generator();
    	
    	
    	
    	avg_stat[0] = (double)team_stat[0][0];
    	avg_stat[1] = (double)(team_stat[1][0] + team_stat[2][0] + team_stat[3][0] + team_stat[4][0])/4;
    	avg_stat[2] = (double)(team_stat[5][0] + team_stat[6][0] + team_stat[7][0] + team_stat[8][0])/4;
    	avg_stat[3] = (double)(team_stat[9][0] + team_stat[10][0] + team_stat[8][0])/3;
    	
    	
    	
    	return avg_stat;
    }
}