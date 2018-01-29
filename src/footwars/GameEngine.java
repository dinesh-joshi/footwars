import teams.*;
import java.io.*;



public class GameEngine {
	
	static double atletico_stat[] = new double[4];
	static double barcelona_stat[] = new double[4];
	static double bayern_stat[] = new double[4];
	static double chelsea_stat[] = new double[4];
	static double juventus_stat[] = new double[4];
	static double madrid_stat[] = new double[4];
	static double psg_stat[] = new double[4];
	static double united_stat[] = new double[4];
	
	static int[] number_of_players_atletico = new int[3];
	static int[] number_of_players_barcelona = new int[3];
	static int[] number_of_players_bayern = new int[3];
	static int[] number_of_players_chelsea = new int[3];
	static int[] number_of_players_juventus= new int[3];
	static int[] number_of_players_madrid = new int[3];
	static int[] number_of_players_psg = new int[3];
	static int[] number_of_players_united = new int[3];
	
	
	public static void get_number_of_players_atletico(){
		
            
            number_of_players_atletico[0] = teams.Atletico.number_of_def;
            number_of_players_atletico[1] = teams.Atletico.number_of_mid;
            number_of_players_atletico[2] = teams.Atletico.number_of_str;
        }
        
        public static void get_number_of_players_barcelona(){               
            
            
            number_of_players_barcelona[0] = teams.Barcelona.number_of_def;
            number_of_players_barcelona[1] = teams.Barcelona.number_of_mid;
            number_of_players_barcelona[2] = teams.Barcelona.number_of_str;
        }
        
        public static void get_number_of_players_bayern(){
            
            number_of_players_bayern[0] = teams.Bayern.number_of_def;
            number_of_players_bayern[1] = teams.Bayern.number_of_mid;
            number_of_players_bayern[2] = teams.Bayern.number_of_str;
        }
        
        public static void get_number_of_players_chelsea(){
            
            number_of_players_chelsea[0] = teams.Chelsea.number_of_def;
            number_of_players_chelsea[1] = teams.Chelsea.number_of_mid;
            number_of_players_chelsea[2] = teams.Chelsea.number_of_str;
        }
        
        public static void get_number_of_players_juventus(){
            
            number_of_players_juventus[0] = teams.Juventus.number_of_def;
            number_of_players_juventus[1] = teams.Juventus.number_of_mid;
            number_of_players_juventus[2] = teams.Juventus.number_of_str;
        }
        
        public static void get_number_of_players_madrid(){
            
            number_of_players_madrid[0] = teams.Madrid.number_of_def;
            number_of_players_madrid[1] = teams.Madrid.number_of_mid;
            number_of_players_madrid[2] = teams.Madrid.number_of_str;
        }
        
        public static void get_number_of_players_psg(){
            
            number_of_players_psg[0] = teams.PSG.number_of_def;
            number_of_players_psg[1] = teams.PSG.number_of_mid;
            number_of_players_psg[2] = teams.PSG.number_of_str;
        }    
        
         public static void get_number_of_players_united(){
             
            number_of_players_united[0] = teams.United.number_of_def;
            number_of_players_united[1] = teams.United.number_of_mid;
            number_of_players_united[2] = teams.United.number_of_str;               
           
		
		
	}	
	
	public static void get_values_of_atletico(){
		
            atletico_stat = teams.Atletico.stat_giver();
		
	}
	
	public static void get_values_of_barcelona(){
		
            barcelona_stat = teams.Barcelona.stat_giver();
		
	}
	
	public static void get_values_of_bayern(){
		
            bayern_stat = teams.Bayern.stat_giver();
	}
	
	public static void get_values_of_chelsea(){
		
            chelsea_stat = teams.Chelsea.stat_giver();
	}
	
	public static void get_values_of_juventus(){
		
            juventus_stat = teams.Juventus.stat_giver();
		
	}
	
	public static void get_values_of_madrid(){
		
            madrid_stat = teams.Madrid.stat_giver();
		
	}
	public static void get_values_of_psg(){
		
            psg_stat = teams.PSG.stat_giver();
		
	}
	
