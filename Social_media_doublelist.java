package javac;
public class Social_media_doublelist {
    static class Post {
        String text;
        Post prev, next;

        Post(String text) {
            this.text = text;
        }
    }
    
    public static void main(String[] args) {
        Post p1 = new Post("Friend Post"); 
        Post p2 = new Post("Sponsored Post");
        Post p3 = new Post("Travel Post");

        p1.next = p2; p2.prev = p1;
        p2.next = p3; p3.prev = p2;
        p3.next = p1; p1.prev = p3;

        Post current = p1;

        System.out.println("Current: " + current.text);

        current = current.next;
        System.out.println("Next: " + current.text);

        current = current.next;
        System.out.println("Next: " + current.text);

        current = current.prev;
        System.out.println("Previous: " + current.text);
    } 
}