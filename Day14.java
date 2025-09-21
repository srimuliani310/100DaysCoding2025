package Day14;
public class StrinToPrimitif {
    public static void main(String [] args) {
        String strInt = "123";
        String strDouble = "45.67";
        String strBoolean = "true";
        String strChar = "Z";
        
        int angkaInt = Integer.parseInt(strInt);
        double angkaDouble = Double.parseDouble(strDouble);
        boolean nilaiBoolean = Boolean.parseBoolean(strBoolean);
        char huruf = strChar.charAt(0);
        System.out.println("String ke int     : " + angkaInt);
        System.out.println("String ke double  : " + angkaDouble);
        System.out.println("String ke boolean : " + nilaiBoolean);
        System.out.println("String ke char    : " + huruf);
    }
}
