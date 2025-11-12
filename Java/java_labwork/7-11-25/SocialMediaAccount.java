package lab;

class SocialMediaAccount 
{
	String username;
	String email;
	boolean isPublic;
	boolean isVerified;
	String countryOrigin;
	int noOfPosts;
	int noOfLikes;
	int noOfComments;
	String createDate;
	int noOfImpressions;
	
	SocialMediaAccount() //default constructor
	{
		this.username = "DefaultUser";
		this.email = "default@gmail.com";
		this.isPublic = true;
		this.isVerified = false;
		this.countryOrigin = "India";
		this.noOfPosts = 10;
		this.noOfLikes = 100;
		this.noOfComments = 20;
		this.createDate = "2020-01-01";
		this.noOfImpressions = 1000;
	}
	
	SocialMediaAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOrigin,
					   int noOfPosts, int noOfLikes, int noOfComments, String createDate, int noOfImpressions) //parameterized constructor
	{
		this.username = username;
		this.email = email;
		this.isPublic = isPublic;
		this.isVerified = isVerified;
		this.countryOrigin = countryOrigin;
		this.noOfPosts = noOfPosts;
		this.noOfLikes = noOfLikes;
		this.noOfComments = noOfComments;
		this.createDate = createDate;
		this.noOfImpressions = noOfImpressions;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getIsPublic() {
		return isPublic;
	}
	public void setIsPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}
	public boolean getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	public String getCountryOrigin() {
		return countryOrigin;
	}
	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	public int getNoOfPosts() {
		return noOfPosts;
	}
	public void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}
	public int getNoOfLikes() {
		return noOfLikes;
	}
	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}
	public int getNoOfComments() {
		return noOfComments;
	}
	public void setNoOfComments(int noOfComments) {
		this.noOfComments = noOfComments;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getNoOfImpressions() {
		return noOfImpressions;
	}
	public void setNoOfImpressions(int noOfImpressions) {
		this.noOfImpressions = noOfImpressions;
	}
	
	void display()
	{
		System.out.println("Username: "+this.username);
		System.out.println("Email: "+this.email);
		System.out.println("Is Public: "+this.isPublic);
		System.out.println("Is Verified: "+this.isVerified);
		System.out.println("Country Origin: "+this.countryOrigin);
		System.out.println("No of Posts: "+this.noOfPosts);
		System.out.println("No of Likes: "+this.noOfLikes);
		System.out.println("No of Comments: "+this.noOfComments);
		System.out.println("Create Date: "+this.createDate);
		System.out.println("No of Impressions: "+this.noOfImpressions);
		System.out.println();
	}

} // class socialmediaaccount ends here


class InstagramAccount extends SocialMediaAccount
{
	int noOfFollowers;
	int noOfFollowing;
	int noOfHighlights;
	int noOfPostArchived;
	int noOfStoryArchived;
	int noOfAudioSaved;
	
	InstagramAccount() //default constructor
	{
		super();
		this.noOfFollowers = 500;
		this.noOfFollowing = 300;
		this.noOfHighlights = 10;
		this.noOfPostArchived = 5;
		this.noOfStoryArchived = 20;
		this.noOfAudioSaved = 50;
	}
	
	InstagramAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOrigin,
					 int noOfPosts, int noOfLikes, int noOfComments, String createDate, int noOfImpressions,
					 int followers, int following, int highlights, int postArchived, int storyArchived, int audioSaved) //parameterized constructor
	{
		super(username, email, isPublic, isVerified, countryOrigin, noOfPosts, noOfLikes, noOfComments, createDate, noOfImpressions);
		this.noOfFollowers = followers;
		this.noOfFollowing = following;
		this.noOfHighlights = highlights;
		this.noOfPostArchived = postArchived;
		this.noOfStoryArchived = storyArchived;
		this.noOfAudioSaved = audioSaved;
	}
	
	void display()
	{
		super.display();
		System.out.println("No of Followers: "+this.noOfFollowers);
		System.out.println("No of Following: "+this.noOfFollowing);
		System.out.println("No of Highlights: "+this.noOfHighlights);
		System.out.println("No of Post Archived: "+this.noOfPostArchived);
		System.out.println("No of Story Archived: "+this.noOfStoryArchived);
		System.out.println("No of Audio Saved: "+this.noOfAudioSaved);
		System.out.println();
	}

} // class instagramaccount ends here


