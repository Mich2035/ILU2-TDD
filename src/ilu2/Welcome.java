package ilu2;

public class Welcome {
    
    public static String welcome(String input) {
        String[] mots = input.split(",\\s*");
        int x = mots.length;

        if (input.trim().isEmpty()) {
            return "Hello, my friend";
        }
        
        else if (input.equals(input.toUpperCase())) {
            return "HELLO, " + input.trim();
        }
        
        else if (x > 1) {
            String debut = "Hello, ";
            String fin = "";
            for (int i = 0; i < x; i++) {
                String word = mettreEnMajuscule(mots[i]);
                if (i == x - 1) {
                    fin += word;
                } else {
                    fin += word + ", ";
                }
            }
            return debut + fin;
        }
        
        else {
            String cap = mettreEnMajuscule(input);
            return "Hello, " + cap;
        }
    }
    
    private static String mettreEnMajuscule(String input) {
        String cap = input.substring(0, 1).toUpperCase() + input.substring(1);
        return cap;
    }
    
}
