package LESSON9.problem3;

    import java.util.Stack;

    public class BrowserHistory {


        private Stack<String> back;
        private Stack<String> forward;
        private String currentUrl;


        public BrowserHistory(String homepage) {
            back = new Stack<>();
            forward = new Stack<>();
            currentUrl = homepage;
        }
    public void visit(String url)
    // for visiting a new url
    //it should update the current url
    //manage the history stacks
    {
        back.push(currentUrl);
        currentUrl = url;
        forward.clear();
        System.out.println("Visited" + currentUrl);
    }
    public void back()
    //should allow the user to navigate back to
    //the previous URL in the history
    {
        if (!back.isEmpty()) {
            forward.push(currentUrl);
            currentUrl = back.pop();
            System.out.println("Back to: " + currentUrl);
        } else {
            System.out.println("No history to go back to.");
        }

    }
    public void forward()
    //should allow the user to navigate forward
    {
         if(!forward.isEmpty()){
             back.push(currentUrl);
             currentUrl = forward.pop();
             System.out.println("Forward" + currentUrl);
         }
         else {
             System.out.println("No Forward history");
         }

    }


}
