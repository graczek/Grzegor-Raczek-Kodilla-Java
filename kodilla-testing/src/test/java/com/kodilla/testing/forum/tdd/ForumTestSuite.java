package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost(){
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        //when
        forumUser.addPost("mrsmith", "hello, this is my first post!");
        //then
        Assert.assertEquals(1, forumUser.getPostsQuantity());
    }

    @Test
    public void testAddComment(){
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("hello, this is my first post!", "mrsmith");
        //when
        forumUser.addComment(thePost, "mrsmith", "thank you!");
        //then
        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test
    public void testGetPost(){
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("hello, this is my first post!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //when
        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);
        //then
        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test
    public void testGetComment() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("hello, this is my first post!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "thank you!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //when
        ForumComment retrievedComment = forumUser.getComment(0);
        //then
        Assert.assertEquals(theComment, retrievedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("hello, this is my first post!", "mrsmith");
        //when
        boolean result = forumUser.removePost(thePost);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveCommentNotExisting() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("hello, this is my first post!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "thank you!");
        //when
        boolean result = forumUser.removeComment(theComment);
        //then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("hello, this is my first post!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //when
        boolean result = forumUser.removePost(thePost);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    public void testRemoveComment() {
        //given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("hello, this is my first post!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "mrsmith", "thank you!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //when
        boolean result = forumUser.removeComment(theComment);
        //then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
