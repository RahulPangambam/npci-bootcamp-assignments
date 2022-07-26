package mankatha;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	ArrayList<Player> players = new ArrayList<Player>();
	
	ArrayList<Card> in = new ArrayList<Card>();
	ArrayList<Card> out = new ArrayList<Card>();
	
	ArrayList<Player> noHost = new ArrayList<Player>();
	
	ArrayList<Player> finalPlayers = new ArrayList<Player>();

	public Player getHost() {
		Player host;

		Random random = new Random();
		int num = random.nextInt(1, 4);
		if(num == 1)
			host = players.get(0);

		else if(num == 2)
			host = players.get(1);
		else
			host = players.get(2);
		return host;
	}
	
	public void shuffleAndDealCardsHost(Player host) {
		host.setDeck(new Deck());
		host.getDeck().shuffle();

		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0)
				in.add(host.getDeck().deal());
			else
				out.add(host.getDeck().deal());
		}
	}
	
	public String play() {
		Player host = getHost();

		for(Player player: players) {
			if(player != host)
				noHost.add(player);
		}

		shuffleAndDealCardsHost(host);

		Scanner s = new Scanner(System.in);
		
		int n = 1;
		for(Player p: noHost) {
			System.out.println();
			System.out.println("Player " + n + " turn" );
			System.out.println("Bet or Quit(B/Q)");
			String betOrQuit = s.next();
			if(betOrQuit.equals("B")) {
				System.out.println("Amount to bet");
				int amount = s.nextInt();
				System.out.println("Orientation (in or out)?");
				String orientation = s.next();
				System.out.println("Enter card rank");
				int rank = s.nextInt();
				System.out.println("Enter card suit");
				int suit = s.nextInt();
				p.setBetValue(amount);
				p.setChosenCard(new Card(rank, suit));
				p.setChosenOrientation(orientation);
				finalPlayers.add(p);
			}
			n = n + 1;
		}
		
		Game game = new Game();
		game.setFinalPlayers(finalPlayers);
		game.setIn(in);
		game.setOut(out);
		String winner = game.findWinner();
		host.getDeck().reset();
		in.clear();
		out.clear();
		noHost.clear();
		finalPlayers.clear();
		if(winner == "") {
			return "Winner: Host";
		}else
			return winner;
	}

	public static void main(String[] args) {

		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();

		Main main = new Main();
		main.players.add(player1);
		main.players.add(player2);
		main.players.add(player3);

		Scanner s = new Scanner(System.in);
		System.out.println(main.play());
		System.out.println();
		
		System.out.println("Play again(Y/N)?");
		String playAgain = s.next();
		while(playAgain.equals("Y")) {
			System.out.println(main.play());
			System.out.println("Play again(Y/N)?");
			String again = s.next();
			playAgain = again;
		}
	}
}
