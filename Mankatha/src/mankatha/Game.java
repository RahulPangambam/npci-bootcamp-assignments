package mankatha;

import java.util.ArrayList;

public class Game {
	
	ArrayList<Card> in;
	ArrayList<Card> out;
	ArrayList<Player> finalPlayers;
	
	public ArrayList<Player> getFinalPlayers() {
		return finalPlayers;
	}

	public void setFinalPlayers(ArrayList<Player> finalPlayers) {
		this.finalPlayers = finalPlayers;
	}

	public ArrayList<Card> getIn() {
		return in;
	}

	public void setIn(ArrayList<Card> in) {
		this.in = in;
	}

	public ArrayList<Card> getOut() {
		return out;
	}

	public void setOut(ArrayList<Card> out) {
		this.out = out;
	}

	public String findWinner() {
		String winner = "";
		int playerNum = 1;
		for(Player pl : finalPlayers) {
			if(pl.getChosenOrientation().equals("in")){
				if(in.contains(pl.getChosenCard())) {
					winner = winner + "Winner: Player" + playerNum;
					break;
				}
			}else {
				if(out.contains(pl.getChosenCard())) {
					winner = winner + "Winner: Player" + playerNum;
					break;
				}
			}
			playerNum += 1;
		}
		return winner;
	}
}
