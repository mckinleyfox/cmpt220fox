import java.util.Date;

public class SoccerMatch {
	
	public static void main(String[] args) {
		System.out.println("Player name: " + name + "\n Team: " + team + "\n Goals: " + goals);
		System.out.println(player.getName + "scoreda goal at minute: " + minute);
		Date date1 = new Date(18, 10, 2019);
		Date date2 = new Date(18, 10, 2019);
		SoccerMatch = new SoccerMatch(date1, date2);
		String homePlayerName[] = {"John", "Jacob", "Justin", "Alex",
									"Ben", "Carlos", "Beck", "Brian",
									"Isaiah", "Logan", "Adam"};
		String VisitorPlayerName[] = {"Jack", "Jordan", "Tyler", "Max",
										"Clark", "Lary", "Ethan", "Anthony",
										"Ed", "Luke", "Trevor"};
		System.out.println(" " + visitorPlayer[i]);
		System.out.println(" " + homePlayer[i]);
		System.out.println(" " + visitorGoals);
		System.out.println(" " + homeGoals);
		
	}
	
	Date startTime;
	Date endTime;
	String venue;
	String home;
	String visitor;
	Player homePlayer[];
	Player visitorPlayer[];
	Goal homeGoals[];
	Goal visitorGoals[];
	int homePlayerCounter, visitorPlayerCounter;
	int homeGoalCounter, visitorGoalCounter;
	SoccerMatch(){
		homePlayer = new Player[11];
		visitorPlayer = new Player[11];
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		for(int i = 0; i< 11; i++) {
			homePlayer[i] = new Player();
			visitorPlayer[i] = new Player();
		}
		for(int j = 0; j < 10; j++){
			homeGoals[j] = new Goal();
			visitorGoals[j] = new Goal();
		}
	}
	
	SoccerMatch(Date startTime, Date endTime, Date venue, Date home, Date visitor){
	}
	
	public void addHomePlayer(Player p) {
		homePlayer[homePlayerCounter++] = p;
	}
	
	public void addVisitorPlayer(Player p) {
		visitorPlayer[visitorPlayerCounter++] = p;
	}
	
	public void addHomeGoal(Goal g){
		homeGoals[homeGoalCounter++] = g;
	}
	public void addVisitorGoal(Goal g){
		visitorGoals[visitorGoalCounter++] = g;
	}
	public int[] getHomeGoals() {
		int goals[] = new int[10];
		for (int i = 0; i < 10; i++) {
			goals[i] = homeGoals[i].getPlayer().getGoals();
			return goals;
		}
	}
	
}

class Player {
	private String name;
	private int goals;
	private String team;
	Player(){
		name = team;
		goals = 0;
	}
	Player(String name, int goal, String team){
	}
	public void setName(String name) {
	}
	public void setTeam(String team) {
	}
	public void setGoals(int goals) {
	}
	public String getName() {
		return name;
	}
	public String getTeam() {
		return team;
	}
	public int getGoals() {
		return goals;
	}
}

class Goal {
	private int minute;
	private Player player;
	Goal(){
		minute = 0;
		player = null;
	}
	Goal(int min, Player p){
		minute = min;
		player = p;
	}
	public void setMinute(int minute) {
	}
	public void setPlayer(Player p) {
	}
	public int getMinute() {
		return minute;
	}
	public Player getPlayer() {
		return player;
	}		
}


