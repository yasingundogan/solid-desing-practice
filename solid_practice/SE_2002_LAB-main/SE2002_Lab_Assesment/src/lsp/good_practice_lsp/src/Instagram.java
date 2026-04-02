public class Instagram extends SocialMedia implements  StoryFeature{

    @Override
    public void chat() {
        System.out.println("Chatting...");
    }

    @Override
    public void postStory() {
        System.out.println("Posting...");
    }
}
