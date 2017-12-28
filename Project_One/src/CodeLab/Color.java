package CodeLab;

public class Color {
int width, height, xPos, yPos;
    public String toString(){
        return "A" + width + "x" + height + " window at" +"(" + xPos+ "," + yPos+ ")";
    }

    public static void main(String[] args) {
        Color obj = new Color();
        System.out.println(obj);
    }

    }

