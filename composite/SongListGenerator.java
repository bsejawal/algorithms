package composite;

public class SongListGenerator {

	
	public static void main(String[] args){
		SongComponent industralMusic = new SongGroup("Industral", "is a style of experimental music that draws on transdf of industral");
		SongComponent heavyMetal = new SongGroup("H\neavy Metal", "is a genere of rock that developed in the late 1960s");
		SongComponent dubstepMusic = new SongGroup("dubstepMusic", "is a genere of electronic dance music that originated in South London");

		SongComponent everySong = new SongGroup("Song List", "Every song available");
		everySong.add(industralMusic);
		industralMusic.add(new Song("Head Like a Hole", "NIN", 1990));
		industralMusic.add(new Song("Headhunter", "Front 242", 1988));
		
		everySong.add(dubstepMusic);
		industralMusic.add(new Song("Ventipede", "Knife party", 2012));
		industralMusic.add(new Song("Tetris", "Doctor P", 2011));
		
		
		everySong.add(heavyMetal);
		heavyMetal.add(new Song("War Pig", "Black Sabath",1970));
		heavyMetal.add(new Song("Ace of Spades", "Motorhead",1980));
		
		DiscJockey crazyLarry = new DiscJockey(everySong);
		crazyLarry.getSongList();
	}
}