	public static void get_values_of_united(){
		
            united_stat = teams.United.stat_giver();
		
	}
        
        
        public static void startMatch(int teamA, int teamB){
            
            char a = 'a';
            char b = 'a';
            char c= 'a';
            char d = 'a';
            
            String team_a = "";
            String team_b = "";
            
            switch(teamA){
                case 1 : get_number_of_players_atletico();
                         get_values_of_atletico();
                         
                         team_a = "Atletico Madrid";
                         
                         
                         switch(teamB){
                            
                            case 2 : get_number_of_players_barcelona();
                                     get_values_of_barcelona();
                                     
                                     a = atletico_stat[0] > barcelona_stat[0] ? 'A' : 'B';
                                     b = atletico_stat[1] > barcelona_stat[1] ? 'A' : 'B';
                                     c = atletico_stat[2] > barcelona_stat[2] ? 'A' : 'B';
                                     d = atletico_stat[3] > barcelona_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Barcelona";
                                     
                                     break;

                            case 3 : get_number_of_players_bayern();
                                     get_values_of_bayern();
                                     
                                     a = atletico_stat[0] > bayern_stat[0] ? 'A' : 'B';
                                     b = atletico_stat[1] > bayern_stat[1] ? 'A' : 'B';
                                     c = atletico_stat[2] > bayern_stat[2] ? 'A' : 'B';
                                     d = atletico_stat[3] > bayern_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Bayern Munich";
                                     
                                     break;    

                            case 4 : get_number_of_players_chelsea();
                                     get_values_of_chelsea();
                                     
                                     a = atletico_stat[0] > chelsea_stat[0] ? 'A' : 'B';
                                     b = atletico_stat[1] > chelsea_stat[1] ? 'A' : 'B';
                                     c = atletico_stat[2] > chelsea_stat[2] ? 'A' : 'B';
                                     d = atletico_stat[3] > chelsea_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Chelsea";
                                             
                                     break;

                            case 5 : get_number_of_players_juventus();
                                     get_values_of_juventus();
                                     
                                     a = atletico_stat[0] > juventus_stat[0] ? 'A' : 'B';
                                     b = atletico_stat[1] > juventus_stat[1] ? 'A' : 'B';
                                     c = atletico_stat[2] > juventus_stat[2] ? 'A' : 'B';
                                     d = atletico_stat[3] > juventus_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Juventus";
                                     
                                     break;


                            case 6 : get_number_of_players_madrid();
                                     get_values_of_madrid();
                                     
                                     a = atletico_stat[0] > madrid_stat[0] ? 'A' : 'B';
                                     b = atletico_stat[1] > madrid_stat[1] ? 'A' : 'B';
                                     c = atletico_stat[2] > madrid_stat[2] ? 'A' : 'B';
                                     d = atletico_stat[3] > madrid_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Real Madrid";
                                     
                                     break;


                            case 7 : get_number_of_players_psg();
                                     get_values_of_psg();
                                     
                                     a = atletico_stat[0] > psg_stat[0] ? 'A' : 'B';
                                     b = atletico_stat[1] > psg_stat[1] ? 'A' : 'B';
                                     c = atletico_stat[2] > psg_stat[2] ? 'A' : 'B';
                                     d = atletico_stat[3] > psg_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Paris St. Germain";
                                     
                                     break;

                            case 8 : get_number_of_players_united();
                                     get_values_of_united();
                                     
                                     a = atletico_stat[0] > united_stat[0] ? 'A' : 'B';
                                     b = atletico_stat[1] > united_stat[1] ? 'A' : 'B';
                                     c = atletico_stat[2] > united_stat[2] ? 'A' : 'B';
                                     d = atletico_stat[3] > united_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Manchester United";
                                     
                                     break;         


                        }
                         
                         break;
                
                case 2 : get_number_of_players_barcelona();
                         get_values_of_barcelona();
                         
                         team_a = "Barcelona";
                         
                         switch(teamB){
                            
                            case 1 : get_number_of_players_atletico();
                                     get_values_of_atletico();
                                     
                                     a = barcelona_stat[0] > atletico_stat[0] ? 'A' : 'B';
                                     b = barcelona_stat[1] > atletico_stat[1] ? 'A' : 'B';
                                     c = barcelona_stat[2] > atletico_stat[2] ? 'A' : 'B';
                                     d = barcelona_stat[3] > atletico_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Atletico";
                                     
                                     break;

                            case 3 : get_number_of_players_bayern();
                                     get_values_of_bayern();
                                     
                                     a = barcelona_stat[0] > bayern_stat[0] ? 'A' : 'B';
                                     b = barcelona_stat[1] > bayern_stat[1] ? 'A' : 'B';
                                     c = barcelona_stat[2] > bayern_stat[2] ? 'A' : 'B';
                                     d = barcelona_stat[3] > bayern_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Bayern Munich";
                                     
                                     break;    

                            case 4 : get_number_of_players_chelsea();
                                     get_values_of_chelsea();
                                     
                                     a = barcelona_stat[0] > chelsea_stat[0] ? 'A' : 'B';
                                     b = barcelona_stat[1] > chelsea_stat[1] ? 'A' : 'B';
                                     c = barcelona_stat[2] > chelsea_stat[2] ? 'A' : 'B';
                                     d = barcelona_stat[3] > chelsea_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Chelsea";
                                     
                                     break;

                            case 5 : get_number_of_players_juventus();
                                     get_values_of_juventus();
                                     
                                     a = barcelona_stat[0] > juventus_stat[0] ? 'A' : 'B';
                                     b = barcelona_stat[1] > juventus_stat[1] ? 'A' : 'B';
                                     c = barcelona_stat[2] > juventus_stat[2] ? 'A' : 'B';
                                     d = barcelona_stat[3] > juventus_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Juventus";
                                     
                                     break;


                            case 6 : get_number_of_players_madrid();
                                     get_values_of_madrid();
                                     
                                     a = barcelona_stat[0] > madrid_stat[0] ? 'A' : 'B';
                                     b = barcelona_stat[1] > madrid_stat[1] ? 'A' : 'B';
                                     c = barcelona_stat[2] > madrid_stat[2] ? 'A' : 'B';
                                     d = barcelona_stat[3] > madrid_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Real Madrid";
                                     
                                     break;


                            case 7 : get_number_of_players_psg();
                                     get_values_of_psg();
                                     
                                     a = barcelona_stat[0] > psg_stat[0] ? 'A' : 'B';
                                     b = barcelona_stat[1] > psg_stat[1] ? 'A' : 'B';
                                     c = barcelona_stat[2] > psg_stat[2] ? 'A' : 'B';
                                     d = barcelona_stat[3] > psg_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Paris St. Germain";
                                     
                                     break;

                            case 8 : get_number_of_players_united();
                                     get_values_of_united();
                                     
                                     a = barcelona_stat[0] > united_stat[0] ? 'A' : 'B';
                                     b = barcelona_stat[1] > united_stat[1] ? 'A' : 'B';
                                     c = barcelona_stat[2] > united_stat[2] ? 'A' : 'B';
                                     d = barcelona_stat[3] > united_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Manchester United";
                                     
                                     break;         


                        }
                         
                         break;
                         
                case 3 : get_number_of_players_bayern();
                         get_values_of_bayern();
                         
                         team_a = "Bayern Munich";
                         
                         switch(teamB){
                            
                            case 1 : get_number_of_players_atletico();
                                     get_values_of_atletico();
                                     
                                     a = bayern_stat[0] > atletico_stat[0] ? 'A' : 'B';
                                     b = bayern_stat[1] > atletico_stat[1] ? 'A' : 'B';
                                     c = bayern_stat[2] > atletico_stat[2] ? 'A' : 'B';
                                     d = bayern_stat[3] > atletico_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Atletico Madrid";
                                     
                                     break;

                            case 2 : get_number_of_players_barcelona();
                                     get_values_of_barcelona();
                                     
                                     a = bayern_stat[0] > barcelona_stat[0] ? 'A' : 'B';
                                     b = bayern_stat[1] > barcelona_stat[1] ? 'A' : 'B';
                                     c = bayern_stat[2] > barcelona_stat[2] ? 'A' : 'B';
                                     d = bayern_stat[3] > barcelona_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Barcelona";
                                     
                                     break;    

                            case 4 : get_number_of_players_chelsea();
                                     get_values_of_chelsea();
                                     
                                     a = bayern_stat[0] > chelsea_stat[0] ? 'A' : 'B';
                                     b = bayern_stat[1] > chelsea_stat[1] ? 'A' : 'B';
                                     c = bayern_stat[2] > chelsea_stat[2] ? 'A' : 'B';
                                     d = bayern_stat[3] > chelsea_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Chelsea";
                                     
                                     break;

                            case 5 : get_number_of_players_juventus();
                                     get_values_of_juventus();
                                     
                                     a = bayern_stat[0] > juventus_stat[0] ? 'A' : 'B';
                                     b = bayern_stat[1] > juventus_stat[1] ? 'A' : 'B';
                                     c = bayern_stat[2] > juventus_stat[2] ? 'A' : 'B';
                                     d = bayern_stat[3] > juventus_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Juventus";
                                     
                                     break;


                            case 6 : get_number_of_players_madrid();
                                     get_values_of_madrid();
                                     
                                     a = bayern_stat[0] > madrid_stat[0] ? 'A' : 'B';
                                     b = bayern_stat[1] > madrid_stat[1] ? 'A' : 'B';
                                     c = bayern_stat[2] > madrid_stat[2] ? 'A' : 'B';
                                     d = bayern_stat[3] > madrid_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Real Madrid";
                                     
                                     break;


                            case 7 : get_number_of_players_psg();
                                     get_values_of_psg();
                                     
                                     a = bayern_stat[0] > psg_stat[0] ? 'A' : 'B';
                                     b = bayern_stat[1] > psg_stat[1] ? 'A' : 'B';
                                     c = bayern_stat[2] > psg_stat[2] ? 'A' : 'B';
                                     d = bayern_stat[3] > psg_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Paris St. Germain";
                                     
                                     break;

                            case 8 : get_number_of_players_united();
                                     get_values_of_united();
                                     
                                     a = bayern_stat[0] > united_stat[0] ? 'A' : 'B';
                                     b = bayern_stat[1] > united_stat[1] ? 'A' : 'B';
                                     c = bayern_stat[2] > united_stat[2] ? 'A' : 'B';
                                     d = bayern_stat[3] > united_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Manchester United";
                                     
                                     break;         


                        }

                         
                         break;    
            
                case 4 : get_number_of_players_chelsea();
                         get_values_of_chelsea();
                         
                         team_a = "Chelsea";
                         
                         switch(teamB){
                            
                            case 1 : get_number_of_players_atletico();
                                     get_values_of_atletico();
                                     
                                     a = chelsea_stat[0] > atletico_stat[0] ? 'A' : 'B';
                                     b = chelsea_stat[1] > atletico_stat[1] ? 'A' : 'B';
                                     c = chelsea_stat[2] > atletico_stat[2] ? 'A' : 'B';
                                     d = chelsea_stat[3] > atletico_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Atletico Madrid";
                                     
                                     break;

                            case 2 : get_number_of_players_barcelona();
                                     get_values_of_barcelona();
                                     
                                     a = chelsea_stat[0] > barcelona_stat[0] ? 'A' : 'B';
                                     b = chelsea_stat[1] > barcelona_stat[1] ? 'A' : 'B';
                                     c = chelsea_stat[2] > barcelona_stat[2] ? 'A' : 'B';
                                     d = chelsea_stat[3] > barcelona_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Barcelona";
                                     
                                     break;    

                            case 3 : get_number_of_players_bayern();
                                     get_values_of_bayern();
                                     
                                     a = chelsea_stat[0] > bayern_stat[0] ? 'A' : 'B';
                                     b = chelsea_stat[1] > bayern_stat[1] ? 'A' : 'B';
                                     c = chelsea_stat[2] > bayern_stat[2] ? 'A' : 'B';
                                     d = chelsea_stat[3] > bayern_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Bayern Munich";
                                     
                                     break;

                            case 5 : get_number_of_players_juventus();
                                     get_values_of_juventus();
                                     
                                     a = chelsea_stat[0] > juventus_stat[0] ? 'A' : 'B';
                                     b = chelsea_stat[1] > juventus_stat[1] ? 'A' : 'B';
                                     c = chelsea_stat[2] > juventus_stat[2] ? 'A' : 'B';
                                     d = chelsea_stat[3] > juventus_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Juventus";
                                     
                                     break;


                            case 6 : get_number_of_players_madrid();
                                     get_values_of_madrid();
                                     
                                     a = chelsea_stat[0] > madrid_stat[0] ? 'A' : 'B';
                                     b = chelsea_stat[1] > madrid_stat[1] ? 'A' : 'B';
                                     c = chelsea_stat[2] > madrid_stat[2] ? 'A' : 'B';
                                     d = chelsea_stat[3] > madrid_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Real Madrid";
                                     
                                     break;


                            case 7 : get_number_of_players_psg();
                                     get_values_of_psg();
                                     
                                     a = chelsea_stat[0] > psg_stat[0] ? 'A' : 'B';
                                     b = chelsea_stat[1] > psg_stat[1] ? 'A' : 'B';
                                     c = chelsea_stat[2] > psg_stat[2] ? 'A' : 'B';
                                     d = chelsea_stat[3] > psg_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Paris St. Germain";
                                     
                                     break;

                            case 8 : get_number_of_players_united();
                                     get_values_of_united();
                                     
                                     a = chelsea_stat[0] > united_stat[0] ? 'A' : 'B';
                                     b = chelsea_stat[1] > united_stat[1] ? 'A' : 'B';
                                     c = chelsea_stat[2] > united_stat[2] ? 'A' : 'B';
                                     d = chelsea_stat[3] > united_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Manchester United";
                                     
                                     break;         


                        }
                         
                         break;
                         
                case 5 : get_number_of_players_juventus();
                         get_values_of_juventus();
                         
                         team_a = "Juventus";
                         
                         switch(teamB){
                            
                            case 1 : get_number_of_players_atletico();
                                     get_values_of_atletico();
                                     
                                     a = juventus_stat[0] > atletico_stat[0] ? 'A' : 'B';
                                     b = juventus_stat[1] > atletico_stat[1] ? 'A' : 'B';
                                     c = juventus_stat[2] > atletico_stat[2] ? 'A' : 'B';
                                     d = juventus_stat[3] > atletico_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Atletico Madrid";
                                     
                                     break;

                            case 2 : get_number_of_players_barcelona();
                                     get_values_of_barcelona();
                                     
                                     a = juventus_stat[0] > barcelona_stat[0] ? 'A' : 'B';
                                     b = juventus_stat[1] > barcelona_stat[1] ? 'A' : 'B';
                                     c = juventus_stat[2] > barcelona_stat[2] ? 'A' : 'B';
                                     d = juventus_stat[3] > barcelona_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Barcelona";
                                     
                                     break;    

                            case 3 : get_number_of_players_bayern();
                                     get_values_of_bayern();
                                     
                                     a = juventus_stat[0] > bayern_stat[0] ? 'A' : 'B';
                                     b = juventus_stat[1] > bayern_stat[1] ? 'A' : 'B';
                                     c = juventus_stat[2] > bayern_stat[2] ? 'A' : 'B';
                                     d = juventus_stat[3] > bayern_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Bayern Munich";
                                     
                                     break;

                            case 4 : get_number_of_players_chelsea();
                                     get_values_of_chelsea();
                                     
                                     a = juventus_stat[0] > chelsea_stat[0] ? 'A' : 'B';
                                     b = juventus_stat[1] > chelsea_stat[1] ? 'A' : 'B';
                                     c = juventus_stat[2] > chelsea_stat[2] ? 'A' : 'B';
                                     d = juventus_stat[3] > chelsea_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Chelsea";
                                     
                                     break;


                            case 6 : get_number_of_players_madrid();
                                     get_values_of_madrid();
                                     
                                     a = juventus_stat[0] > madrid_stat[0] ? 'A' : 'B';
                                     b = juventus_stat[1] > madrid_stat[1] ? 'A' : 'B';
                                     c = juventus_stat[2] > madrid_stat[2] ? 'A' : 'B';
                                     d = juventus_stat[3] > madrid_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Real Madrid";
                                     
                                     break;


                            case 7 : get_number_of_players_psg();
                                     get_values_of_psg();
                                     
                                     a = juventus_stat[0] > psg_stat[0] ? 'A' : 'B';
                                     b = juventus_stat[1] > psg_stat[1] ? 'A' : 'B';
                                     c = juventus_stat[2] > psg_stat[2] ? 'A' : 'B';
                                     d = juventus_stat[3] > psg_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Paris St. Germain";
                                     
                                     break;

                            case 8 : get_number_of_players_united();
                                     get_values_of_united();
                                     
                                     a = juventus_stat[0] > united_stat[0] ? 'A' : 'B';
                                     b = juventus_stat[1] > united_stat[1] ? 'A' : 'B';
                                     c = juventus_stat[2] > united_stat[2] ? 'A' : 'B';
                                     d = juventus_stat[3] > united_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Manchester United";
                                     
                                     break;         


                        }
                         
                         break;
                         
                         
                case 6 : get_number_of_players_madrid();
                         get_values_of_madrid();
                         
                         team_a = "Real Madrid";
                         
                         switch(teamB){
                            
                            case 1 : get_number_of_players_atletico();
                                     get_values_of_atletico();
                                     
                                     a = madrid_stat[0] > atletico_stat[0] ? 'A' : 'B';
                                     b = madrid_stat[1] > atletico_stat[1] ? 'A' : 'B';
                                     c = madrid_stat[2] > atletico_stat[2] ? 'A' : 'B';
                                     d = madrid_stat[3] > atletico_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Atletico Madrid";
                                     
                                     break;

                            case 2 : get_number_of_players_barcelona();
                                     get_values_of_barcelona();
                                     
                                     a = madrid_stat[0] > barcelona_stat[0] ? 'A' : 'B';
                                     b = madrid_stat[1] > barcelona_stat[1] ? 'A' : 'B';
                                     c = madrid_stat[2] > barcelona_stat[2] ? 'A' : 'B';
                                     d = madrid_stat[3] > barcelona_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Barcelona";
                                     
                                     break;    

                            case 3 : get_number_of_players_bayern();
                                     get_values_of_bayern();
                                     
                                     a = madrid_stat[0] > bayern_stat[0] ? 'A' : 'B';
                                     b = madrid_stat[1] > bayern_stat[1] ? 'A' : 'B';
                                     c = madrid_stat[2] > bayern_stat[2] ? 'A' : 'B';
                                     d = madrid_stat[3] > bayern_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Bayern Munich";
                                     
                                     break;

                            case 4 : get_number_of_players_chelsea();
                                     get_values_of_chelsea();
                                     
                                     a = madrid_stat[0] > chelsea_stat[0] ? 'A' : 'B';
                                     b = madrid_stat[1] > chelsea_stat[1] ? 'A' : 'B';
                                     c = madrid_stat[2] > chelsea_stat[2] ? 'A' : 'B';
                                     d = madrid_stat[3] > chelsea_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Chelsea";
                                     
                                     break;


                            case 5 : get_number_of_players_juventus();
                                     get_values_of_juventus();
                                     
                                     a = madrid_stat[0] > juventus_stat[0] ? 'A' : 'B';
                                     b = madrid_stat[1] > juventus_stat[1] ? 'A' : 'B';
                                     c = madrid_stat[2] > juventus_stat[2] ? 'A' : 'B';
                                     d = madrid_stat[3] > juventus_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Juventus";
                                     
                                     break;


                            case 7 : get_number_of_players_psg();
                                     get_values_of_psg();
                                     
                                     a = madrid_stat[0] > psg_stat[0] ? 'A' : 'B';
                                     b = madrid_stat[1] > psg_stat[1] ? 'A' : 'B';
                                     c = madrid_stat[2] > psg_stat[2] ? 'A' : 'B';
                                     d = madrid_stat[3] > psg_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Paris St. Germain";
                                     
                                     break;

                            case 8 : get_number_of_players_united();
                                     get_values_of_united();
                                     
                                     a = madrid_stat[0] > united_stat[0] ? 'A' : 'B';
                                     b = madrid_stat[1] > united_stat[1] ? 'A' : 'B';
                                     c = madrid_stat[2] > united_stat[2] ? 'A' : 'B';
                                     d = madrid_stat[3] > united_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Manchester United";
                                     
                                     break;         


                        }
                         
                         break;
                         
                         
                case 7 : get_number_of_players_psg();
                         get_values_of_psg();
                         
                         team_a = "Paris St. Germain";
                         
                         switch(teamB){
                            
                            case 1 : get_number_of_players_atletico();
                                     get_values_of_atletico();
                                     
                                     a = psg_stat[0] > atletico_stat[0] ? 'A' : 'B';
                                     b = psg_stat[1] > atletico_stat[1] ? 'A' : 'B';
                                     c = psg_stat[2] > atletico_stat[2] ? 'A' : 'B';
                                     d = psg_stat[3] > atletico_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Atletico Madrid";
                                     
                                     break;

                            case 2 : get_number_of_players_barcelona();
                                     get_values_of_barcelona();
                                     
                                     a = psg_stat[0] > barcelona_stat[0] ? 'A' : 'B';
                                     b = psg_stat[1] > barcelona_stat[1] ? 'A' : 'B';
                                     c = psg_stat[2] > barcelona_stat[2] ? 'A' : 'B';
                                     d = psg_stat[3] > barcelona_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Barcelona";
                                     
                                     break;    

                            case 3 : get_number_of_players_bayern();
                                     get_values_of_bayern();
                                     
                                     a = psg_stat[0] > bayern_stat[0] ? 'A' : 'B';
                                     b = psg_stat[1] > bayern_stat[1] ? 'A' : 'B';
                                     c = psg_stat[2] > bayern_stat[2] ? 'A' : 'B';
                                     d = psg_stat[3] > bayern_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Bayern Munich";
                                     
                                     break;

                            case 4 : get_number_of_players_chelsea();
                                     get_values_of_chelsea();
                                     
                                     a = psg_stat[0] > chelsea_stat[0] ? 'A' : 'B';
                                     b = psg_stat[1] > chelsea_stat[1] ? 'A' : 'B';
                                     c = psg_stat[2] > chelsea_stat[2] ? 'A' : 'B';
                                     d = psg_stat[3] > chelsea_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Chelsea";
                                     
                                     break;


                            case 5 : get_number_of_players_juventus();
                                     get_values_of_juventus();
                                     
                                     a = psg_stat[0] > juventus_stat[0] ? 'A' : 'B';
                                     b = psg_stat[1] > juventus_stat[1] ? 'A' : 'B';
                                     c = psg_stat[2] > juventus_stat[2] ? 'A' : 'B';
                                     d = psg_stat[3] > juventus_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Juventus";
                                     
                                     break;


                            case 6 : get_number_of_players_madrid();
                                     get_values_of_madrid();
                                     
                                     a = psg_stat[0] > madrid_stat[0] ? 'A' : 'B';
                                     b = psg_stat[1] > madrid_stat[1] ? 'A' : 'B';
                                     c = psg_stat[2] > madrid_stat[2] ? 'A' : 'B';
                                     d = psg_stat[3] > madrid_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Real Madrid";
                                     
                                     break;

                            case 8 : get_number_of_players_united();
                                     get_values_of_united();
                                     
                                     a = psg_stat[0] > united_stat[0] ? 'A' : 'B';
                                     b = psg_stat[1] > united_stat[1] ? 'A' : 'B';
                                     c = psg_stat[2] > united_stat[2] ? 'A' : 'B';
                                     d = psg_stat[3] > united_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Manchester United";
                                     
                                     break;         


                        }
                         
                         break;
            
                case 8 : get_number_of_players_united();
                         get_values_of_united();
                         
                         team_a = "Manchester United";
                         
                         switch(teamB){
                            
                            case 1 : get_number_of_players_atletico();
                                     get_values_of_atletico();
                                     
                                     a = united_stat[0] > atletico_stat[0] ? 'A' : 'B';
                                     b = united_stat[1] > atletico_stat[1] ? 'A' : 'B';
                                     c = united_stat[2] > atletico_stat[2] ? 'A' : 'B';
                                     d = united_stat[3] > atletico_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Atletico Madrid";
                                     
                                     break;

                            case 2 : get_number_of_players_barcelona();
                                     get_values_of_barcelona();
                                     
                                     a = united_stat[0] > barcelona_stat[0] ? 'A' : 'B';
                                     b = united_stat[1] > barcelona_stat[1] ? 'A' : 'B';
                                     c = united_stat[2] > barcelona_stat[2] ? 'A' : 'B';
                                     d = united_stat[3] > barcelona_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Barcelona";
                                     
                                     break;    

                            case 3 : get_number_of_players_bayern();
                                     get_values_of_bayern();
                                     
                                     a = united_stat[0] > bayern_stat[0] ? 'A' : 'B';
                                     b = united_stat[1] > bayern_stat[1] ? 'A' : 'B';
                                     c = united_stat[2] > bayern_stat[2] ? 'A' : 'B';
                                     d = united_stat[3] > bayern_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Bayern Munich";
                                     
                                     break;

                            case 4 : get_number_of_players_chelsea();
                                     get_values_of_chelsea();
                                     
                                     a = united_stat[0] > chelsea_stat[0] ? 'A' : 'B';
                                     b = united_stat[1] > chelsea_stat[1] ? 'A' : 'B';
                                     c = united_stat[2] > chelsea_stat[2] ? 'A' : 'B';
                                     d = united_stat[3] > chelsea_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Chelsea";
                                     
                                     break;


                            case 5 : get_number_of_players_juventus();
                                     get_values_of_juventus();
                                     
                                     a = united_stat[0] > juventus_stat[0] ? 'A' : 'B';
                                     b = united_stat[1] > juventus_stat[1] ? 'A' : 'B';
                                     c = united_stat[2] > juventus_stat[2] ? 'A' : 'B';
                                     d = united_stat[3] > juventus_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Juventus";
                                     
                                     break;


                            case 6 : get_number_of_players_madrid();
                                     get_values_of_madrid();
                                     
                                     a = united_stat[0] > madrid_stat[0] ? 'A' : 'B';
                                     b = united_stat[1] > madrid_stat[1] ? 'A' : 'B';
                                     c = united_stat[2] > madrid_stat[2] ? 'A' : 'B';
                                     d = united_stat[3] > madrid_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Real Madrid";
                                     
                                     break;

                            case 7 : get_number_of_players_psg();
                                     get_values_of_psg();
                                     
                                     a = united_stat[0] > psg_stat[0] ? 'A' : 'B';
                                     b = united_stat[1] > psg_stat[1] ? 'A' : 'B';
                                     c = united_stat[2] > psg_stat[2] ? 'A' : 'B';
                                     d = united_stat[3] > psg_stat[3] ? 'A' : 'B';
                                     
                                     team_b = "Paris St. Germain";
                                     
                                     break;         


                        }
                         
                         break;         
            
            
            }          
                      
            
            int goalsA = 0, goalsB = 0;
            
            if(a == 'A')
                goalsA++;
            else
                goalsB++;
            
            if(b == 'A')
                goalsA++;
            else
                goalsB++;
            
            if(c == 'A')
                goalsA++;
            else
                goalsB++;
            
            if(d == 'A')
                goalsA++;
            else
                goalsB++;
            
            System.out.println("Final Score!");
            System.out.println("-------------");
            System.out.println(team_a  + " - " + goalsA + " :: " + goalsB + " - " + team_b);
                
            
        }
	public static void main(String args[]) throws IOException{           
            
		
            /*get_number_of_players_atletico();
            get_number_of_players_barcelona();
            get_number_of_players_bayern();
            get_number_of_players_chelsea();
            get_number_of_players_juventus();
            get_number_of_players_madrid();
            get_number_of_players_psg();
            get_number_of_players_united();
            
            
            get_values_of_atletico();
            get_values_of_barcelona();
            get_values_of_bayern();
            get_values_of_chelsea();
            get_values_of_juventus();
            get_values_of_madrid();
            get_values_of_psg();
            get_values_of_united();*/
            
            System.out.println("WELCOME TO FOOTWARS!!!!" + "\n" + "Decide beforehand which team can beat the other!");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Here is the team selection chart");
            System.out.println("1 - Atletico");
            System.out.println("2 - Barcelona");
            System.out.println("3 - Bayern");
            System.out.println("4 - Chelsea");
            System.out.println("5 - Juventus");
            System.out.println("6 - Real Madrid");
            System.out.println("7 - Paris St. Germain");
            System.out.println("8 - Manchester United");
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Input the number for the team you choose! - ");
            
            int teamA = Integer.parseInt(br.readLine());
            
            System.out.print("Now enter the number for the opposite team! - ");
            int teamB = Integer.parseInt(br.readLine());
            
            String nameA = "";
            String nameB = "";
            
            if(teamA == 1)
                nameA = "Atletico Madrid";
            else if(teamA == 2)
                nameA = "Barcelona";
            else if(teamA == 3)
                nameA = "Bayern Munich";
            else if(teamA == 4)
                nameA = "Chelsea";
            else if(teamA == 5)
                nameA = "Juventus";
            else if(teamA == 6)
                nameA = "Real Madrid";
            else if(teamA == 7)
                nameA = "Paris St. Germain";
            else
                nameA = "Manchester United";
            
            if(teamB == 1)
                nameB = "Atletico Madrid";
            else if(teamB == 2)
                nameB = "Barcelona";
            else if(teamB == 3)
                nameB = "Bayern Munich";
            else if(teamB == 4)
                nameB = "Chelsea";
            else if(teamB == 5)
                nameB = "Juventus";
            else if(teamB == 6)
                nameB = "Real Madrid";
            else if(teamB == 7)
                nameB = "Paris St. Germain";
            else
                nameB = "Manchester United";
            
            
            
            System.out.println("So, it is a match between " + nameA + " and " + nameB);
            
            startMatch(teamA, teamB);
            
            
		
	}
	
	

}