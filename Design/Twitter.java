package Design;

import java.util.*;


class Twitter {
	int userId;
	HashMap<Integer, ArrayList<Tweet>> userTweetIDmappings; 
	HashMap<Integer, ArrayList<Integer>> userFollowersmappings; 

	/** Initialize your data structure here. */
	public Twitter() {
		//no implementation
		userTweetIDmappings=new HashMap<Integer, ArrayList<Tweet>>();
		userFollowersmappings=new HashMap<Integer, ArrayList<Integer>>();
	}


	public void postTweet(int userId, int tweetId) {
		Date date=new Date();
		long mils=date.getTime();


		Tweet tweet=new Tweet();
		tweet.tweetId=tweetId;
		tweet.tweetTime=mils;
		if(userTweetIDmappings.containsKey(userId)){
			ArrayList<Tweet> tweetids=userTweetIDmappings.get(userId);
			tweetids.add(0,tweet);
		}
		else
		{ 
			ArrayList newtweetids=new ArrayList<Integer>();
			newtweetids.add(tweet); 
			userTweetIDmappings.put(userId, newtweetids);    
		}
	}

	/** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
	public List<Integer> getNewsFeed(int userId) {
		List<ArrayList<Tweet>> followersAndTweetsMappings=new  ArrayList<ArrayList<Tweet>>();

		if(userFollowersmappings.containsKey(userId)){
			ArrayList<Integer> followerIds=userFollowersmappings.get(userId);


			for(Integer followeId : followerIds){
				if(userTweetIDmappings.containsKey(followeId)){
					followersAndTweetsMappings.add(userTweetIDmappings.get(followeId));

				}

			}
		}
		
		 ArrayList<Tweet> tweetListForUserId = userTweetIDmappings.get(userId);
		
		 if(tweetListForUserId!=null) {
		 followersAndTweetsMappings.add(tweetListForUserId);
		 }

		return mergeArrays(followersAndTweetsMappings);


	}

	public static List<Integer> mergeArrays(List<ArrayList<Tweet>> lists) {
		int index=0, listNumber=0;
		List<Integer> result=new ArrayList<Integer>();
		PriorityQueue<Tweet> pq=new PriorityQueue<Tweet>(new Comparator<Tweet>(){
			public int compare(Tweet a, Tweet b){
//				if (a.tweetTime > b.tweetTime) return 1;
//				if (a.tweetTime == b.tweetTime) return 0;
//				return -1;
				
				return (int) (b.tweetTime-a.tweetTime);
			}
		}); 

		for(ArrayList<Tweet> list:lists) {
			Tweet tweet=list.get(index);
			
			tweet.listNumber=listNumber++;
			
			pq.add(tweet);
		}

		index=0; listNumber=0;
		while(!pq.isEmpty()) {
			Tweet tweet=pq.poll();
			result.add(tweet.tweetId);
			Tweet newTweet=new Tweet();
			index=tweet.index;
			listNumber=tweet.listNumber;
			newTweet.listNumber=listNumber;

			if(index+1<lists.get(listNumber).size())
			{
				newTweet.index=index+1;
				newTweet.tweetId=(lists.get(listNumber)).get(newTweet.index).tweetId;
				pq.add(newTweet);
			}

		}

		return result;
	}

	/** Follower follows a followee. If the operation is invalid, it should be a no-op. */
	public void follow(int followerId, int followeeId) {
		
		if(followerId!=followeeId) {
		if(userFollowersmappings.containsKey(followerId)){
			ArrayList<Integer> followerIds=userFollowersmappings.get(followerId);
			followerIds.add(followeeId);
		}
		else
		{ 
			ArrayList followerIds=new ArrayList<Integer>();
			followerIds.add(followeeId); 
			userFollowersmappings.put(followerId, followerIds);
		}
		}
	}

	/** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
	public void unfollow(int followerId, int followeeId) {
		if(userFollowersmappings.containsKey(followerId))
		{
			ArrayList<Integer> followerIds=userFollowersmappings.get(followerId);
			int i=0;
			for(Integer f: followerIds){
				if(f.equals(followeeId))
				{
					break;
				}
			i++;
			}
			followerIds.remove(i);
			
		}

	}

	public void printArray(List<Integer> arr ) {
		for(Integer i:arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {

		Twitter obj = new Twitter();
		obj.postTweet(1,5);
		obj.postTweet(1,3);
		List<Integer> param_2 = obj.getNewsFeed(1);
		obj.printArray(param_2);
		//obj.follow(1,2);
		//obj.postTweet(2,6);
		//List<Integer> param_3 = obj.getNewsFeed(1);
		//obj.printArray(param_3);
//		obj.unfollow(1,2);
//		List<Integer> param_4 = obj.getNewsFeed(1);
//		obj.printArray(param_4);
	}
}

class Tweet{
	int tweetId;
	long tweetTime;
	int listNumber;
	int index;
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
