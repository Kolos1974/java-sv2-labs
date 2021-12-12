package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {
    private List<Team> teams = new ArrayList<>();

    Team team1;
    Team team2;
    Team team3;


    public ChessTournament() {
        team1 = new Team();
        team2 = new Team();
        team3 = new Team();
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);

        /*
        this.teams = Arrays.asList(
                new Team(), new Team(), new Team());
         */
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        Team team;
        team1.setPlayerOne(null);
        team1.setPlayerTwo(null);
        team2.setPlayerOne(null);
        team2.setPlayerTwo(null);
        team3.setPlayerOne(null);
        team3.setPlayerTwo(null);

        for (int i = 0; i < playersRegistrated.size(); i++) {
            switch (i) {
                case 0:
                    team1.setPlayerOne(playersRegistrated.get(i));
                    break;
                case 1:
                    team1.setPlayerTwo(playersRegistrated.get(i));
                    break;
                case 2:
                    team2.setPlayerOne(playersRegistrated.get(i));
                    break;
                case 3:
                    team2.setPlayerTwo(playersRegistrated.get(i));
                    break;
                case 4:
                    team3.setPlayerOne(playersRegistrated.get(i));
                    break;
                case 5:
                    team3.setPlayerTwo(playersRegistrated.get(i));
                    break;
            }
        }

        /*
            for (int i = 0; i < (teams.size() * 2); i++) {
                setPlayers(i, playersRegistrated);
        }
         */

    }

    public List<Team> getTeams() {
        return teams;
    }

    private void setPlayers(int i, List<Player> playersRegistrated) {
        if (playersRegistrated.size() >= i + 1) {
            if (i % 2 == 0) {
                teams.get(i / 2).setPlayerOne(playersRegistrated.get(i));
            } else {
                teams.get(i / 2).setPlayerTwo(playersRegistrated.get(i));
            }
        }
    }
}
