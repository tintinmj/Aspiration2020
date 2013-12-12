package infosys.aspiration.practice.matchfinder;

/**
 *
 * @author Tintinmj
 */
public class MatchFinder {
    
    private static final String RELATIONS = "FLAMES";
    
    private String getFLAMESHelper(String name1, String name2) {
        if(name1 == null || name2 == null)
            return "Match Not Found";
        
        if(name1.equalsIgnoreCase(name2))
            return "FRIEND";
        
        else return "";
    }
    
    public String getRelation(String name1, String name2) {
        
        if(!"".equals(getFLAMESHelper(name1, name2)))
            return getFLAMESHelper(name1, name2);
        
        StringBuilder firstName = new StringBuilder(name1.toLowerCase());
        StringBuilder lastName  = new StringBuilder(name2.toLowerCase());
        
        for(int i = firstName.length() - 1; i >= 0 ; i--) {
            int lastNameCharIndex = lastName.indexOf(firstName.charAt(i)+"");
            if(lastNameCharIndex >= 0) {
                lastName  = lastName.deleteCharAt(lastNameCharIndex);
                firstName = firstName.deleteCharAt(i);
            }
        }
        
        String initial = getFlames(firstName.append(lastName).toString());
        return getRelationWithRespectToChar(initial.charAt(0));
    }
    
    private String getFlames(String combinedWord) {
        StringBuilder matcher = new StringBuilder(RELATIONS);
        int i = -1, totalCount = combinedWord.length();
        do {
            int c = 0;
            do {
                if(i == matcher.length()) {
                    i = 0;
                }
                if(c != 14) {
                    i++; c++;
                }
                if(c == 14) {
                    matcher.deleteCharAt(i);
                }
            } while(c != 14);
            i--;
        } while(matcher.length() != 1);
        
        return matcher.toString();
    }
    
    public String getRelationWithRespectToChar(char initial) {
        String relation;
        switch(initial) {
            case 'F' : relation = "Friend";         break;
            case 'L' : relation = "Love";           break;
            case 'A' : relation = "Affection";      break;
            case 'M' : relation = "Marriage";       break;
            case 'E' : relation = "Enemy";          break;
            case 'S' : relation = "Sister";         break;
            default  : relation = "NO-Relation";    break;
        }
        return relation;
    }
    
}
