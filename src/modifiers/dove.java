package modifiers;

/**
 * Created by expertzlab12 on 6/18/18.
 */
public class dove extends bird {
    String color = "ash";

    public void colorDisplay() {
        System.out.println("color:" + color);
        System.out.println("super color:"+super.color);
    }

    public static void main(String[] args) {
        dove d = new dove();
        d.colorDisplay();

    }
}


