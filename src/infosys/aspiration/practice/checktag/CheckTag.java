package infosys.aspiration.practice.checktag;

import java.util.Stack;

/**
 *
 * @author Tintinmj
 */
public class CheckTag {
    
    private Stack<Character> tagContainer = new Stack<>();
    
    /**
     * 
     * @param HTMLtag HTML tag
     * @return no of tags which are not closed properly or wrongly placed
     */
    public int getWrongTag(final String HTMLtag) {
        
        if (HTMLtag == null || HTMLtag.length() == 0)
            return -1;
        
        int wrongTagCount = 0;
        for(int i = 0; i < HTMLtag.length(); i++) {
            
            // cases for OPENING TAG ----
            // opening tag... chill put it in stack.
            if(HTMLtag.charAt(i) == '<')
                tagContainer.push('<');
            
            //----------------------------------------------
            
            // cases for CLOSING TAG ----
            // no opening tag previously found so occurence of closing tag
            // is wrong.
            else if(tagContainer.empty() && 
                    HTMLtag.charAt(i) == '>')
                wrongTagCount++;
            
            // closing tag found and there is an opening tag found previously
            // so tags are properly closed.
            else if(HTMLtag.charAt(i) == '>' && 
                    tagContainer.peek() == '<')
                tagContainer.pop();
        }
        
        for(Character tag : tagContainer)
            wrongTagCount++;
        return wrongTagCount;
    }
}
