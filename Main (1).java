public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001", "AlConference", "Paris", "Peng Tian", 50, 2, 25, 40, 60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent.toString());

        MusicConcertEvent musicConcertEvent = new MusicConcertEvent("E002", "AlMusicConcert", "Paris", "Peng Tian", 50, 2, 25);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent.toString());
    }
}