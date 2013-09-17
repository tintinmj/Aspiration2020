/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.test.blackjack;

/**
 *
 * @author Tintinmj
 */
public class BlackJackTester {
    
    public static void main(String []args) {
        BlackJack player = new BlackJack();
        System.out.println(" A & A : " + player.hitOrStand('A', 'A'));
        System.out.println(" A & 2 : " + player.hitOrStand('A', '2'));
        System.out.println(" A & K : " + player.hitOrStand('A', 'K'));
        System.out.println(" A & 9 : " + player.hitOrStand('A', '9'));
        System.out.println(" K & 9 : " + player.hitOrStand('K', '9'));
        System.out.println(" K & 2 : " + player.hitOrStand('K', '2'));
        System.out.println(" 2 & K : " + player.hitOrStand('2', 'K'));
        System.out.println(" K & Q : " + player.hitOrStand('K', 'Q'));
        System.out.println(" K & 1 : " + player.hitOrStand('K', '1'));
        System.out.println(" Z & W : " + player.hitOrStand('Z', 'W'));
        System.out.println(" Q & K : " + player.hitOrStand('Q', 'K'));
        System.out.println(" J & 5 : " + player.hitOrStand('J', '5'));
        
    }
}