class LinkedInAccount extends SocialMediaAccount
{
	int noOfConnections;
	int noOfProfileViews;
	int noOfJobsApplied;
	
	LinkedInAccount() //default constructor
	{
		super();
		this.noOfConnections = 200;
		this.noOfProfileViews = 100;
		this.noOfJobsApplied = 10;
	}
	
	LinkedInAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOrigin,
					int noOfPosts, int noOfLikes, int noOfComments, String createDate, int noOfImpressions,
					int connections, int profileViews, int jobsApplied) //parameterized constructor
	{
		super(username, email, isPublic, isVerified, countryOrigin, noOfPosts, noOfLikes, noOfComments, createDate, noOfImpressions);
		this.noOfConnections = connections;
		this.noOfProfileViews = profileViews;
		this.noOfJobsApplied = jobsApplied;
	}
	
	void display()
	{
		super.display();
		System.out.println("No of Connections: "+this.noOfConnections);
		System.out.println("No of Profile Views: "+this.noOfProfileViews);
		System.out.println("No of Jobs Applied: "+this.noOfJobsApplied);
		System.out.println();
	}

} // class linkedinaccount ends here


class YouTubeAccount extends SocialMediaAccount
{
	int noOfSubscribers;
	double watchTime;
	boolean isMonetized;
	double estimatedRevenue;
	
	YouTubeAccount() //default constructor
	{
		super();
		this.noOfSubscribers = 1000;
		this.watchTime = 2500.5;
		this.isMonetized = true;
		this.estimatedRevenue = 500.75;
	}
	
	YouTubeAccount(String username, String email, boolean isPublic, boolean isVerified, String countryOrigin,
				   int noOfPosts, int noOfLikes, int noOfComments, String createDate, int noOfImpressions,
				   int subscribers, double watchTime, boolean isMonetized, double estimatedRevenue) //parameterized constructor
	{
		super(username, email, isPublic, isVerified, countryOrigin, noOfPosts, noOfLikes, noOfComments, createDate, noOfImpressions);
		this.noOfSubscribers = subscribers;
		this.watchTime = watchTime;
		this.isMonetized = isMonetized;
		this.estimatedRevenue = estimatedRevenue;
	}
	
	void display()
	{
		super.display();
		System.out.println("No of Subscribers: "+this.noOfSubscribers);
		System.out.println("Watch Time: "+this.watchTime);
		System.out.println("Is Monetized: "+this.isMonetized);
		System.out.println("Estimated Revenue: "+this.estimatedRevenue);
		System.out.println();
	}

} // class youtubeaccount ends here


class SocialMediaTest
{
	public static void main(String[] args)
	{
		System.out.println("--- Social media account ---");
		SocialMediaAccount s1 = new SocialMediaAccount();
		SocialMediaAccount s2 = new SocialMediaAccount("User123", "user123@gmail.com", false, true, "USA", 25, 500, 60, "2022-01-10", 2000);
		
		s1.display();
		s2.display();
		
		System.out.println("--- Instagram account ---");
		InstagramAccount i1 = new InstagramAccount();
		InstagramAccount i2 = new InstagramAccount("instaUser","insta@gmail.com",true,true,"USA",50,2000,100,"2021-01-01",5000,2000,1500,25,10,30,80);
		
		i1.display();
		i2.display();
		
		System.out.println("--- LinkedIn account ---");
		LinkedInAccount l1 = new LinkedInAccount();
		LinkedInAccount l2 = new LinkedInAccount("linkUser","linked@gmail.com",true,true,"UK",40,1500,60,"2020-05-10",3000,500,400,20);
		
		l1.display();
		l2.display();
		
		
		System.out.println("--- You Tube account ---");
		YouTubeAccount y1 = new YouTubeAccount();
		YouTubeAccount y2 = new YouTubeAccount("ytUser","ytindia@gmail.com",true,true,"Canada",70,2500,150,"2019-09-15",8000,10000,6000.50,true,1200.75);
		
		y1.display();
		y2.display();
		
	} //main ends here
} // class socialmediatest ends here
