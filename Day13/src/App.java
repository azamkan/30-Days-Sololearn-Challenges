public class App { 
    public static void main(String[] args) { //create a Loading object with the same name
        Loading loading = new Loading(); loading.LoadingMessage(); 
    } 
} 
class Loading { 
    public void LoadingMessage(){ 
        System.out.println("Loading"); 
    } 
}