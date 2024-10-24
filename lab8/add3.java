// Interface Sports
interface Sports {
    int getNumberOfGoals();
    void dispTeam();
}

// Hockey class implementing Sports interface
class Hockey implements Sports {
    private String team1;
    private String team2;
    private int goalsTeam1;
    private int goalsTeam2;

    public Hockey(String team1, String team2, int goalsTeam1, int goalsTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goalsTeam1 = goalsTeam1;
        this.goalsTeam2 = goalsTeam2;
    }

    @Override
    public int getNumberOfGoals() {
        return goalsTeam1 + goalsTeam2;
    }

    @Override
    public void dispTeam() {
        System.out.println("Hockey Match:");
        System.out.println(team1 + " vs " + team2);
        System.out.println("Goals: " + goalsTeam1 + " - " + goalsTeam2);
        System.out.println("Winning Team: " + (goalsTeam1 > goalsTeam2 ? team1 : team2));
    }
}

// Football class implementing Sports interface
class Football implements Sports {
    private String team1;
    private String team2;
    private int goalsTeam1;
    private int goalsTeam2;

    public Football(String team1, String team2, int goalsTeam1, int goalsTeam2) {
        this.team1 = team1;
        this.team2 = team2;
        this.goalsTeam1 = goalsTeam1;
        this.goalsTeam2 = goalsTeam2;
    }

    @Override
    public int getNumberOfGoals() {
        return goalsTeam1 + goalsTeam2;
    }

    @Override
    public void dispTeam() {
        System.out.println("Football Match:");
        System.out.println(team1 + " vs " + team2);
        System.out.println("Goals: " + goalsTeam1 + " - " + goalsTeam2);
        System.out.println("Winning Team: " + (goalsTeam1 > goalsTeam2 ? team1 : team2));
    }
}

// Main class to demonstrate functionality
public class SportsDemo {
    public static void main(String[] args) {
        // Create Hockey match
        Sports hockeyMatch = new Hockey("Team A", "Team B", 3, 2);
        hockeyMatch.dispTeam();
        System.out.println("Total Goals in Hockey: " + hockeyMatch.getNumberOfGoals());

        // Create Football match
        Sports footballMatch = new Football("Team C", "Team D", 1, 1);
        footballMatch.dispTeam();
        System.out.println("Total Goals in Football: " + footballMatch.getNumberOfGoals());
    }
}
