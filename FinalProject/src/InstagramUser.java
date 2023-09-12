public class InstagramUser {
    public static void main(String[] args) {





        Settings burger = new Settings
                .SettingsBuilder(877777777)
                .onNotification()
                .onPrivateAccount()
                .build();
        System.out.println("Setting succesfully installed!!!");
        System.out.println("\n==================================\n");


        Theme darkTheme = new DarkTheme();
        WebPage about = new AboutWebPage(darkTheme);
        WebPage projects = new ProjectsWebPage(darkTheme);

        System.out.println(about.getContent());
        System.out.println(projects.getContent());
        System.out.println("\n==================================\n");

        InstagramTemplate mainPage = new MainPage();
        InstagramTemplate recommendationPage = new RecommendationPage();


        mainPage.showPage();





        System.out.println("\n==================================\n");

        recommendationPage.showPage();

        System.out.println("\n==================================\n");


        Instagram instagram = new AdapaterEditorToInstagram();

        instagram.save();
        instagram.edit();
        instagram.delete();

        System.out.println("\n===================================\n");


        Activity activity = new NetworkOff();
        WorkInstagram workInstagram = new WorkInstagram();

        workInstagram.setActivity(activity);

        for (int i=0; i< 3; i++){
            workInstagram.relaxation();
            workInstagram.changeActivity();
        }
        System.out.println("\n===================================\n");
        AddPost addpost = new addMore(new Post());
        System.out.println(addpost.addPost());

        System.out.println("\n===================================\n");
        ChatRoomMediator mediator = new ChatRoom();

        User user1 = new User("Aruzhan", mediator);
        User user2 = new User("Amirzhan", mediator);

        user1.sendMessage("Hi! Did you make a mediator pattern?");
        user2.sendMessage("Hey! Yeah");

        System.out.println("\n===================================\n");


    }
}
